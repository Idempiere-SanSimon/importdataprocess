package net.frontuari.events;

import org.adempiere.base.event.IEventTopics;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MElementValue;
import org.compiere.model.MJournalLine;
import org.compiere.model.MSysConfig;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

import net.frontuari.base.FTUEvent;


public class FTUImportDataProcessEvents extends FTUEvent{
	private static CLogger log = CLogger.getCLogger(FTUImportDataProcessEvents.class);
	@Override
	protected void doHandleEvent() {
		PO po = getPO();
		String type = getEventType();
		log.info(po + " Type: " + type);

			/** **/
		if (po.get_TableName().equals(MJournalLine.Table_Name)) {
			MJournalLine line = (MJournalLine) po;
			if (type.equals(IEventTopics.PO_BEFORE_NEW) || type.equals(IEventTopics.PO_BEFORE_CHANGE)) {
				if (MSysConfig.getBooleanValue("checkInitialAccountNo", false, line.getAD_Client_ID()) && line.getAccount_ID()>0 && line.getC_Activity_ID() > 0 && line.getUser1_ID() > 0) {
				MElementValue ev = new MElementValue(line.getCtx(), line.getAccount_ID(), line.get_TrxName());
				String values = DB.getSQLValueString(line.get_TrxName(), "SELECT AccountValue FROM FTU_Activity_User1_Access WHERE "
						+ " C_Activity_ID = ? AND User1_ID = ? ", line.getC_Activity_ID(), line.getUser1_ID());
				
						boolean validAcc = false;
						if (values != null) {
						String [] numbers = values.split(",");
						String initialNo = ev.getValue().substring(0, 2);
						
							if (numbers.length > 0)
							for (String noAcc : numbers) {
							
									if (noAcc.equals(initialNo)) {
										validAcc = true;
									}
							}
					}
						if (!validAcc)
							throw new AdempiereException("Números iniciales de la cuenta inválidos");
				}				
			}
		}
		
	}

}
