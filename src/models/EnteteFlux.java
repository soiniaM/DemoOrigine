package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import utils.Utils;

public class EnteteFlux {

	private String codeEng = "ENTFLU";
	private int noSeEnr;
	private String noSeqDist = "SILBPEZY";
	private int noSeqFlu;
	private String Idcta="000003";
	private int dtTrt;
	private int heTrt=60400 ;
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

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	

	public EnteteFlux() {
		super();
	}

	

	public String printEnteteFlux() {
		
		String val = this.codeEng + Utils.padLeftZeros(String.valueOf(this.noSeEnr), 10) + Utils.padRightSpace(this.noSeqDist, 20) + this.noSeqFlu
				+ this.Idcta + this.dtTrt + Utils.padLeftZeros(String.valueOf(this.heTrt),6);
		//System.out.println(this.heTrt);
	return 	Utils.padRightSpace(val,4000);

	}

	

}
