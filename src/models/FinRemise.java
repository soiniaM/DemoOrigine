package models;

import utils.Utils;

public class FinRemise {
	
	private String codeEng = "FINRMS";
	private int noSeEnr;
	private String noSedist = "SILBPEZY";
	private String bicEtb="GAILFRP1";
	private String codPer="JOUR";
    private String bicEtbprs ="GAILFRP1";
    private int noCnb ;
    private int idremIr=15;
    private int daRemi;
    private String nuReIn="T220336064723";
    private String romrem ="0337303323";
    private String nAudit="000001";
    private int dAttrt=20217205;
    private String davrem="20217205" ;           
    private String remSens="CT";
    private int mTBtDbt=69254;
    private int NBdecMtBtDbt=2;
    private int devMtBtDBTDEVN=978;
    private String devMtBdBTA="EUR";
    private int mtBtCdt=0;
    private int nbDecMtBtCdt=0;
    private int devMtBtCdtN=0;
    private String devMtBtCdtA="" ;
    private int totComDbt=0;
    private int nbDecTotComDbt=2;
    private int devTotComDbtN=978;
    private String devTotComDbtA="EUR";
    
    private int totComCdt=0; 
    private int nbDecTotComCdt=2 ;
    private int devTotComCdtN=978;
    private String devTotComCdtA="EUR" ;
    private int comTicoOfc=0; 
    private int nbdeComTicoOfc=4;
    private int devComTicoOfcN =497;
    private String devComTicoOfcA="EUR";
    private int devTrtN=978;  
    private String devTrtA="EUR";
    private String noidtrm="00000001";
    private int mntNetOfc=201115;
    private int nbdecMntnetOfc=2;
    private int devMntnetOfcN=978;
    private String devMntnetOfcA="EUR";
    private String sensMntnetOfc="DT";
    private int mnTnetOfcOri=201115; 
    private int nbdecMntnetOfcOr=2;
    private int devOriMntnetOfcN=978;
    private String devOriMntnetOfcA="EUR";
    private int TxConv=1 ;
    private int mtBtOri;  
    private int nbDecMtBtOri=2;
    private int devOriMtBtN=978;
    private String devOriNtBtA="EUR";
    private int totComOri=0 ;
    private int nbDECtOTComOr=2;
    private int devOriTotComN=978;
    private String  devOriTotComA ="EUR";
    private int nbTrsRms =1;
    private int txCONVnDEC=0;
    private int mnTtrOfc=201115;
    private int mnTtrOfcNbDec=2;
    private int devmnTtrOfcN=978;
    private String devmnTtrOfcA="EUR";
    private int  mntrORIOfc=201115;
    private int nbdecMntOriOfc=2;
    private int devmntOriOfcN=978;
    private String devmntOriOfA="EUR";
    private String infcplCodopeOfc=" ";
    
    
    
	public FinRemise() {
		super();
	}
		
		public int getMtBtOri() {
		return mtBtOri;
	}

