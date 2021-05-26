package models;

import utils.Utils;

public class EnteteEtab {

	private String codeEng = "ENTETS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private int codBqe=16808;
	private String typFlu="ITD";
	private String disponible;
	public int getNoSeEnr() {
		return noSeEnr;
	}
	public void setNoSeEnr(int noSeEnr) {
		this.noSeEnr = noSeEnr;
	}
	public String getBicEtb() {
		return bicEtb;
	}
	public void setBicEtb(String bicEt) {
		this.bicEtb = bicEtb;
	}
	public String getTypFlu() {
		return typFlu;
	}
	public void setTypFlu(String typFlu) {
		this.typFlu = typFlu;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String getCodeEng() {
		return codeEng;
	}
	public void setCodeEng(String codeEng) {
		this.codeEng = codeEng;
	}
	public String getNoSedist() {
		return noSedist;
	}
	public void setNoSedist(String noSedist) {
		this.noSedist = noSedist;
	}
	public int getCodBqe() {
		return codBqe;
	}
	public void setCodBqe(int codBqe) {
		this.codBqe = codBqe;
	}
	
	
	public EnteteEtab() {
		super();
	}
	public EnteteEtab(int noSeEnr, String bicEtb, int codBqe, String typFlu, String disponible) {
		super();
		this.noSeEnr = noSeEnr;
		this.bicEtb = bicEtb;
		this.codBqe = codBqe;
		this.typFlu = typFlu;
		this.disponible = disponible;
	}
	
public String  printEteteEtab() {
	
	String  val= this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+this.codBqe+this.typFlu;
	//System.out.println(val);	
	return 	Utils.padRightSpace(val,4000);
}
	
	

}
