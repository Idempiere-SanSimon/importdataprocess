package net.frontuari.model;

import java.sql.ResultSet;
import java.util.Optional;
import java.util.Properties;

import org.compiere.model.MExpenseType;
import org.compiere.model.MProduct;
import org.compiere.model.MResource;
import org.compiere.model.MResourceType;
import org.compiere.model.X_I_Product;

public class MFTUProduct extends MProduct {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MFTUProduct(Properties ctx, int M_Product_ID, String trxName) {
		super(ctx, M_Product_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MFTUProduct(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MFTUProduct(MExpenseType et) {
		super(et);
		// TODO Auto-generated constructor stub
	}

	public MFTUProduct(MResource resource, MResourceType resourceType) {
		super(resource, resourceType);
		// TODO Auto-generated constructor stub
	}

	public MFTUProduct(X_I_Product impP) {
		this (impP.getCtx(), 0, impP.get_TrxName());
		setClientOrg(impP);
		setUpdatedBy(impP.getUpdatedBy());
		//
		setValue(Optional.ofNullable(impP.getValue()).orElse(""));
		setName(impP.getName());
		setDescription(impP.getDescription());
		setDocumentNote(impP.getDocumentNote());
		setHelp(impP.getHelp());
		setUPC(impP.getUPC());
		setSKU(impP.getSKU());
		setC_UOM_ID(impP.getC_UOM_ID());
		setM_Product_Category_ID(impP.getM_Product_Category_ID());
		setProductType(impP.getProductType());
		setImageURL(impP.getImageURL());
		setDescriptionURL(impP.getDescriptionURL());
		setVolume(impP.getVolume());
		setWeight(impP.getWeight());
	}

}
