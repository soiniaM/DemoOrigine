package models;

import utils.Utils;

public class FinFlux {

	private String codeEng = "FINFLU";
	private int noSeEnr;
	private String noSeqDist = "SILBPEZY";
	private int noSeqFlu=868 ;
	private String Idcta="000003";
	private int dtTrt;
	private int heTrt=60400 ;
    private String verFlu ="02"; 
    private int nbEnrFlu=220 ;
    private String disponible ;
    
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
	public String getNoSeqDist() {
		return noSeqDist;
	}
	public void setNoSeqDist(String noSeqDist) {
		this.noSeqDist = noSeqDist;
	}
	public int getNoSeqFlu() {
		return noSeqFlu;
	}
	public void setNoSeqFlu(int noSeqFlu) {
		this.noSeqFlu = noSeqFlu;
	}
	public String getIdcta() {
		return Idcta;
	}
	public void setIdcta(String idcta) {
		Idcta = idcta;
	}
	public int getDtTrt() {
		return dtTrt;
	}
	public void setDtTrt(int dtTrt) {
		this.dtTrt = dtTrt;
	}
	public int getHeTrt() {
		return heTrt;
	}
	public void setHeTrt(int heTrt) {
		this.heTrt = heTrt;
	}
	public String getVerFlu() {
		return verFlu;
	}
	public void setVerFlu(String verFlu) {
		this.verFlu = verFlu;
	}
	public int getNbEnrFlu() {
		return nbEnrFlu;
	}
	public void setNbEnrFlu(int nbEnrFlu) {
		this.nbEnrFlu = nbEnrFlu;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public FinFlux() {
		super();
	}
    
    
    public String printFinFlux() {
    	
    	String val = this.codeEng + Utils.padLeftZeros(String.valueOf(this.noSeEnr), 10) +
    	Utils.padRightSpace(this.noSeqDist, 20)+
    	Utils.padLeftZeros(String.valueOf(this.noSeqFlu),6)+this.Idcta+this.dtTrt+
    	Utils.padLeftZeros(String.valueOf(this.heTrt),6)+
    	Utils.padLeftZeros(String.valueOf(this.verFlu),2)+Utils.padLeftZeros(String.valueOf(this.nbEnrFlu),9);
	return 	Utils.padRightSpace(val,4000);
    }
}
