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
package net.frontuari.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for I_DiscountSchema
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_I_DiscountSchema 
{

    /** TableName=I_DiscountSchema */
    public static final String Table_Name = "I_DiscountSchema";

    /** AD_Table_ID=1000179 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_OrgTrx_ID */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/** Set Trx Organization.
	  * Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID);

	/** Get Trx Organization.
	  * Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID();

    /** Column name BPartner_Value */
    public static final String COLUMNNAME_BPartner_Value = "BPartner_Value";

	/** Set Business Partner Key.
	  * The Key of the Business Partner
	  */
	public void setBPartner_Value (String BPartner_Value);

	/** Get Business Partner Key.
	  * The Key of the Business Partner
	  */
	public String getBPartner_Value();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_ConversionType_ID */
    public static final String COLUMNNAME_C_ConversionType_ID = "C_ConversionType_ID";

	/** Set Currency Type.
	  * Currency Conversion Rate Type
	  */
	public void setC_ConversionType_ID (int C_ConversionType_ID);

	/** Get Currency Type.
	  * Currency Conversion Rate Type
	  */
	public int getC_ConversionType_ID();

	public org.compiere.model.I_C_ConversionType getC_ConversionType() throws RuntimeException;

    /** Column name Classification */
    public static final String COLUMNNAME_Classification = "Classification";

	/** Set Classification.
	  * Classification for grouping
	  */
	public void setClassification (String Classification);

	/** Get Classification.
	  * Classification for grouping
	  */
	public String getClassification();

    /** Column name ConversionDate */
    public static final String COLUMNNAME_ConversionDate = "ConversionDate";

	/** Set Conversion Date.
	  * Date for selecting conversion rate
	  */
	public void setConversionDate (Timestamp ConversionDate);

	/** Get Conversion Date.
	  * Date for selecting conversion rate
	  */
	public Timestamp getConversionDate();

    /** Column name ConversionTypeValue */
    public static final String COLUMNNAME_ConversionTypeValue = "ConversionTypeValue";

	/** Set Currency Type Key.
	  * Key value for the Currency Conversion Rate Type
	  */
	public void setConversionTypeValue (String ConversionTypeValue);

	/** Get Currency Type Key.
	  * Key value for the Currency Conversion Rate Type
	  */
	public String getConversionTypeValue();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DiscountType */
    public static final String COLUMNNAME_DiscountType = "DiscountType";

	/** Set Discount Type.
	  * Type of trade discount calculation
	  */
	public void setDiscountType (String DiscountType);

	/** Get Discount Type.
	  * Type of trade discount calculation
	  */
	public String getDiscountType();

    /** Column name FTU_ProductClassifications2_ID */
   // public static final String COLUMNNAME_FTU_ProductClassifications2_ID = "FTU_ProductClassifications2_ID";

	/** Set FTU_ProductClassifications2_ID	  */
	//public void setFTU_ProductClassifications2_ID (int FTU_ProductClassifications2_ID);

	/** Get FTU_ProductClassifications2_ID	  */
	//public int getFTU_ProductClassifications2_ID();

	//public org.frontuari.model.I_FTU_ProductClassifications getFTU_ProductClassifications2() throws RuntimeException;

    /** Column name ftu_productclassifications2_va */
   // public static final String COLUMNNAME_ftu_productclassifications2_va = "ftu_productclassifications2_va";

	/** Set ftu_productclassifications2_value	  */
	//public void setftu_productclassifications2_va (String ftu_productclassifications2_va);

	/** Get ftu_productclassifications2_value	  */
	//public String getftu_productclassifications2_va();

    /** Column name FTU_ProductClassifications3_ID */
    //public static final String COLUMNNAME_FTU_ProductClassifications3_ID = "FTU_ProductClassifications3_ID";

	/** Set FTU_ProductClassifications3_ID	  */
	//public void setFTU_ProductClassifications3_ID (int FTU_ProductClassifications3_ID);

	/** Get FTU_ProductClassifications3_ID	  */
	//public int getFTU_ProductClassifications3_ID();

	//public org.frontuari.model.I_FTU_ProductClassifications getFTU_ProductClassifications3() throws RuntimeException;

    /** Column name ftu_productclassifications3_va */
   // public static final String COLUMNNAME_ftu_productclassifications3_va = "ftu_productclassifications3_va";

	/** Set ftu_productclassifications3_value	  */
	//public void setftu_productclassifications3_va (String ftu_productclassifications3_va);

	/** Get ftu_productclassifications3_value	  */
	//public String getftu_productclassifications3_va();

    /** Column name FTU_ProductClassifications_ID */
   // public static final String COLUMNNAME_FTU_ProductClassifications_ID = "FTU_ProductClassifications_ID";

	/** Set Product Classifications	  */
	//public void setFTU_ProductClassifications_ID (int FTU_ProductClassifications_ID);

	/** Get Product Classifications	  */
	//public int getFTU_ProductClassifications_ID();

	//public org.frontuari.model.I_FTU_ProductClassifications getFTU_ProductClassifications() throws RuntimeException;

    /** Column name ftu_productclassifications_val */
   // public static final String COLUMNNAME_ftu_productclassifications_val = "ftu_productclassifications_val";

	/** Set ftu_productclassifications_value	  */
	//public void setftu_productclassifications_val (String ftu_productclassifications_val);

	/** Get ftu_productclassifications_value	  */
	//public String getftu_productclassifications_val();

    /** Column name Group1 */
    public static final String COLUMNNAME_Group1 = "Group1";

	/** Set Group1	  */
	public void setGroup1 (String Group1);

	/** Get Group1	  */
	public String getGroup1();

    /** Column name Group2 */
    public static final String COLUMNNAME_Group2 = "Group2";

	/** Set Group2	  */
	public void setGroup2 (String Group2);

	/** Get Group2	  */
	public String getGroup2();

    /** Column name I_DiscountSchema_ID */
    public static final String COLUMNNAME_I_DiscountSchema_ID = "I_DiscountSchema_ID";

	/** Set I_DiscountSchema_ID	  */
	public void setI_DiscountSchema_ID (int I_DiscountSchema_ID);

	/** Get I_DiscountSchema_ID	  */
	public int getI_DiscountSchema_ID();

    /** Column name I_DiscountSchema_UU */
    public static final String COLUMNNAME_I_DiscountSchema_UU = "I_DiscountSchema_UU";

	/** Set I_DiscountSchema_UU	  */
	public void setI_DiscountSchema_UU (String I_DiscountSchema_UU);

	/** Get I_DiscountSchema_UU	  */
	public String getI_DiscountSchema_UU();

    /** Column name I_ErrorMsg */
    public static final String COLUMNNAME_I_ErrorMsg = "I_ErrorMsg";

	/** Set Import Error Message.
	  * Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg);

	/** Get Import Error Message.
	  * Messages generated from import process
	  */
	public String getI_ErrorMsg();

    /** Column name I_IsImported */
    public static final String COLUMNNAME_I_IsImported = "I_IsImported";

	/** Set Imported.
	  * Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported);

	/** Get Imported.
	  * Has this import been processed
	  */
	public boolean isI_IsImported();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsSOPriceList */
    public static final String COLUMNNAME_IsSOPriceList = "IsSOPriceList";

	/** Set Sales Price list.
	  * This is a Sales Price List
	  */
	public void setIsSOPriceList (boolean IsSOPriceList);

	/** Get Sales Price list.
	  * This is a Sales Price List
	  */
	public boolean isSOPriceList();

    /** Column name Limit_Base */
    public static final String COLUMNNAME_Limit_Base = "Limit_Base";

	/** Set Limit price Base.
	  * Base price for calculation of the new price
	  */
	public void setLimit_Base (String Limit_Base);

	/** Get Limit price Base.
	  * Base price for calculation of the new price
	  */
	public String getLimit_Base();

    /** Column name Limit_Discount */
    public static final String COLUMNNAME_Limit_Discount = "Limit_Discount";

	/** Set Limit price Discount %.
	  * Discount in percent to be subtracted from base, if negative it will be added to base price
	  */
	public void setLimit_Discount (BigDecimal Limit_Discount);

	/** Get Limit price Discount %.
	  * Discount in percent to be subtracted from base, if negative it will be added to base price
	  */
	public BigDecimal getLimit_Discount();

    /** Column name Limit_Rounding */
    public static final String COLUMNNAME_Limit_Rounding = "Limit_Rounding";

	/** Set Limit price Rounding.
	  * Rounding of the final result
	  */
	public void setLimit_Rounding (String Limit_Rounding);

	/** Get Limit price Rounding.
	  * Rounding of the final result
	  */
	public String getLimit_Rounding();

    /** Column name List_Base */
    public static final String COLUMNNAME_List_Base = "List_Base";

	/** Set List price Base.
	  * Price used as the basis for price list calculations
	  */
	public void setList_Base (String List_Base);

	/** Get List price Base.
	  * Price used as the basis for price list calculations
	  */
	public String getList_Base();

    /** Column name List_Discount */
    public static final String COLUMNNAME_List_Discount = "List_Discount";

	/** Set List price Discount %.
	  * Discount from list price as a percentage
	  */
	public void setList_Discount (BigDecimal List_Discount);

	/** Get List price Discount %.
	  * Discount from list price as a percentage
	  */
	public BigDecimal getList_Discount();

    /** Column name List_Rounding */
    public static final String COLUMNNAME_List_Rounding = "List_Rounding";

	/** Set List price Rounding.
	  * Rounding rule for final list price
	  */
	public void setList_Rounding (String List_Rounding);

	/** Get List price Rounding.
	  * Rounding rule for final list price
	  */
	public String getList_Rounding();

    /** Column name M_DiscountSchema_ID */
    public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";

	/** Set Discount Schema.
	  * Schema to calculate the trade discount percentage
	  */
	public void setM_DiscountSchema_ID (int M_DiscountSchema_ID);

	/** Get Discount Schema.
	  * Schema to calculate the trade discount percentage
	  */
	public int getM_DiscountSchema_ID();

	public org.compiere.model.I_M_DiscountSchema getM_DiscountSchema() throws RuntimeException;

    /** Column name M_DiscountSchemaLine_ID */
    public static final String COLUMNNAME_M_DiscountSchemaLine_ID = "M_DiscountSchemaLine_ID";

	/** Set Discount Pricelist.
	  * Line of the pricelist trade discount schema
	  */
	public void setM_DiscountSchemaLine_ID (int M_DiscountSchemaLine_ID);

	/** Get Discount Pricelist.
	  * Line of the pricelist trade discount schema
	  */
	public int getM_DiscountSchemaLine_ID();

	public org.compiere.model.I_M_DiscountSchemaLine getM_DiscountSchemaLine() throws RuntimeException;

    /** Column name M_Product_Category_ID */
    public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";

	/** Set Product Category.
	  * Category of a Product
	  */
	public void setM_Product_Category_ID (int M_Product_Category_ID);

	/** Get Product Category.
	  * Category of a Product
	  */
	public int getM_Product_Category_ID();

	public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name OrgName */
    public static final String COLUMNNAME_OrgName = "OrgName";

	/** Set Organization Name.
	  * Name of the Organization
	  */
	public void setOrgName (String OrgName);

	/** Get Organization Name.
	  * Name of the Organization
	  */
	public String getOrgName();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name ProductCategory_Value */
    public static final String COLUMNNAME_ProductCategory_Value = "ProductCategory_Value";

	/** Set Product Category Key	  */
	public void setProductCategory_Value (String ProductCategory_Value);

	/** Get Product Category Key	  */
	public String getProductCategory_Value();

    /** Column name ProductName */
    public static final String COLUMNNAME_ProductName = "ProductName";

	/** Set Product Name.
	  * Name of the Product
	  */
	public void setProductName (String ProductName);

	/** Get Product Name.
	  * Name of the Product
	  */
	public String getProductName();

    /** Column name SKU */
    public static final String COLUMNNAME_SKU = "SKU";

	/** Set SKU.
	  * Stock Keeping Unit
	  */
	public void setSKU (String SKU);

	/** Get SKU.
	  * Stock Keeping Unit
	  */
	public String getSKU();

    /** Column name Std_Base */
    public static final String COLUMNNAME_Std_Base = "Std_Base";

	/** Set Standard price Base.
	  * Base price for calculating new standard price
	  */
	public void setStd_Base (String Std_Base);

	/** Get Standard price Base.
	  * Base price for calculating new standard price
	  */
	public String getStd_Base();

    /** Column name Std_Discount */
    public static final String COLUMNNAME_Std_Discount = "Std_Discount";

	/** Set Standard price Discount %.
	  * Discount percentage to subtract from base price
	  */
	public void setStd_Discount (BigDecimal Std_Discount);

	/** Get Standard price Discount %.
	  * Discount percentage to subtract from base price
	  */
	public BigDecimal getStd_Discount();

    /** Column name Std_Rounding */
    public static final String COLUMNNAME_Std_Rounding = "Std_Rounding";

	/** Set Standard price Rounding.
	  * Rounding rule for calculated price
	  */
	public void setStd_Rounding (String Std_Rounding);

	/** Get Standard price Rounding.
	  * Rounding rule for calculated price
	  */
	public String getStd_Rounding();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name ValidFrom */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";

	/** Set Valid from.
	  * Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom);

	/** Get Valid from.
	  * Valid from including this date (first day)
	  */
	public Timestamp getValidFrom();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
