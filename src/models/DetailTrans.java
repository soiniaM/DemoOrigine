package models;

import utils.Utils;





public class DetailTrans {
	private String codeEng = "DETTRS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
    private String bicEtbprs ="GAILFRP1";
    private int noCnb ;
    private int idremIr=58;
    //private int  iDTran=700000;
    private int  iDTran;
    private String refact;    
    private String romport="033710848630"; 
    private String codope;
    private String noPort ="497060XXXXXX9997000";
    private String cdPaes ="FRA";
    private String nAuditTrs="000001";
    private int    dTtran  =20211705;
    private int  heTran  = 72024;
    private String noterm ="001";
    private String noAuto  ="501307";
    private String topAut = "4";
    private int comglobOfpOri=0;  
    private int nbdecComconOri =4;
    private int devOriComComN=978;
    private String devOriComComA ="EUR";
    private String sensComAcq="CT";
    private int comTicop =0;  
    private int nbDecComticoOfp= 4;
    private int devComticoOfpN =978;
    private String devComTicoOfpA="EUR";
    private int mtBtOri   =15;
    private int nbdecMtBtOri=2;
    private int devOriMtBtN =978;
    private String DevOriMtBtA="EUR";    
    private int comGlobOfp =0;
    private int nbdecCocom =4;
    private int devComcomN =978;
    private String devComComDEVA ="EUR";
    private int montantTrans;
    private int nbdecMtBt =2;
    private int devMtBtN =978;
    private String devMtBtA ="EUR";
    private int txConv =1;
    private String zoneClient ="";       
    private int mtNetOri =1500;
    private int nbdecMtNetOri = 4;
    private int devOriMtNetN=978;
    private String devOriMtNetA  ="EUR";
    private String donpriv="";
    private String codLongPort ="16";
    private String sensComAcc ="DT";
    private String sensComGlobOfp ="DT";
    private String marqueCar="CB";
    private String catCar ="DT";
    private String sansContact ="0";
    private int mntInter =0;
    private String perceptMntInter ="E";
    private int mntAcc =15;
    private int mntAccNbdecc=2;
    private String mntAccCdevN ="EUR";
    private int mntAccCdevA=978;
    private int txConvNbdec=0;
    private String numlpTac="";
    private String refaccOpe=" ";
    private String disponible="";
    
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
	public int getiDTran() {
		return iDTran;
	}
	public void setiDTran(int iDTran) {
		this.iDTran = iDTran;
	}
	public String getRefact() {
		return refact;
	}
	public void setRefact(String refact) {
		this.refact = refact;
	}
	public String getRomport() {
		return romport;
	}
	public void setRomport(String romport) {
		this.romport = romport;
	}
	public String getCodope() {
		return codope;
	}
	public void setCodope(String codope) {
		this.codope = codope;
	}
	public String getNoPort() {
		return noPort;
	}
	public void setNoPort(String noPort) {
		this.noPort = noPort;
	}
	public String getCdPaes() {
		return cdPaes;
	}
	public void setCdPaes(String cdPaes) {
		this.cdPaes = cdPaes;
	}
	public String getnAuditTrs() {
		return nAuditTrs;
	}
	public void setnAuditTrs(String nAuditTrs) {
		this.nAuditTrs = nAuditTrs;
	}
	public int getdTtran() {
		return dTtran;
	}
	public void setdTtran(int dTtran) {
		this.dTtran = dTtran;
	}
	public int getHeTran() {
		return heTran;
	}
	public void setHeTran(int heTran) {
		this.heTran = heTran;
	}
	public String getNoterm() {
		return noterm;
	}
	public void setNoterm(String noterm) {
		this.noterm = noterm;
	}
	public String getNoAuto() {
		return noAuto;
	}
	public void setNoAuto(String noAuto) {
		this.noAuto = noAuto;
	}
	public String getTopAut() {
		return topAut;
	}
	public void setTopAut(String topAut) {
		this.topAut = topAut;
	}
	public int getComglobOfpOri() {
		return comglobOfpOri;
	}
	public void setComglobOfpOri(int comglobOfpOri) {
		this.comglobOfpOri = comglobOfpOri;
	}
	public int getNbdecComconOri() {
		return nbdecComconOri;
	}
	public void setNbdecComconOri(int nbdecComconOri) {
		this.nbdecComconOri = nbdecComconOri;
	}
	public int getDevOriComComN() {
		return devOriComComN;
	}
	public void setDevOriComComN(int devOriComComN) {
		this.devOriComComN = devOriComComN;
	}
	public String getDevOriComComA() {
		return devOriComComA;
	}
	public void setDevOriComComA(String devOriComComA) {
		this.devOriComComA = devOriComComA;
	}
	public String getSensComAcq() {
		return sensComAcq;
	}
	public void setSensComAcq(String sensComAcq) {
		this.sensComAcq = sensComAcq;
	}
	public int getComTicop() {
		return comTicop;
	}
	public void setComTicop(int comTicop) {
		this.comTicop = comTicop;
	}
	public int getNbDecComticoOfp() {
		return nbDecComticoOfp;
	}
	public void setNbDecComticoOfp(int nbDecComticoOfp) {
		this.nbDecComticoOfp = nbDecComticoOfp;
	}
	public int getDevComticoOfpN() {
		return devComticoOfpN;
	}
	public void setDevComticoOfpN(int devComticoOfpN) {
		devComticoOfpN = devComticoOfpN;
	}
	public String getDevComTicoOfpA() {
		return devComTicoOfpA;
	}
	public void setDevComTicoOfpA(String devComTicoOfpA) {
		this.devComTicoOfpA = devComTicoOfpA;
	}
	public int getMtBtOri() {
		return mtBtOri;
	}
	public void setMtBtOri(int mtBtOri) {
		this.mtBtOri = mtBtOri;
	}
	public int getNbdecMtBtOri() {
		return nbdecMtBtOri;
	}
	public void setNbdecMtBtOri(int nbdecMtBtOri) {
		this.nbdecMtBtOri = nbdecMtBtOri;
	}
	public int getDevOriMtBtN() {
		return devOriMtBtN;
	}
	public void setDevOriMtBtN(int devOriMtBtN) {
		this.devOriMtBtN = devOriMtBtN;
	}
	public String getDevOriMtBtA() {
		return DevOriMtBtA;
	}
	public void setDevOriMtBtA(String devOriMtBtA) {
		DevOriMtBtA = devOriMtBtA;
	}
	public int getComGlobOfp() {
		return comGlobOfp;
	}
	public void setComGlobOfp(int comGlobOfp) {
		this.comGlobOfp = comGlobOfp;
	}
	public int getNbdecCocom() {
		return nbdecCocom;
	}
	public void setNbdecCocom(int nbdecCocom) {
		this.nbdecCocom = nbdecCocom;
	}
	public int getDevComcomN() {
		return devComcomN;
	}
	public void setDevComcomN(int devComcomN) {
		this.devComcomN = devComcomN;
	}
	public String getDevComComDEVA() {
		return devComComDEVA;
	}
	public void setDevComComDEVA(String devComComDEVA) {
		this.devComComDEVA = devComComDEVA;
	}
	public int getMontantTrans() {
		return montantTrans;
	}
	public void setMontantTrans(int montantTrans) {
		this.montantTrans = montantTrans;
	}
	public int getNbdecMtBt() {
		return nbdecMtBt;
	}
	public void setNbdecMtBt(int nbdecMtBt) {
		this.nbdecMtBt = nbdecMtBt;
	}
	public int getDevMtBtN() {
		return devMtBtN;
	}
	public void setDevMtBtN(int devMtBtN) {
		this.devMtBtN = devMtBtN;
	}
	public String getDevMtBtA() {
		return devMtBtA;
	}
	public void setDevMtBtA(String devMtBtA) {
		this.devMtBtA = devMtBtA;
	}
	public int getTxConv() {
		return txConv;
	}
	public void setTxConv(int txConv) {
		this.txConv = txConv;
	}
	public String getZoneClient() {
		return zoneClient;
	}
	public void setZoneClient(String zoneClient) {
		this.zoneClient = zoneClient;
	}
	public int getMtNetOri() {
		return mtNetOri;
	}
	public void setMtNetOri(int mtNetOri) {
		this.mtNetOri = mtNetOri;
	}
	public int getNbdecMtNetOri() {
		return nbdecMtNetOri;
	}
	public void setNbdecMtNetOri(int nbdecMtNetOri) {
		this.nbdecMtNetOri = nbdecMtNetOri;
	}
	public int getDevOriMtNetN() {
		return devOriMtNetN;
	}
	public void setDevOriMtNetN(int devOriMtNetN) {
		this.devOriMtNetN = devOriMtNetN;
	}
	public String getDevOriMtNetA() {
		return devOriMtNetA;
	}
	public void setDevOriMtNetA(String devOriMtNetA) {
		this.devOriMtNetA = devOriMtNetA;
	}
	public String getDonpriv() {
		return donpriv;
	}
	public void setDonpriv(String donpriv) {
		this.donpriv = donpriv;
	}
	public String getCodLongPort() {
		return codLongPort;
	}
	public void setCodLongPort(String codLongPort) {
		this.codLongPort = codLongPort;
	}
	public String getSensComAcc() {
		return sensComAcc;
	}
	public void setSensComAcc(String sensComAcc) {
		this.sensComAcc = sensComAcc;
	}
	public String getSensComGlobOfp() {
		return sensComGlobOfp;
	}
	public void setSensComGlobOfp(String sensComGlobOfp) {
		this.sensComGlobOfp = sensComGlobOfp;
	}
	public String getMarqueCar() {
		return marqueCar;
	}
	public void setMarqueCar(String marqueCar) {
		this.marqueCar = marqueCar;
	}
	public String getCatCar() {
		return catCar;
	}
	public void setCatCar(String catCar) {
		this.catCar = catCar;
	}
	public String getSansContact() {
		return sansContact;
	}
	public void setSansContact(String sansContact) {
		this.sansContact = sansContact;
	}
	public int getMntInter() {
		return mntInter;
	}
	public void setMntInter(int mntInter) {
		this.mntInter = mntInter;
	}
	public String getPerceptMntInter() {
		return perceptMntInter;
	}
	public void setPerceptMntInter(String perceptMntInter) {
		this.perceptMntInter = perceptMntInter;
	}
	public int getMntAcc() {
		return mntAcc;
	}
	public void setMntAcc(int mntAcc) {
		this.mntAcc = mntAcc;
	}
	public int getMntAccNbdecc() {
		return mntAccNbdecc;
	}
	public void setMntAccNbdecc(int mntAccNbdecc) {
		this.mntAccNbdecc = mntAccNbdecc;
	}
	public String getMntAccCdevN() {
		return mntAccCdevN;
	}
	public void setMntAccCdevN(String mntAccCdevN) {
		this.mntAccCdevN = mntAccCdevN;
	}
	public int getMntAccCdevA() {
		return mntAccCdevA;
	}
	public void setMntAccCdevA(int mntAccCdevA) {
		this.mntAccCdevA = mntAccCdevA;
	}
	public int getTxConvNbdec() {
		return txConvNbdec;
	}
	public void setTxConvNbdec(int txConvNbdec) {
		this.txConvNbdec = txConvNbdec;
	}
	public String getNumlpTac() {
		return numlpTac;
	}
	public void setNumlpTac(String numlpTac) {
		this.numlpTac = numlpTac;
	}
	public String getRefaccOpe() {
		return refaccOpe;
	}
	public void setRefaccOpe(String refaccOpe) {
		this.refaccOpe = refaccOpe;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
    
    
    public DetailTrans() {
		super();
	}
	public String printDetaiTrans() {
    	
    	String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr) , 10)+Utils.padRightSpace(this.noSedist, 20)+Utils.padRightSpace(this.bicEtb, 11)+
    			this.codPer+Utils.padRightSpace(this.bicEtbprs, 11)+Utils.padLeftZeros(String.valueOf(this.noCnb),7)+
    			Utils.padLeftZeros(String.valueOf(this.idremIr),6)+Utils.padLeftZeros(String.valueOf(this.iDTran),6)+Utils.padLeftZeros(this.refact,12)+this.romport+this.codope+this.noPort+this.cdPaes+this.nAuditTrs+this.dTtran+
    			Utils.padLeftZeros(String.valueOf(this.heTran),6)+this.noterm+this.noAuto+this.topAut+Utils.padLeftZeros(String.valueOf(this.comglobOfpOri),16)+this.nbdecComconOri+this.devOriComComN+this.devOriComComA+this.sensComAcq+Utils.padLeftZeros(String.valueOf(this.comTicop),16)+
    			this.nbDecComticoOfp+this.devOriComComN+
    			/*+this.comGlobOfp+this.devComticoOfpN+*/
    			this.devComTicoOfpA+Utils.padLeftZeros(String.valueOf(this.mtBtOri),16)+this.nbdecMtBtOri+this.devOriMtBtN+this.DevOriMtBtA+Utils.padLeftZeros(String.valueOf(this.comGlobOfp),16)+this.nbdecCocom+this.devComcomN+this.devComComDEVA+Utils.padLeftZeros(String.valueOf(this.montantTrans),16)+
    			this.nbdecMtBt+this.devMtBtN+this.devMtBtA+Utils.padLeftZeros(String.valueOf(this.txConv),8)+Utils.padRightSpace(this.zoneClient ,12)+Utils.padLeftZeros(String.valueOf(this.mtNetOri),16)+this.nbdecMtNetOri+this.devOriMtNetN+
    			this.devOriMtNetA+Utils.padRightSpace(this.donpriv,30)+this.codLongPort+this.sensComAcc+this.sensComGlobOfp+this.marqueCar+this.catCar+this.sansContact+Utils.padLeftZeros(String.valueOf(this.mntInter),16)+this.perceptMntInter+Utils.padLeftZeros(String.valueOf(this.mntAcc),16)+
    			this.mntAccNbdecc+this.mntAccCdevN+this.mntAccCdevA+this.txConvNbdec+Utils.padRightSpace(this.numlpTac,3)+Utils.padRightSpace(this.refaccOpe,18)
    			;
    
    	
    	return 	Utils.padRightSpace(val,4000);
    			
    }
    
    
    
    
    
    
    
    
    
    
}