	public void setMtBtOri(int mtBtOri) {
		this.mtBtOri = mtBtOri;
	}

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
		public String getNuReIn() {
			return nuReIn;
		}
		public void setNuReIn(String nuReIn) {
			this.nuReIn = nuReIn;
		}
		public String getRomrem() {
			return romrem;
		}
		public void setRomrem(String romrem) {
			this.romrem = romrem;
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
		public String getDavrem() {
			return davrem;
		}
		public void setDavrem(String davrem) {
			this.davrem = davrem;
		}
		public String getRemSens() {
			return remSens;
		}
		public void setRemSens(String remSens) {
			this.remSens = remSens;
		}
		public int getmTBtDbt() {
			return mTBtDbt;
		}
		public void setmTBtDbt(int mTBtDbt) {
			this.mTBtDbt = mTBtDbt;
		}
		public int getNBdecMtBtDbt() {
			return NBdecMtBtDbt;
		}
		public void setNBdecMtBtDbt(int nBdecMtBtDbt) {
			NBdecMtBtDbt = nBdecMtBtDbt;
		}
		public int getDevMtBtDBTDEVN() {
			return devMtBtDBTDEVN;
		}
		public void setDevMtBtDBTDEVN(int devMtBtDBTDEVN) {
			this.devMtBtDBTDEVN = devMtBtDBTDEVN;
		}
		public String getDevMtBdBTString() {
			return devMtBdBTA;
		}
		public void setDevMtBdBTString(String devMtBdBTString) {
			this.devMtBdBTA = devMtBdBTString;
		}
		public int getMtBtCdt() {
			return mtBtCdt;
		}
		public void setMtBtCdt(int mtBtCdt) {
			this.mtBtCdt = mtBtCdt;
		}
		public int getNbDecMtBtCdt() {
			return nbDecMtBtCdt;
		}
		public void setNbDecMtBtCdt(int nbDecMtBtCdt) {
			this.nbDecMtBtCdt = nbDecMtBtCdt;
		}
		public int getDevMtBtCdtN() {
			return devMtBtCdtN;
		}
		public void setDevMtBtCdtN(int devMtBtCdtN) {
			this.devMtBtCdtN = devMtBtCdtN;
		}
		public String getDevMtBtCdtA() {
			return devMtBtCdtA;
		}
		public void setDevMtBtCdtA(String devMtBtCdtA) {
			this.devMtBtCdtA = devMtBtCdtA;
		}
		public int getTotComDbt() {
			return totComDbt;
		}
		public void setTotComDbt(int totComDbt) {
			this.totComDbt = totComDbt;
		}
		public int getNbDecTotComDbt() {
			return nbDecTotComDbt;
		}
		public void setNbDecTotComDbt(int nbDecTotComDbt) {
			this.nbDecTotComDbt = nbDecTotComDbt;
		}
		public int getDevTotComDbtN() {
			return devTotComDbtN;
		}
		public void setDevTotComDbtN(int devTotComDbtN) {
			this.devTotComDbtN = devTotComDbtN;
		}
		public String getDevTotComDbtA() {
			return devTotComDbtA;
		}
		public void setDevTotComDbtA(String devTotComDbtA) {
			this.devTotComDbtA = devTotComDbtA;
		}
		
		
		public String  printFinrem() {
			String val=this.codeEng+Utils.padLeftZeros(String.valueOf(this.noSeEnr), 10)+Utils.padRightSpace(this.noSedist, 20)+
					Utils.padRightSpace(this.bicEtb, 11)+this.codPer+Utils.padRightSpace(this.bicEtbprs, 11)+
					Utils.padLeftZeros(String.valueOf(this.noCnb),7)+
					Utils.padLeftZeros(String.valueOf(this.idremIr),6) +Utils.padRightSpace(String.valueOf(this.daRemi),8)
					+Utils.padLeftZeros(String.valueOf(this.nuReIn),13)+Utils.padLeftZeros(String.valueOf(this.romrem),10)+
					this.nAudit+Utils.padRightSpace(String.valueOf(this.dAttrt),8)+
					Utils.padRightSpace(String.valueOf(this.davrem),8)+this.remSens+
					Utils.padLeftZeros(String.valueOf(this.mTBtDbt),16)+this.NBdecMtBtDbt+Utils.padLeftZeros(String.valueOf(this.devMtBtDBTDEVN),3)+
					Utils.padRightSpace(this.devMtBdBTA,3)+Utils.padLeftZeros(String.valueOf(this.mtBtCdt),16)+this.nbDecMtBtCdt+
					Utils.padLeftZeros(String.valueOf(this.devMtBtCdtN),3)+Utils.padRightSpace(this.devMtBtCdtA, 3)+
					
					
					Utils.padLeftZeros(this.totComDbt,16)+Utils.padLeftZeros(String.valueOf(this.nbDecTotComDbt),16)+this.devTotComDbtN+this.devTotComDbtA+
					Utils.padLeftZeros(String.valueOf(this.totComCdt),16)+this.nbDecTotComCdt+this.devTotComCdtN+this.devTotComCdtA+	
					Utils.padLeftZeros(String.valueOf(this.comTicoOfc),16)+this.nbdeComTicoOfc+Utils.padLeftZeros(this.devComTicoOfcN,3)+this.devComTicoOfcA+
					this.devTrtN+this.devTrtA+this.noidtrm+Utils.padLeftZeros(String.valueOf(this.mntNetOfc),16)+
					this.nbdecMntnetOfc+this.devmnTtrOfcN+this.devMntnetOfcA+this.sensMntnetOfc+Utils.padLeftZeros(String.valueOf(this.mnTnetOfcOri),16)+this.nbdecMntnetOfcOr+
					this.devOriMntnetOfcN+this.devOriMntnetOfcA+Utils.padLeftZeros(String.valueOf(this.TxConv),8)  +Utils.padLeftZeros(String.valueOf(this.mtBtOri),16)+this.nbDecMtBtOri+this.devOriMtBtN+this.devOriNtBtA+
					Utils.padLeftZeros(String.valueOf(this.totComOri),16)+this.nbDECtOTComOr+this.devOriTotComN+this.devOriTotComA+Utils.padLeftZeros(String.valueOf(this.nbTrsRms),8)+this.txCONVnDEC+Utils.padLeftZeros(String.valueOf(this.mnTtrOfc),16)+
					this.mnTtrOfcNbDec+this.devmnTtrOfcN+this.devmnTtrOfcA+Utils.padLeftZeros(String.valueOf(this.mntrORIOfc),16)+
					this.nbdecMntOriOfc+this.devmntOriOfcN+this.devmntOriOfA+Utils.padRightSpace(this.infcplCodopeOfc,5)
					
					;
	return 	Utils.padRightSpace(val,4000);
		}
    
    

}
