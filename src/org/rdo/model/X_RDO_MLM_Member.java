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
package org.rdo.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for RDO_MLM_Member
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_MLM_Member extends PO implements I_RDO_MLM_Member, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200422L;

    /** Standard Constructor */
    public X_RDO_MLM_Member (Properties ctx, int RDO_MLM_Member_ID, String trxName)
    {
      super (ctx, RDO_MLM_Member_ID, trxName);
      /** if (RDO_MLM_Member_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_RDO_MLM_Member (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RDO_MLM_Member[")
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

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_ValueNoCheck (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getParent() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getParent_ID(), get_TrxName());	}

	/** Set Parent.
		@param Parent_ID 
		Parent of Entity
	  */
	public void setParent_ID (int Parent_ID)
	{
		if (Parent_ID < 1) 
			set_Value (COLUMNNAME_Parent_ID, null);
		else 
			set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
	}

	/** Get Parent.
		@return Parent of Entity
	  */
	public int getParent_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Parent Share.
		@param Parent_ShareOfCustomer 
		Share of Customer's business as a percentage
	  */
	public void setParent_ShareOfCustomer (int Parent_ShareOfCustomer)
	{
		set_ValueNoCheck (COLUMNNAME_Parent_ShareOfCustomer, Integer.valueOf(Parent_ShareOfCustomer));
	}

	/** Get Parent Share.
		@return Share of Customer's business as a percentage
	  */
	public int getParent_ShareOfCustomer () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ShareOfCustomer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MLM_Member_ID.
		@param RDO_MLM_Member_ID RDO_MLM_Member_ID	  */
	public void setRDO_MLM_Member_ID (int RDO_MLM_Member_ID)
	{
		if (RDO_MLM_Member_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Member_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_MLM_Member_ID, Integer.valueOf(RDO_MLM_Member_ID));
	}

	/** Get RDO_MLM_Member_ID.
		@return RDO_MLM_Member_ID	  */
	public int getRDO_MLM_Member_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_MLM_Member_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MLM_Member_UU.
		@param RDO_MLM_Member_UU RDO_MLM_Member_UU	  */
	public void setRDO_MLM_Member_UU (String RDO_MLM_Member_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_MLM_Member_UU, RDO_MLM_Member_UU);
	}

	/** Get RDO_MLM_Member_UU.
		@return RDO_MLM_Member_UU	  */
	public String getRDO_MLM_Member_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MLM_Member_UU);
	}

	public org.compiere.model.I_C_BPartner getRef_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getRef_BPartner_ID(), get_TrxName());	}

	/** Set Reference Partner.
		@param Ref_BPartner_ID Reference Partner	  */
	public void setRef_BPartner_ID (int Ref_BPartner_ID)
	{
		if (Ref_BPartner_ID < 1) 
			set_Value (COLUMNNAME_Ref_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_Ref_BPartner_ID, Integer.valueOf(Ref_BPartner_ID));
	}

	/** Get Reference Partner.
		@return Reference Partner	  */
	public int getRef_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Ref_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Share.
		@param ShareOfCustomer 
		Share of Customer's business as a percentage
	  */
	public void setShareOfCustomer (int ShareOfCustomer)
	{
		set_ValueNoCheck (COLUMNNAME_ShareOfCustomer, Integer.valueOf(ShareOfCustomer));
	}

	/** Get Share.
		@return Share of Customer's business as a percentage
	  */
	public int getShareOfCustomer () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShareOfCustomer);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}