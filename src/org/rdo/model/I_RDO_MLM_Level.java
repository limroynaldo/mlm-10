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

/** Generated Interface for RDO_MLM_Level
 *  @author iDempiere (generated) 
 *  @version Release 7.1
 */
@SuppressWarnings("all")
public interface I_RDO_MLM_Level 
{

    /** TableName=RDO_MLM_Level */
    public static final String Table_Name = "RDO_MLM_Level";

    /** AD_Table_ID=1000000 */
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

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name M_ProductPrice_ID */
    public static final String COLUMNNAME_M_ProductPrice_ID = "M_ProductPrice_ID";

	/** Set Product Price.
	  * Intersection between a Product and a Price List Version
	  */
	public void setM_ProductPrice_ID (int M_ProductPrice_ID);

	/** Get Product Price.
	  * Intersection between a Product and a Price List Version
	  */
	public int getM_ProductPrice_ID();

	public org.compiere.model.I_M_ProductPrice getM_ProductPrice() throws RuntimeException;

    /** Column name RDO_MLM_Level_ID */
    public static final String COLUMNNAME_RDO_MLM_Level_ID = "RDO_MLM_Level_ID";

	/** Set RDO_MLM_Level_ID	  */
	public void setRDO_MLM_Level_ID (int RDO_MLM_Level_ID);

	/** Get RDO_MLM_Level_ID	  */
	public int getRDO_MLM_Level_ID();

    /** Column name RDO_MLM_Level_UU */
    public static final String COLUMNNAME_RDO_MLM_Level_UU = "RDO_MLM_Level_UU";

	/** Set RDO_MLM_Level_UU	  */
	public void setRDO_MLM_Level_UU (String RDO_MLM_Level_UU);

	/** Get RDO_MLM_Level_UU	  */
	public String getRDO_MLM_Level_UU();

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
