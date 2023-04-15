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

/** Generated Interface for RDO_TradingAccountBalance
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_RDO_TradingAccountBalance 
{

    /** TableName=RDO_TradingAccountBalance */
    public static final String Table_Name = "RDO_TradingAccountBalance";

    /** AD_Table_ID=1000012 */
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

    /** Column name DateTrx */
    public static final String COLUMNNAME_DateTrx = "DateTrx";

	/** Set Transaction Date.
	  * Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx);

	/** Get Transaction Date.
	  * Transaction Date
	  */
	public Timestamp getDateTrx();

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

    /** Column name RDO_TradingAccountBalance_ID */
    public static final String COLUMNNAME_RDO_TradingAccountBalance_ID = "RDO_TradingAccountBalance_ID";

	/** Set Trading Account Balance (ID)	  */
	public void setRDO_TradingAccountBalance_ID (int RDO_TradingAccountBalance_ID);

	/** Get Trading Account Balance (ID)	  */
	public int getRDO_TradingAccountBalance_ID();

    /** Column name RDO_TradingAccountBalance_UU */
    public static final String COLUMNNAME_RDO_TradingAccountBalance_UU = "RDO_TradingAccountBalance_UU";

	/** Set RDO_TradingAccountBalance_UU	  */
	public void setRDO_TradingAccountBalance_UU (String RDO_TradingAccountBalance_UU);

	/** Get RDO_TradingAccountBalance_UU	  */
	public String getRDO_TradingAccountBalance_UU();

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
