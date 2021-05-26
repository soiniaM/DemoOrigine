package models;

import utils.Utils;

public class FinPeriod {
	
	private String codeEng = "FINPRD";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
	private int nbTotTrsPrd=1;
    private int nbTotRmsPrd=1;
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


	public int getNbTotTrsPrd() {
		return nbTotTrsPrd;
	}


	public void setNbTotTrsPrd(int nbTotTrsPrd) {
		this.nbTotTrsPrd = nbTotTrsPrd;
	}


	public int getNbTotRmsPrd() {
		return nbTotRmsPrd;
	}


	public void setNbTotRmsPrd(int nbTotRmsPrd) {
		this.nbTotRmsPrd = nbTotRmsPrd;
	}
     
	   
    
		public FinPeriod() {
			super();
		}

public String printFinperd() {
	
	String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
			this.codPer+Utils.padLeftZeros(String.valueOf(this.nbTotTrsPrd) , 8)+Utils.padLeftZeros(String.valueOf(this.nbTotRmsPrd) , 8);
	return 	Utils.padRightSpace(val,4000);
	
}
    
}
