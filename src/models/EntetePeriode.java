package models;

import utils.Utils;

public class EntetePeriode {
	
	private String codeEng = "ENTPRD";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
	private String dtDemrlv="";
	private int dtPerDeb;
	private String dtPerFin="";
	private int dtRlv=20210124 ;
	private String disponible;
	

	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public int getNoSeEnr() {
		return noSeEnr;
	}
	public void setNoSeEnr(int noSeEnr) {
		this.noSeEnr = noSeEnr;
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
	public String getDtDemrlv() {
		return dtDemrlv;
	}
	public void setDtDemrlv(String dtDemrlv) {
		this.dtDemrlv = dtDemrlv;
	}
	public int getDtPerDeb() {
		return dtPerDeb;
	}
	public void setDtPerDeb(int dtPerDeb) {
		this.dtPerDeb = dtPerDeb;
	}
	public String getDtPerFin() {
		return dtPerFin;
	}
	public void setDtPerFin(String dtPerFin) {
		this.dtPerFin = dtPerFin;
	}
	public int getDtRlv() {
		return dtRlv;
	}
	public void setDtRlv(int dtRlv) {
		this.dtRlv = dtRlv;
	}
	
	
	
	public EntetePeriode() {
		super();
	}
	
	
	public String printEnteteped() {
		//if (this.getCodPer()=="JOUR") {this.dtPerFin=Integer.parseInt(Utils.padRightSpace(" ",8));}
		
		String val = this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr), 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
		this.codPer+ Utils.padRightSpace(this.dtDemrlv, 8)+Utils.padRightSpace(String.valueOf(this.dtPerDeb),8)+Utils.padRightSpace(this.dtPerFin, 8)+this.dtRlv;
		//System.out.println(this.dtPerDeb);
		
	return 	Utils.padRightSpace(val,4000);
		
		
	}

	

}
