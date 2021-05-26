package models;

import utils.Utils;

public class EnteteRemise {
	
	private String codeEng = "ENTRMS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
    private String bicEtbprs ="GAILFRP1";
    private int noCnb ;
    private int idremIr=15;
    private int daRemi;
    private String remInDan="01" ;
    private String refarcr="000001000015";
    private String nurein="T220336064723";
    private String romre="0337303323";
    private String nAudit="000001";
    private int dAttrt;
    private String remSens="CT";
    private int cddvorN=978;
    private String cddVorA="EUR";
    private int cddIn=978;
    private String cddInA="EUR"; 
    private int devTrtN=978;
    private String devTrtA="EUR";
    private String noidTrms="00000001";
    private String numLsysac="001";
    private int idAcce=43 ;
    private String natMdf="CD";
    private String idSysac="001 ";
    private String disponible;
    
    
	public String getCodeEng() {
		return codeEng;
	}


	public void setCodeEng(String codeEng) {
		this.codeEng = codeEng;
	}


	public int getNoSeEnr() {
		return noSeEnr;
	}


	public void setNoSeEnr(int noSeEnr) {
		this.noSeEnr = noSeEnr;
	}


	public String getNoSedist() {
		return noSedist;
	}


	public void setNoSedist(String noSedist) {
		this.noSedist = noSedist;
	}


	public String getBicEtb() {
		return bicEtb;
	}


	public void setBicEtb(String bicEtb) {
		this.bicEtb = bicEtb;
	}


	public String getCodPer() {
		return codPer;
	}


	public void setCodPer(String codPer) {
		this.codPer = codPer;
	}


	public String getBicEtbprs() {
		return bicEtbprs;
	}


	public void setBicEtbprs(String bicEtbprs) {
		this.bicEtbprs = bicEtbprs;
	}


	public int getNoCnb() {
		return noCnb;
	}


	public void setNoCnb(int noCnb) {
		this.noCnb = noCnb;
	}


	public int getIdremIr() {
		return idremIr;
	}


	public void setIdremIr(int idremIr) {
		this.idremIr = idremIr;
	}


	public int getDaRemi() {
		return daRemi;
	}


	public void setDaRemi(int daRemi) {
		this.daRemi = daRemi;
	}


	public String getRemInDan() {
		return remInDan;
	}


	public void setRemInDan(String remInDan) {
		this.remInDan = remInDan;
	}


	public String getRefarcr() {
		return refarcr;
	}


	public void setRefarcr(String refarcr) {
		this.refarcr = refarcr;
	}


	public String getNurein() {
		return nurein;
	}


	public void setNurein(String nurein) {
		this.nurein = nurein;
	}


	public String getRomre() {
		return romre;
	}


	public void setRomre(String romre) {
		this.romre = romre;
	}


	public String getnAudit() {
		return nAudit;
	}


	public void setnAudit(String nAudit) {
		this.nAudit = nAudit;
	}


	public int getdAttrt() {
		return dAttrt;
	}


	public void setdAttrt(int dAttrt) {
		this.dAttrt = dAttrt;
	}


	public String getRemSens() {
		return remSens;
	}


	public void setRemSens(String remSens) {
		this.remSens = remSens;
	}


	public int getCddvorN() {
		return cddvorN;
	}


	public void setCddvorN(int cddvorN) {
		this.cddvorN = cddvorN;
	}


	public String getCddVorA() {
		return cddVorA;
	}


	public void setCddVorA(String cddVorA) {
		this.cddVorA = cddVorA;
	}


	public int getCddIn() {
		return cddIn;
	}


	public void setCddIn(int cddIn) {
		this.cddIn = cddIn;
	}


	public String getCddInA() {
		return cddInA;
	}


	public void setCddInA(String cddInA) {
		this.cddInA = cddInA;
	}


	public int getDevTrtN() {
		return devTrtN;
	}


	public void setDevTrtN(int devTrtN) {
		this.devTrtN = devTrtN;
	}


	public String getDevTrtA() {
		return devTrtA;
	}


	public void setDevTrtA(String devTrtA) {
		this.devTrtA = devTrtA;
	}


	public String getNoidTrms() {
		return noidTrms;
	}


	public void setNoidTrms(String noidTrms) {
		this.noidTrms = noidTrms;
	}


	public String getNumLsysac() {
		return numLsysac;
	}


	public void setNumLsysac(String numLsysac) {
		this.numLsysac = numLsysac;
	}


	public int getIdAcce() {
		return idAcce;
	}


	public void setIdAcce(int idAcce) {
		this.idAcce = idAcce;
	}


	public String getNatMdf() {
		return natMdf;
	}


	public void setNatMdf(String natMdf) {
		this.natMdf = natMdf;
	}


	public String getIdSysac() {
		return idSysac;
	}


	public void setIdSysac(String idSysac) {
		this.idSysac = idSysac;
	}


	public String getDisponible() {
		return disponible;
	}


	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}


	public EnteteRemise() {
		super();
	}
    
    
public String printEntRms() {
	
	String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
			this.codPer+Utils.padRightSpace(this.bicEtbprs, 11)+Utils.padLeftZeros(String.valueOf(this.noCnb),7)+Utils.padLeftZeros(String.valueOf(this.idremIr),6) +Utils.padLeftZeros(String.valueOf(this.daRemi),8)+this.remInDan+
			this.refarcr+this.nurein+this.romre+this.nAudit+Utils.padLeftZeros(String.valueOf(this.dAttrt ),8)+this.remSens+
			this.cddvorN+this.cddVorA+this.cddIn+this.cddInA+this.devTrtN+this.devTrtA+this.noidTrms+this.getNumLsysac()+this.idAcce+
			this.idSysac;
	return 	Utils.padRightSpace(val,4000);
}
    
    
    
    
    
    

}
