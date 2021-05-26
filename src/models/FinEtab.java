package models;

import utils.Utils;

public class FinEtab {

	private String codeEng = "FINETS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private int codBqe=16808;
	private int nbTotTrsEts=1;
	private int nbTotRmsEts=1;
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
	public int getCodBqe() {
		return codBqe;
	}
	public void setCodBqe(int codBqe) {
		this.codBqe = codBqe;
	}
	public int getNbTotTrsEts() {
		return nbTotTrsEts;
	}
	public void setNbTotTrsEts(int nbTotTrsEts) {
		this.nbTotTrsEts = nbTotTrsEts;
	}
	public int getNbTotRmsEts() {
		return nbTotRmsEts;
	}
	public void setNbTotRmsEts(int nbTotRmsEts) {
		this.nbTotRmsEts = nbTotRmsEts;
	}
	public FinEtab() {
		super();
	}
	
	
	public String printFinEtab() {
		
		String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
				this.codBqe+Utils.padLeftZeros(String.valueOf(this.nbTotTrsEts),10)+Utils.padLeftZeros(String.valueOf(this.nbTotRmsEts),10)

				;
	return 	Utils.padRightSpace(val,4000);
	}
}
