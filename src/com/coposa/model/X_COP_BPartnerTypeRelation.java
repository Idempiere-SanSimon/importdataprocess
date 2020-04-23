/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.coposa.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for COP_BPartnerTypeRelation
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_COP_BPartnerTypeRelation extends PO implements I_COP_BPartnerTypeRelation, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200423L;

    /** Standard Constructor */
    public X_COP_BPartnerTypeRelation (Properties ctx, int COP_BPartnerTypeRelation_ID, String trxName)
    {
      super (ctx, COP_BPartnerTypeRelation_ID, trxName);
      /** if (COP_BPartnerTypeRelation_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_COP_BPartnerTypeRelation (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_COP_BPartnerTypeRelation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_COP_BPartnerTypeRelation getCOP_BPartnerTypeRelation() throws RuntimeException
    {
		return (I_COP_BPartnerTypeRelation)MTable.get(getCtx(), I_COP_BPartnerTypeRelation.Table_Name)
			.getPO(getCOP_BPartnerType_ID(), get_TrxName());	}

	/** Set Business Partner Type.
		@param COP_BPartnerType_ID 
		Identifies a Business Partner Type
	  */
	public void setCOP_BPartnerType_ID (int COP_BPartnerType_ID)
	{
		if (COP_BPartnerType_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COP_BPartnerType_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COP_BPartnerType_ID, Integer.valueOf(COP_BPartnerType_ID));
	}

	/** Get Business Partner Type.
		@return Identifies a Business Partner Type
	  */
	public int getCOP_BPartnerType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COP_BPartnerType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set COP_BPartnerTypeRelation_ID.
		@param COP_BPartnerTypeRelation_ID COP_BPartnerTypeRelation_ID	  */
	public void setCOP_BPartnerTypeRelation_ID (int COP_BPartnerTypeRelation_ID)
	{
		if (COP_BPartnerTypeRelation_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_COP_BPartnerTypeRelation_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_COP_BPartnerTypeRelation_ID, Integer.valueOf(COP_BPartnerTypeRelation_ID));
	}

	/** Get COP_BPartnerTypeRelation_ID.
		@return COP_BPartnerTypeRelation_ID	  */
	public int getCOP_BPartnerTypeRelation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_COP_BPartnerTypeRelation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set COP_BPartnerTypeRelation_UU.
		@param COP_BPartnerTypeRelation_UU COP_BPartnerTypeRelation_UU	  */
	public void setCOP_BPartnerTypeRelation_UU (String COP_BPartnerTypeRelation_UU)
	{
		set_ValueNoCheck (COLUMNNAME_COP_BPartnerTypeRelation_UU, COP_BPartnerTypeRelation_UU);
	}

	/** Get COP_BPartnerTypeRelation_UU.
		@return COP_BPartnerTypeRelation_UU	  */
	public String getCOP_BPartnerTypeRelation_UU () 
	{
		return (String)get_Value(COLUMNNAME_COP_BPartnerTypeRelation_UU);
	}

	@Override
	public I_COP_BPartnerTypeRelation getCOP_BPartnerType() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}
}