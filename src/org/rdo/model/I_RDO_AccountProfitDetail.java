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
package org.rdo.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for RDO_AccountProfitDetail
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_RDO_AccountProfitDetail 
{

    /** TableName=RDO_AccountProfitDetail */
    public static final String Table_Name = "RDO_AccountProfitDetail";

    /** AD_Table_ID=1000010 */
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

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

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

    /** Column name RDO_AccountProfitDetail_ID */
    public static final String COLUMNNAME_RDO_AccountProfitDetail_ID = "RDO_AccountProfitDetail_ID";

	/** Set Profit Detail (ID)	  */
	public void setRDO_AccountProfitDetail_ID (int RDO_AccountProfitDetail_ID);

	/** Get Profit Detail (ID)	  */
	public int getRDO_AccountProfitDetail_ID();

    /** Column name RDO_AccountProfitDetail_UU */
    public static final String COLUMNNAME_RDO_AccountProfitDetail_UU = "RDO_AccountProfitDetail_UU";

	/** Set RDO_AccountProfitDetail_UU	  */
	public void setRDO_AccountProfitDetail_UU (String RDO_AccountProfitDetail_UU);

	/** Get RDO_AccountProfitDetail_UU	  */
	public String getRDO_AccountProfitDetail_UU();

    /** Column name RDO_AccountProfit_ID */
    public static final String COLUMNNAME_RDO_AccountProfit_ID = "RDO_AccountProfit_ID";

	/** Set Account Profit (ID)	  */
	public void setRDO_AccountProfit_ID (int RDO_AccountProfit_ID);

	/** Get Account Profit (ID)	  */
	public int getRDO_AccountProfit_ID();

	public I_RDO_AccountProfit getRDO_AccountProfit() throws RuntimeException;

    /** Column name RDO_MT_Username */
    public static final String COLUMNNAME_RDO_MT_Username = "RDO_MT_Username";

	/** Set RDO_MT_Username	  */
	public void setRDO_MT_Username (String RDO_MT_Username);

	/** Get RDO_MT_Username	  */
	public String getRDO_MT_Username();

    /** Column name RDO_TradingAccount_ID */
    public static final String COLUMNNAME_RDO_TradingAccount_ID = "RDO_TradingAccount_ID";

	/** Set Trading Account (ID)	  */
	public void setRDO_TradingAccount_ID (int RDO_TradingAccount_ID);

	/** Get Trading Account (ID)	  */
	public int getRDO_TradingAccount_ID();

	public I_RDO_TradingAccount getRDO_TradingAccount() throws RuntimeException;

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
}
