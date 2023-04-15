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

/** Generated Interface for RDO_TradingAccount
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_RDO_TradingAccount 
{

    /** TableName=RDO_TradingAccount */
    public static final String Table_Name = "RDO_TradingAccount";

    /** AD_Table_ID=1000005 */
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

    /** Column name LineNo */
    public static final String COLUMNNAME_LineNo = "LineNo";

	/** Set Line.
	  * Line No
	  */
	public void setLineNo (int LineNo);

	/** Get Line.
	  * Line No
	  */
	public int getLineNo();

    /** Column name RDO_MT_Server */
    public static final String COLUMNNAME_RDO_MT_Server = "RDO_MT_Server";

	/** Set RDO_MT_Server	  */
	public void setRDO_MT_Server (String RDO_MT_Server);

	/** Get RDO_MT_Server	  */
	public String getRDO_MT_Server();

    /** Column name RDO_MT_Username */
    public static final String COLUMNNAME_RDO_MT_Username = "RDO_MT_Username";

	/** Set RDO_MT_Username	  */
	public void setRDO_MT_Username (String RDO_MT_Username);

	/** Get RDO_MT_Username	  */
	public String getRDO_MT_Username();

    /** Column name RDO_Password */
    public static final String COLUMNNAME_RDO_Password = "RDO_Password";

	/** Set RDO_Password	  */
	public void setRDO_Password (String RDO_Password);

	/** Get RDO_Password	  */
	public String getRDO_Password();

    /** Column name RDO_TradingAccount_ID */
    public static final String COLUMNNAME_RDO_TradingAccount_ID = "RDO_TradingAccount_ID";

	/** Set Trading Account (ID)	  */
	public void setRDO_TradingAccount_ID (int RDO_TradingAccount_ID);

	/** Get Trading Account (ID)	  */
	public int getRDO_TradingAccount_ID();

    /** Column name RDO_TradingAccount_UU */
    public static final String COLUMNNAME_RDO_TradingAccount_UU = "RDO_TradingAccount_UU";

	/** Set RDO_TradingAccount_UU	  */
	public void setRDO_TradingAccount_UU (String RDO_TradingAccount_UU);

	/** Get RDO_TradingAccount_UU	  */
	public String getRDO_TradingAccount_UU();

    /** Column name Ref_BPartner_ID */
    public static final String COLUMNNAME_Ref_BPartner_ID = "Ref_BPartner_ID";

	/** Set Reference Partner	  */
	public void setRef_BPartner_ID (int Ref_BPartner_ID);

	/** Get Reference Partner	  */
	public int getRef_BPartner_ID();

	public org.compiere.model.I_C_BPartner getRef_BPartner() throws RuntimeException;

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
