package frm_builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.DetailTrans;
import models.EnteteEtab;
import models.EnteteFlux;
import models.EntetePeriode;
import models.EntetePrestation;
import models.EnteteRemise;
import models.FinEtab;
import models.FinFlux;
import models.FinPeriod;
import models.FinPrestation;
import models.FinRemise;

import utils.Utils;

public class CoreBanking {
	public static int numseqStatic=1;
	//public static int numSeqFluStatic=990001;
     //   public static int numSeqFluStatic ;


   
 	//private String tagpayInput;
        
        // pass the path to the file as a parameter
    
	public CoreBanking() {
		super();
		//this.tagpayInput = tagpayInput;
	}
        /*
public TagpayCsv(String tagpayInput) {
		super();
		this.tagpayInput = tagpayInput;
	}

*/
 

  
        
public static int getNumseqStatic() {
		return numseqStatic;
	}


	public static void setNumseqStatic(int numseqStatic) {
		CoreBanking.numseqStatic = numseqStatic;
	}

/*
	public static int getNumSeqFluStatic() {
		return numSeqFluStatic;
	}


	public static void setNumSeqFluStatic(int numSeqFluStatic) {
		CoreBanking.numSeqFluStatic = numSeqFluStatic;
	}
*/
/*
	public String getTagpayInput() {
		return tagpayInput;
	}


	public void setTagpayInput(String tagpayInput) {
		this.tagpayInput = tagpayInput;
	}
*/

        
   
public boolean tagpayGenere(String tagpayInput,String outputPath,int numSeqFluStatic ) {
              //  int idTrans=0;
            int  idTrans=0;
            /*   try {
                idTrans = Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
            } catch (IOException ex) {
                Logger.getLogger(CoreBanking.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
 ///this.setTagpayInput(tagpayInput);
   Date now = new Date(); // java.util.Date, NOT java.sql.Date or java.sql.Timestamp!
   String format1 = new SimpleDateFormat("yyyyMMdd", Locale.FRANCE).format(now);
	 
	EnteteFlux entete= new EnteteFlux() ;
	entete.setNoSeEnr(numseqStatic);
	numseqStatic +=1;
	 entete.setDtTrt(Integer.parseInt(format1));
	 entete.setNoSeqFlu(numSeqFluStatic);
	
	EnteteEtab enteteEtab= new EnteteEtab();
	enteteEtab.setNoSeEnr(numseqStatic);
	numseqStatic +=1 ;
	
	EntetePeriode entetePer= new EntetePeriode();
	  entetePer.setNoSeEnr(numseqStatic);
   	  entetePer.setDtPerDeb(Integer.parseInt(format1));
	numseqStatic +=1 ;
	
	EntetePrestation entprst= new EntetePrestation();
	entprst.setNoSeEnr(numseqStatic);
	numseqStatic+=1;

	
EnteteRemise enteRm=new EnteteRemise();
	    enteRm.setDaRemi(Integer.parseInt(format1));
	enteRm.setNoSeEnr(numseqStatic);
	numseqStatic+=1;
	 

	 DetailTrans detailT =new DetailTrans();
	 FinRemise finrem=new FinRemise();
	 String entFlux= entete.printEnteteFlux();
	 String entEtab=enteteEtab.printEteteEtab();
	 String entPerd=entetePer.printEnteteped();
	 String entPest=entprst.printEntetprest();
		
         
	// String destPath=outputPath;
        // String destPath=System.getProperty("user.dir").concat("\\Dossier_FRM" );

		// fichier frm vide
//	  File monFic = new File(destPath.concat("\\TagPay_Frm.HC"));

	  File monFic = new File(outputPath.concat("\\"+String.valueOf(numSeqFluStatic)+"_Frm.HC"));

		
		try {
			//	File monFic = new File("C:\\Users\\SONIA\\Documents\\stage\\FrmGenerate\\ monFichier.FRM");

// dossier destination 
		//File dossier = new File(System.getProperty("user.dir").concat("\\Dossier_FRM" ));
                File dossier = new File(outputPath);

        boolean res = dossier.mkdir();



			if (!monFic.createNewFile()) {
		    //    System.out.println("File already exists.");

			      } else {
                         //    System.out.println("File created: " +outputPath.concat(monFic.getName()));
			      }
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	

	try {
		 String cmpte1="";
		 String cmpte2;
		 String sensT1="";
		 String sensT2="";
		 Double montantTot =0.00;
		  int mont;
	String row;
	BufferedReader csvReader = new BufferedReader(new FileReader(tagpayInput));
	 row = csvReader.readLine();
	 
     int  ligne=0;
 
     //ecriture  dans frm
     FileWriter myWriter = new FileWriter(monFic );
     
     myWriter.write(entFlux+" \n");
     myWriter.write(entEtab+"\n");
     myWriter.write(entPerd+"\n");
     myWriter.write(entPest+"\n");
       
     
     
	 while ((row = csvReader.readLine()) != null) {
			
		    String[] data = row.split(",");
			ligne ++ ;
                          String montant;
			//System.out.println(data[0]);
                      if(data[2].indexOf(".")== -1){  montant=data[2].toString();}
                      else{
			StringBuffer sbf = new StringBuffer(data[2]);
	        	     int pos=(sbf.toString()).indexOf(".");
             montant=sbf.deleteCharAt(pos).toString();
                      }
            
            
            
			if (ligne ==1) {
				cmpte1=data[0];
				sensT1=data[3];
                        enteRm.setNoCnb(Integer.parseInt(Utils.padLeftZeros(data[0],7)));
			 myWriter.write(enteRm.printEntRms()+"\n");
                         
             idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
              detailT.setiDTran(idTrans);
	     detailT.setNoSeEnr(numseqStatic);
	         numseqStatic+=1;
	     detailT.setNoCnb(Integer.parseInt(Utils.padLeftZeros(data[0],7)));
             detailT.setRefact(data[1]);
             detailT.setCodope(data[3]);
             detailT.setMontantTrans(Integer.parseInt(montant));
             		//detailT.setdTtran(Integer.parseInt(transDate));;

  			 myWriter.write(detailT.printDetaiTrans()+"\n");
            montantTot=montantTot+ Double.parseDouble(data[2]);
	         	
         		}
			
			if (ligne >1) {
				
				cmpte2=data[0];
				sensT2=data[3];
				if (cmpte1.equals(cmpte2)&& sensT1.equals(sensT2) ) {
                                    
                         idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                         detailT.setiDTran(idTrans);
					
			detailT.setNoSeEnr(numseqStatic);
		         numseqStatic+=1;
		        detailT.setNoCnb(Integer.parseInt(Utils.padLeftZeros(data[0],7)));
	             	detailT.setRefact(data[1]);
	             	detailT.setCodope(data[3]);
	             	detailT.setMontantTrans(Integer.parseInt(montant));
	  			    myWriter.write(detailT.printDetaiTrans()+"\n");

	             	mont=Integer.parseInt(montant);
	            	montantTot=montantTot+ Double.parseDouble(data[2]);

				}
				
				else if(cmpte1.equals(cmpte2) && sensT1!=sensT2) {
					
					 finrem.setNoSeEnr(numseqStatic);
					 numseqStatic+=1;
					 finrem.setDaRemi(Integer.parseInt(format1));
					 finrem.setNoCnb(Integer.parseInt(cmpte1));
					 finrem.setdAttrt(Integer.parseInt(format1));
					 
					StringBuffer sbf2 = new StringBuffer(Double. toString(montantTot));
					 int pos2=	(sbf2.toString()).indexOf(".");
		                String tot=sbf2.deleteCharAt(pos2).toString();
		                
				   	 finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot),7));
				   	 myWriter.write(finrem.printFinrem()+"\n");
				   	 montantTot=0.00;
					enteRm.setNoSeEnr(numseqStatic);
			        numseqStatic+=1;
			        enteRm.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
			         myWriter.write(enteRm.printEntRms()+"\n"); 
                                 
                         idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                                 detailT.setiDTran(idTrans);
                                 
			         detailT.setNoSeEnr(numseqStatic);
		         	   numseqStatic+=1;
		                 detailT.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
	             		 detailT.setRefact(data[1]);
	             		 detailT.setCodope(data[3]);
	             		 detailT.setMontantTrans(Integer.parseInt(montant));
	  			         myWriter.write(detailT.printDetaiTrans()+"\n");

	             		mont=Integer.parseInt(montant);
	            		montantTot=montantTot+ Double.parseDouble(data[2]);
                        sensT1=sensT2;

			      }
				
				else  if(cmpte1!=cmpte2 && sensT1.equals(sensT2)) {
					
					finrem.setNoSeEnr(numseqStatic);
					 numseqStatic+=1;
					 finrem.setDaRemi(Integer.parseInt(format1));
					 finrem.setNoCnb(Integer.parseInt(cmpte1));
					 finrem.setdAttrt(Integer.parseInt(format1));
					 
						StringBuffer sbf2 = new StringBuffer(Double. toString(montantTot));
						 int pos2=	(sbf2.toString()).indexOf(".");
			             String tot=sbf2.deleteCharAt(pos2).toString();
			                
					   	 finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot),7));
				   	 myWriter.write(finrem.printFinrem()+"\n");
				   	 montantTot=0.00;
				   	 
				   	   FinPrestation finprest= new FinPrestation();
					   finprest.setNoSeEnr(numseqStatic);
					    numseqStatic+=1;
					    myWriter.write(finprest.printFinprest()+"\n");

					   entprst.setNoSeEnr(numseqStatic);
						numseqStatic+=1;
				        myWriter.write(entprst.printEntetprest()+"\n");
		            	enteRm.setNoSeEnr(numseqStatic);
			            numseqStatic+=1;
			            enteRm.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
			         myWriter.write(enteRm.printEntRms()+"\n");
                                 
                         idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                                 detailT.setiDTran(idTrans);
			         detailT.setNoSeEnr(numseqStatic);
		         		numseqStatic+=1;
		                 detailT.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
	             		 detailT.setRefact(data[1]);
	             		 detailT.setCodope(data[3]);
	             		 detailT.setMontantTrans(Integer.parseInt(montant));
	  			      myWriter.write(detailT.printDetaiTrans()+"\n");

	             		mont=Integer.parseInt(montant);
	            		//nbreTrans++;
	            		montantTot=montantTot+ Double.parseDouble(data[2]);
		            	cmpte1=cmpte2;


				   	 
				   	 }
				else if (cmpte1!=cmpte2 && sensT1!=sensT2){
					
					
					finrem.setNoSeEnr(numseqStatic);
					 numseqStatic+=1;
					 finrem.setDaRemi(Integer.parseInt(format1));
					 finrem.setNoCnb(Integer.parseInt(cmpte1));
					 finrem.setdAttrt(Integer.parseInt(format1));
					 
						StringBuffer sbf2 = new StringBuffer(Double. toString(montantTot));
						 int pos2=	(sbf2.toString()).indexOf(".");
			                String tot=sbf2.deleteCharAt(pos2).toString();
			                
					   	 finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot),7));
				   	// finrem.setMtBtOri(Utils.padLeftZeros(montantTot,7));
				   	 myWriter.write(finrem.printFinrem()+"\n");
				   	 montantTot=0.00;

					FinPrestation finprest= new FinPrestation();
					   finprest.setNoSeEnr(numseqStatic);
					    numseqStatic+=1;
					    myWriter.write(finprest.printFinprest()+"\n");

					   entprst.setNoSeEnr(numseqStatic);
						numseqStatic+=1;
				        myWriter.write(entprst.printEntetprest()+"\n");
		            	cmpte1=cmpte2;
		            	enteRm.setNoSeEnr(numseqStatic);
			            numseqStatic+=1;
			            enteRm.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
			         myWriter.write(enteRm.printEntRms()+"\n");
                                 
                         idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                                       detailT.setiDTran(idTrans);
			         
			         detailT.setNoSeEnr(numseqStatic);
		         		numseqStatic+=1;
		         	 detailT.setNoCnb(Integer.parseInt(Utils.padLeftZeros(cmpte2,7)));
	             		 detailT.setRefact(data[1]);
	             		 detailT.setCodope(data[3]);
	             		 detailT.setMontantTrans(Integer.parseInt(montant));
	  			      myWriter.write(detailT.printDetaiTrans()+"\n");

	             		mont=Integer.parseInt(montant);
	            		///nbreTrans++; 
	            		montantTot=montantTot+ mont;
			         
		            	cmpte1=cmpte2;
		            	sensT1=sensT2;

				}
				    		
				
			}
			
			
			
			}
	
	 
	 
	 try {
	 
	 finrem.setNoSeEnr(numseqStatic);
	 numseqStatic+=1;
	 finrem.setDaRemi(Integer.parseInt(format1));
	// finrem.setNoCnb(Integer.parseInt(data[0]));
	 finrem.setdAttrt(Integer.parseInt(format1));
	 
	 
		StringBuffer sbf2 = new StringBuffer(Double. toString(montantTot));
		 int pos2=	(sbf2.toString()).indexOf(".");
            String tot=sbf2.deleteCharAt(pos2).toString();
            
	   	 finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot),7));
   	// finrem.setMtBtOri(Utils.padLeftZeros(montantTot,7));
   	 myWriter.write(finrem.printFinrem()+"\n");
	 
   	 FinPrestation finprest= new FinPrestation();
	 finprest.setNoSeEnr(numseqStatic);
	 numseqStatic+=1;
	 myWriter.write(finprest.printFinprest()+"\n");

	 
	 FinPeriod finped=new FinPeriod(); 
	 finped.setNoSeEnr(numseqStatic);
	 numseqStatic+=1;
	 myWriter.write(finped.printFinperd()+"\n");

    FinEtab finEtab=new FinEtab();
    finEtab.setNoSeEnr(numseqStatic);
    numseqStatic++;
	 myWriter.write(finEtab.printFinEtab()+"\n");

	 
	 FinFlux finflu= new FinFlux();	
	 finflu.setDtTrt(Integer.parseInt(format1));
	 finflu.setNoSeEnr(numseqStatic);
	 myWriter.write(finflu.printFinFlux());
              numseqStatic=1;

	 }
	 
	 
	 catch (IOException e) {
	      System.out.println("ERREUR LORS DE L'ECRITURE.");
	      e.printStackTrace();
                       return false;

	    }
	 myWriter.close();
     System.out.println("Successfully wrote to the file.");
              return true;

}

catch (IOException e) {
     System.out.println("ERREUR LORS DE L'ECRITURE.");
     e.printStackTrace();
                            return false;

   }
}

}
	


