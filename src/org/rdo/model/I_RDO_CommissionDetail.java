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

/** Generated Interface for RDO_CommissionDetail
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_RDO_CommissionDetail 
{

    /** TableName=RDO_CommissionDetail */
    public static final String Table_Name = "RDO_CommissionDetail";

    /** AD_Table_ID=1000003 */
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

    /** Column name C_Order_ID */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

	/** Set Order.
	  * Order
	  */
	public void setC_Order_ID (int C_Order_ID);

	/** Get Order.
	  * Order
	  */
	public int getC_Order_ID();

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException;

    /** Column name C_OrderLine_ID */
    public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";

	/** Set Sales Order Line.
	  * Sales Order Line
	  */
	public void setC_OrderLine_ID (int C_OrderLine_ID);

	/** Get Sales Order Line.
	  * Sales Order Line
	  */
	public int getC_OrderLine_ID();

	public org.compiere.model.I_C_OrderLine getC_OrderLine() throws RuntimeException;

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

    /** Column name LevelPercentage */
    public static final String COLUMNNAME_LevelPercentage = "LevelPercentage";

	/** Set LevelPercentage	  */
	public void setLevelPercentage (BigDecimal LevelPercentage);

	/** Get LevelPercentage	  */
	public BigDecimal getLevelPercentage();

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

    /** Column name RDO_CommissionAmt_ID */
    public static final String COLUMNNAME_RDO_CommissionAmt_ID = "RDO_CommissionAmt_ID";

	/** Set Commission Amount (ID)	  */
	public void setRDO_CommissionAmt_ID (int RDO_CommissionAmt_ID);

	/** Get Commission Amount (ID)	  */
	public int getRDO_CommissionAmt_ID();

	public I_RDO_CommissionAmt getRDO_CommissionAmt() throws RuntimeException;

    /** Column name RDO_CommissionDetail_ID */
    public static final String COLUMNNAME_RDO_CommissionDetail_ID = "RDO_CommissionDetail_ID";

	/** Set Commission Detail (ID)	  */
	public void setRDO_CommissionDetail_ID (int RDO_CommissionDetail_ID);

	/** Get Commission Detail (ID)	  */
	public int getRDO_CommissionDetail_ID();

    /** Column name RDO_CommissionDetail_UU */
    public static final String COLUMNNAME_RDO_CommissionDetail_UU = "RDO_CommissionDetail_UU";

	/** Set RDO_CommissionDetail_UU	  */
	public void setRDO_CommissionDetail_UU (String RDO_CommissionDetail_UU);

	/** Get RDO_CommissionDetail_UU	  */
	public String getRDO_CommissionDetail_UU();

    /** Column name RDO_MLM_Level_ID */
    public static final String COLUMNNAME_RDO_MLM_Level_ID = "RDO_MLM_Level_ID";

	/** Set MLM Level (ID)	  */
	public void setRDO_MLM_Level_ID (int RDO_MLM_Level_ID);

	/** Get MLM Level (ID)	  */
	public int getRDO_MLM_Level_ID();

	public I_RDO_MLM_Level getRDO_MLM_Level() throws RuntimeException;

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
