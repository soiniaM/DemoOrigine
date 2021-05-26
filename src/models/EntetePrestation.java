package models;

import utils.Utils;

public class EntetePrestation {
	

	private String codeEng = "ENTPRS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
    private String multiDist="GAILFRP1";
    private String distspec ="6952205854400000" ;
    private String val1 ="00069522058544EZYNESS";
    private String val2="GAILFRP1";
    private String val3="170000852205854400019EZYNESS";
    private String val4="EZYNESS";
    private String val5="6499Z";
    private String val6="GAILFRP1";
    private String val7="2700016LET'S CAGNOTTE";
    private String val8="75PARIS";
    private String val9="6";
    private String val10="601210000000207";
    private String val11="GAILFRP1";
    private String val12="0000504VADI";
    private String val13="FR4520041000012700248H02024";
    private String val14="2021-05-17";
    private String val15="N";
    private String val16="8";
    private String val17="CBDFR4520041000012700248H02024";
    private String val18="000001";
    private String val19="N";
    private String val20="000000";
    private String val21="0";
    private String val22="0";
    
    private String val23="0";
    private String val24="0";
    private String val25="0";
    private String val26="0";
    private String val27="FDSTI0000100001";
;



    
    
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
	public String getMultiDist() {
		return multiDist;
	}
	public void setMultiDist(String multiDist) {
		this.multiDist = multiDist;
	}
	public String getDistspec() {
		return distspec;
	}
	public void setDistspec(String distspec) {
		this.distspec = distspec;
	}
	public EntetePrestation() {
		super();
	}
    
    
	public  String printEntetprest() {
		
		String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
				this.codPer+Utils.padRightSpace(this.multiDist,11)+Utils.padRightSpace(this.distspec,20)+Utils.padRightSpace(this.val1,79)+Utils.padRightSpace(this.val2,11)+
				Utils.padRightSpace(this.val3,101)+Utils.padRightSpace(this.val4,80)+Utils.padRightSpace(this.val5,86)+Utils.padRightSpace(this.val6,11)+Utils.padRightSpace(this.val7,23)+
				Utils.padRightSpace(this.val8,8)+Utils.padRightSpace(this.val9,8)+Utils.padRightSpace(this.val10,164)+Utils.padRightSpace(this.val11,11)+Utils.padRightSpace(this.val12,12)+
				Utils.padRightSpace(this.val13,34)+Utils.padRightSpace(this.val14,20)+Utils.padRightSpace(this.val15,586)+Utils.padRightSpace(this.val16,501)+Utils.padRightSpace(this.val17,62)
				+Utils.padRightSpace(this.val18,778)+Utils.padRightSpace(this.val19,19)+Utils.padRightSpace(this.val20,271)+Utils.padRightSpace(this.val21,260)+Utils.padRightSpace(this.val22,260)
				+Utils.padRightSpace(this.val23,7)+Utils.padRightSpace(this.val24,7)+Utils.padRightSpace(this.val25,7)+Utils.padRightSpace(this.val26,254)+Utils.padRightSpace(this.val27,258)
		;

	return 	Utils.padRightSpace(val,4000);
		
		
	}

}
