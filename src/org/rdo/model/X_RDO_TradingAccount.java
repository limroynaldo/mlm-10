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

/** Generated Model for RDO_TradingAccount
 *  @author iDempiere (generated) 
 *  @version Release 7.1 - $Id$ */
public class X_RDO_TradingAccount extends PO implements I_RDO_TradingAccount, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200510L;

    /** Standard Constructor */
    public X_RDO_TradingAccount (Properties ctx, int RDO_TradingAccount_ID, String trxName)
    {
      super (ctx, RDO_TradingAccount_ID, trxName);
      /** if (RDO_TradingAccount_ID == 0)
        {
			setLineNo (0);
// @SQL=SELECT COALESCE(MAX(LineNo),0)+10 AS DefaultValue FROM RDO_TradingAccount WHERE C_BPartner_ID=@C_BPartner_ID@
        } */
    }

    /** Load Constructor */
    public X_RDO_TradingAccount (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_RDO_TradingAccount[")
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

	/** Set Line.
		@param LineNo 
		Line No
	  */
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_MT_Server.
		@param RDO_MT_Server RDO_MT_Server	  */
	public void setRDO_MT_Server (String RDO_MT_Server)
	{
		set_Value (COLUMNNAME_RDO_MT_Server, RDO_MT_Server);
	}

	/** Get RDO_MT_Server.
		@return RDO_MT_Server	  */
	public String getRDO_MT_Server () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MT_Server);
	}

	/** Set RDO_MT_Username.
		@param RDO_MT_Username RDO_MT_Username	  */
	public void setRDO_MT_Username (String RDO_MT_Username)
	{
		set_Value (COLUMNNAME_RDO_MT_Username, RDO_MT_Username);
	}

	/** Get RDO_MT_Username.
		@return RDO_MT_Username	  */
	public String getRDO_MT_Username () 
	{
		return (String)get_Value(COLUMNNAME_RDO_MT_Username);
	}

	/** Set RDO_Password.
		@param RDO_Password RDO_Password	  */
	public void setRDO_Password (String RDO_Password)
	{
		set_Value (COLUMNNAME_RDO_Password, RDO_Password);
	}

	/** Get RDO_Password.
		@return RDO_Password	  */
	public String getRDO_Password () 
	{
		return (String)get_Value(COLUMNNAME_RDO_Password);
	}

	/** Set Trading Account (ID).
		@param RDO_TradingAccount_ID Trading Account (ID)	  */
	public void setRDO_TradingAccount_ID (int RDO_TradingAccount_ID)
	{
		if (RDO_TradingAccount_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccount_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_RDO_TradingAccount_ID, Integer.valueOf(RDO_TradingAccount_ID));
	}

	/** Get Trading Account (ID).
		@return Trading Account (ID)	  */
	public int getRDO_TradingAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_RDO_TradingAccount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set RDO_TradingAccount_UU.
		@param RDO_TradingAccount_UU RDO_TradingAccount_UU	  */
	public void setRDO_TradingAccount_UU (String RDO_TradingAccount_UU)
	{
		set_ValueNoCheck (COLUMNNAME_RDO_TradingAccount_UU, RDO_TradingAccount_UU);
	}

	/** Get RDO_TradingAccount_UU.
		@return RDO_TradingAccount_UU	  */
	public String getRDO_TradingAccount_UU () 
	{
		return (String)get_Value(COLUMNNAME_RDO_TradingAccount_UU);
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
}