package models;

import utils.Utils;

public class FinPrestation {

	private String codeEng = "FINPRS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
    private String bicEtbprs ="GAILFRP1";
    private String val1= "6935600000000000";
    private String val2="00069356000000LA POSTE";
    private String val3="GAILFRP1";
    private String val4="170001235600000000048MP_BNUM"; 
    private String val5="LA POSTE MKP";
    private String val6 = "6499Z"  ;
    private String val7 = "GAILFRP1"  ;
    private String val8 = "2700021LA POSTE MKP"  ;
    private String val9 = "75PARIS"  ;
    private String val10="601210000025287";
    private String val11="GAILFRP1";
    private String val12="0000509VADI FR4520041000012700248H02024";
    private String val13="2019-11-08";
    private String val14="N";
    private String val15="8";
    private String val16=" 0000000000001400000000";

 
    
    
    
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
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
    
    public  String printFinprest() {
    	
		String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
				this.codPer+Utils.padRightSpace(this.bicEtbprs,11)+
				Utils.padRightSpace(this.val1, 20)+Utils.padRightSpace(this.val2, 79)+Utils.padRightSpace(this.val3, 11)+Utils.padRightSpace(this.val4, 101)+Utils.padRightSpace(this.val5, 80)+
				Utils.padRightSpace(this.val6, 86)+Utils.padRightSpace(this.val7, 11)+Utils.padRightSpace(this.val8, 23)+Utils.padRightSpace(this.val9, 16)+Utils.padRightSpace(this.val10, 164)+
				Utils.padRightSpace(this.val11, 11)+Utils.padRightSpace(this.val12, 46)+Utils.padRightSpace(this.val13, 20)+Utils.padRightSpace(this.val14, 586)+Utils.padRightSpace(this.val15, 501)+this.val16
				
		
		;
	return 	Utils.padRightSpace(val,4000);
    }
    
    
}
