/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Copyright (C) 2021 Frontuari and contributors (see README.md file).
 */

package net.frontuari.component;


import net.frontuari.base.CustomModelFactory;
import net.frontuari.model.FTUMInventoryLine;
import net.frontuari.model.X_I_DiscountSchema;
import net.frontuari.model.X_I_Employee;
import net.frontuari.model.X_I_Forecast;
import net.frontuari.model.X_I_InOut;
import net.frontuari.model.X_I_Product_BOM;
import net.frontuari.model.X_I_Requisition;

/**
 * Model Factory
 */
public class ModelFactory extends CustomModelFactory {

	/**
	 * For initialize class. Register the models to build
	 * 
	 * <pre>
	 * protected void initialize() {
	 * 	registerModel(MTableExample.Table_Name, MTableExample.class);
	 * }
	 * </pre>
	 */
	@Override
	protected void initialize() {
		registerModel(X_I_DiscountSchema.Table_Name, X_I_DiscountSchema.class);
		registerModel(X_I_Employee.Table_Name, X_I_Employee.class);
		registerModel(X_I_InOut.Table_Name, X_I_InOut.class);
		registerModel(X_I_Product_BOM.Table_Name, X_I_Product_BOM.class);
		registerModel(X_I_Requisition.Table_Name, X_I_Requisition.class);
		registerModel(X_I_Forecast.Table_Name, X_I_Forecast.class);
		registerModel(FTUMInventoryLine.Table_Name, FTUMInventoryLine.class);
	}

}
