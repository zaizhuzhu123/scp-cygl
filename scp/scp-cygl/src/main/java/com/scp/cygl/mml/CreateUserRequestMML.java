package com.scp.cygl.mml;

import org.joda.time.LocalDate;

public class CreateUserRequestMML {
	private String GRPID;
	private String NOTABLE = "";
	private String DEPT = "";
	private String USERPIN = "88888888";
	private String LOCKFLAG = "0";
	private String FLAGS = "3300000000000000010010300000001000000000000000000000000000000000";
	private String STATUS = "0110000000";
	private String USERTYPE = "0";
	private String OUTGRP = "0";
	private String MAXOUTNUM = "50";
	private String FEEFLAG = "0111";
	// private String LMTFEE;
	private String PKGTYPE = "0";
	private String PKGDAY = new LocalDate().plusDays(1).toString("yyyy-MM-dd");
	private String CURPKGTYPE = "0";
	// private String INUSERFLAG;
	private String FLAGS2 = "000000000000000000000000000000000000";
	private String KVPNPKGNO;// 必填
	private String IUSERPKGNO;
	private String IF3GUSER = "0";
	private String CHECKFLAG = "0";
	private String USERPROPERTY;
	private String ARMYNO;
	private String IMSFLAGS;
	private String IMSUNCONDITION = "0";
	private String IMSBUSYCHAR = "0";
	private String IMSNOANSWER = "0";
	private String IMSNOREGISTER = "0";
	private String IMSENHANCHED = "0";
	private String BEGINDATE;

	public CreateUserRequestMML() {
		LocalDate dt = new LocalDate().plusMonths(1);
		BEGINDATE = new LocalDate(dt.getYear(), dt.getMonthOfYear(), 1).toString("yyyy-MM-dd");
	}

	public String getGRPID() {
		return GRPID;
	}

	public void setGRPID(String gRPID) {
		GRPID = gRPID;
	}

	public String getNOTABLE() {
		return NOTABLE;
	}

	public void setNOTABLE(String nOTABLE) {
		NOTABLE = nOTABLE;
	}

