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
 * Copyright (C) 2020 Frontuari, C.A. <http://frontuari.net> and contributors (see README.md file).
 */

package net.frontuari.component;

import net.frontuari.base.FTUProcessFactory;
import net.frontuari.process.ImportBPBankAccount;
import net.frontuari.process.ImportBPartner;
import net.frontuari.process.ImportDiscountSchema;
import net.frontuari.process.ImportEmployee;
import net.frontuari.process.ImportForecast;
import net.frontuari.process.ImportGLJournal;
import net.frontuari.process.ImportInOut;
import net.frontuari.process.ImportInventory;
import net.frontuari.process.ImportInvoice;
import net.frontuari.process.ImportOrder;
import net.frontuari.process.ImportPayment;
import net.frontuari.process.ImportPriceList;
import net.frontuari.process.ImportProduct;
import net.frontuari.process.ImportProductBOM;
import net.frontuari.process.ImportRequisition;

/**
 * Process Factory
 */
public class ProcessFactory extends FTUProcessFactory {

	/**
	 * For initialize class. Register the process to build
	 * 
	 * <pre>
	 * protected void initialize() {
	 * 	registerProcess(PPrintPluginInfo.class);
	 * }
	 * </pre>
	 */
	@Override
	protected void initialize() {
		registerProcess(ImportBPartner.class);
		registerProcess(ImportBPBankAccount.class);
		registerProcess(ImportDiscountSchema.class);
		registerProcess(ImportEmployee.class);
		registerProcess(ImportGLJournal.class);
		registerProcess(ImportInOut.class);
		registerProcess(ImportInventory.class);
		registerProcess(ImportInvoice.class);
		registerProcess(ImportOrder.class);
		registerProcess(ImportPayment.class);
		registerProcess(ImportPriceList.class);
		registerProcess(ImportProduct.class);
		registerProcess(ImportProductBOM.class);
		registerProcess(ImportRequisition.class);
		registerProcess(ImportForecast.class);
	}

}
