package net.frontuari.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import net.frontuari.process.ImportPayment;

public class FTUImportDataProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {
		
		if(className.equals("net.frontuari.process.ImportPayment"))
			return new ImportPayment();
		
		return null;
	}

}