	public String getDEPT() {
		return DEPT;
	}

	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}

	public String getUSERPIN() {
		return USERPIN;
	}

	public void setUSERPIN(String uSERPIN) {
		USERPIN = uSERPIN;
	}

	public String getLOCKFLAG() {
		return LOCKFLAG;
	}

	public void setLOCKFLAG(String lOCKFLAG) {
		LOCKFLAG = lOCKFLAG;
	}

	public String getFLAGS() {
		return FLAGS;
	}

	public void setFLAGS(String fLAGS) {
		FLAGS = fLAGS;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getUSERTYPE() {
		return USERTYPE;
	}

	public void setUSERTYPE(String uSERTYPE) {
		USERTYPE = uSERTYPE;
	}

	public String getOUTGRP() {
		return OUTGRP;
	}

	public void setOUTGRP(String oUTGRP) {
		OUTGRP = oUTGRP;
	}

	public String getMAXOUTNUM() {
		return MAXOUTNUM;
	}

	public void setMAXOUTNUM(String mAXOUTNUM) {
		MAXOUTNUM = mAXOUTNUM;
	}

	public String getFEEFLAG() {
		return FEEFLAG;
	}

	public void setFEEFLAG(String fEEFLAG) {
		FEEFLAG = fEEFLAG;
	}

	// public String getLMTFEE() {
	// return LMTFEE;
	// }
	//
	// public void setLMTFEE(String lMTFEE) {
	// LMTFEE = lMTFEE;
	// }

	public String getPKGTYPE() {
		return PKGTYPE;
	}

	public void setPKGTYPE(String pKGTYPE) {
		PKGTYPE = pKGTYPE;
	}

	public String getPKGDAY() {
		return PKGDAY;
	}

	public void setPKGDAY(String pKGDAY) {
		PKGDAY = pKGDAY;
	}

	public String getCURPKGTYPE() {
		return CURPKGTYPE;
	}

	public void setCURPKGTYPE(String cURPKGTYPE) {
		CURPKGTYPE = cURPKGTYPE;
	}

	// public String getINUSERFLAG() {
	// return INUSERFLAG;
	// }
	//
	// public void setINUSERFLAG(String iNUSERFLAG) {
	// INUSERFLAG = iNUSERFLAG;
	// }

	public String getFLAGS2() {
		return FLAGS2;
	}

	public void setFLAGS2(String fLAGS2) {
		FLAGS2 = fLAGS2;
	}

	public String getKVPNPKGNO() {
		return KVPNPKGNO;
	}

	public void setKVPNPKGNO(String kVPNPKGNO) {
		KVPNPKGNO = kVPNPKGNO;
	}

	public String getIUSERPKGNO() {
		return IUSERPKGNO;
	}

	public void setIUSERPKGNO(String iUSERPKGNO) {
		IUSERPKGNO = iUSERPKGNO;
	}

	public String getIF3GUSER() {
		return IF3GUSER;
	}

	public void setIF3GUSER(String iF3GUSER) {
		IF3GUSER = iF3GUSER;
	}

	public String getCHECKFLAG() {
		return CHECKFLAG;
	}

	public void setCHECKFLAG(String cHECKFLAG) {
		CHECKFLAG = cHECKFLAG;
	}

	public String getUSERPROPERTY() {
		return USERPROPERTY;
	}

	public void setUSERPROPERTY(String uSERPROPERTY) {
		USERPROPERTY = uSERPROPERTY;
	}

	public String getARMYNO() {
		return ARMYNO;
	}

	public void setARMYNO(String aRMYNO) {
		ARMYNO = aRMYNO;
	}

	public String getIMSFLAGS() {
		return IMSFLAGS;
	}

	public void setIMSFLAGS(String iMSFLAGS) {
		IMSFLAGS = iMSFLAGS;
	}

	public String getIMSUNCONDITION() {
		return IMSUNCONDITION;
	}

	public void setIMSUNCONDITION(String iMSUNCONDITION) {
		IMSUNCONDITION = iMSUNCONDITION;
	}

	public String getIMSBUSYCHAR() {
		return IMSBUSYCHAR;
	}

	public void setIMSBUSYCHAR(String iMSBUSYCHAR) {
		IMSBUSYCHAR = iMSBUSYCHAR;
	}

	public String getIMSNOANSWER() {
		return IMSNOANSWER;
	}

	public void setIMSNOANSWER(String iMSNOANSWER) {
		IMSNOANSWER = iMSNOANSWER;
	}

	public String getIMSNOREGISTER() {
		return IMSNOREGISTER;
	}

	public void setIMSNOREGISTER(String iMSNOREGISTER) {
		IMSNOREGISTER = iMSNOREGISTER;
	}

	public String getIMSENHANCHED() {
		return IMSENHANCHED;
	}

	public void setIMSENHANCHED(String iMSENHANCHED) {
		IMSENHANCHED = iMSENHANCHED;
	}

	public String getBEGINDATE() {
		return BEGINDATE;
	}

	public void setBEGINDATE(String bEGINDATE) {
		BEGINDATE = bEGINDATE;
	}

	@Override
	public String toString() {
		return "ADD VPN1 MEMBERS: GRPID=" + GRPID + ",NOTABLE=" + NOTABLE + ",DEPT=" + DEPT + ",USERPIN=" + USERPIN + ",LOCKFLAG=" + LOCKFLAG + ",FLAGS=" + FLAGS + ",STATUS=" + STATUS + ",USERTYPE=" + USERTYPE + ",OUTGRP=" + OUTGRP + ",MAXOUTNUM=" + MAXOUTNUM + ",FEEFLAG=" + FEEFLAG + ",PKGTYPE=" + PKGTYPE + ",PKGDAY=" + PKGDAY + ",CURPKGTYPE=" + CURPKGTYPE + ",FLAGS2=" + FLAGS2;
	}

}
