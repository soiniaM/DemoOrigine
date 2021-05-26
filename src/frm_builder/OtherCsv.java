package frm_builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import models.*;

import utils.Utils;

public class OtherCsv {

    public static int numseqStatic = 1;
    //public static int numSeqFluStatic=990001;
    //public static String refact="BPO_D1_TRS0";
    //private int noCnb =559;

    public static int getNumseqStatic() {
        return numseqStatic;
    }

    public OtherCsv(String paylineInput, int noCnb) {
        super();
        //this.paylineInput = paylineInput;
        //this.noCnb = noCnb;
    }


    /*

	public static int getNumSeqFluStatic() {
		return numSeqFluStatic;
	}


	public static void setNumSeqFluStatic(int numSeqFluStatic) {
		OtherCsv.numSeqFluStatic = numSeqFluStatic;
	}


	public static String getRefact() {
		return refact;
	}


	public static void setRefact(String refact) {
		OtherCsv.refact = refact;
	}
     */
 /*
	public String getPaylineInput() {
		return paylineInput;
	}


	public void setPaylineInput(String paylineInput) {
		this.paylineInput = paylineInput;
	}
     */
    public OtherCsv(String paylineInput) {
        super();
        //	this.paylineInput = paylineInput;
    }

    public OtherCsv() {
    }

    public boolean paylineGenere(String paylineInput, String outputPath, int numSeqFluStatic, int noCnb) throws IOException {

        Date now = new Date(); // java.util.Date, NOT java.sql.Date or java.sql.Timestamp!
        String format1 = new SimpleDateFormat("yyyyMMdd", Locale.FRANCE).format(now);

        int idTrans = 0;

        EnteteFlux entete = new EnteteFlux();
        entete.setNoSeEnr(numseqStatic);
        numseqStatic += 1;
        entete.setDtTrt(Integer.parseInt(format1));
        entete.setNoSeqFlu(numSeqFluStatic);

        EnteteEtab enteteEtab = new EnteteEtab();
        enteteEtab.setNoSeEnr(numseqStatic);
        numseqStatic += 1;

        EntetePeriode entetePer = new EntetePeriode();
        entetePer.setNoSeEnr(numseqStatic);
        entetePer.setDtPerDeb(Integer.parseInt(format1));
        numseqStatic += 1;

        EntetePrestation entprst = new EntetePrestation();
        entprst.setNoSeEnr(numseqStatic);
        numseqStatic += 1;

        EnteteRemise enteRm = new EnteteRemise();
        enteRm.setDaRemi(Integer.parseInt(format1));
        enteRm.setNoSeEnr(numseqStatic);
        numseqStatic += 1;

        DetailTrans detailT = new DetailTrans();
        FinRemise finrem = new FinRemise();
        String entFlux = entete.printEnteteFlux();
        String entEtab = enteteEtab.printEteteEtab();
        String entPerd = entetePer.printEnteteped();
        String entPest = entprst.printEntetprest();

        File monFic = null;
        try {

            // dossier destination 
            //File dossier = new File(System.getProperty("user.dir").concat("\\Dossier_FRM" ));
            File dossier = new File(outputPath.concat("\\Dossier_FRM"));

            boolean res = dossier.mkdir();

// fichier frm vide
            monFic = new File(outputPath.concat("\\Dossier_FRM\\") + String.valueOf(numSeqFluStatic) + "payLFrm.HC");

            if (!monFic.createNewFile()) {

                // System.out.println("File already exists.");
            } else {
                //        System.out.println("File created: " +destPath.concat("\\").concat(monFic.getName()));
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String sensT1 = "";
        String sensT2 = "";
        Double montantTot = 0.00;
        String montant;

        String row;

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(paylineInput));
            row = csvReader.readLine();

            int ligne = 0;
            FileWriter myWriter = new FileWriter(monFic);

            myWriter.write(entFlux + " \n");
            myWriter.write(entEtab + "\n");
            myWriter.write(entPerd + "\n");
            myWriter.write(entPest + "\n");

            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(";");

                ligne++;

                StringBuffer sbf = new StringBuffer(data[8]);
                if ((sbf.toString().indexOf(".") != -1)) {
                    int pos = (sbf.toString()).indexOf(".");
                    montant = (sbf.deleteCharAt(pos).toString().replaceAll("\"", "")).trim();
                } else {
                    montant = (data[8].replaceAll("\"", "")).trim();
                };

                String var1 = (data[69].replaceAll("\"", "")).trim();
                String var2 = (data[106].replaceAll("\"", "")).trim();
                sensT1 = Utils.getsensTrans(data[106].replaceAll("\"", ""));

                if (ligne == 1) {
                    if ("ACCEPTED".equals(var1) && !var2.equals("AUTHOR")) {

                        String dateInString = (data[13].replaceAll("/", ""));
                        String transDate = (dateInString.replaceAll("\"", "")).substring(0, 8);
                        String action = (data[106].replaceAll("\"", "")).trim();
                        //System.out.println(action);
                        // detailT.setNoCnb(this.noCnb);
                        myWriter.write(enteRm.printEntRms() + "\n");

                        idTrans = Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                        detailT.setiDTran(idTrans);

                        detailT.setNoSeEnr(numseqStatic);
                        numseqStatic += 1;
                        detailT.setNoCnb(noCnb);
                        String fact = data[12].replaceAll("\"", "");
                        Long Rfact = Long.parseLong(fact);
                        detailT.setRefact(Long.toHexString(Rfact));
                        detailT.setCodope(Utils.getsensTrans(action));
                        int mont = Integer.valueOf((data[8].replaceAll("\"", "")).trim());
                        detailT.setMontantTrans(mont);
                        detailT.setdTtran(Integer.parseInt(transDate));
                        myWriter.write(detailT.printDetaiTrans() + "\n");

                        montantTot = montantTot + Double.parseDouble((data[8].replaceAll("\"", "")).trim());

                    }
                }

                if (ligne > 1) {
                    String val = (data[69].replaceAll("\"", "")).trim();
                    String val2 = (data[106].replaceAll("\"", "")).trim();
                    sensT2 = Utils.getsensTrans(data[106].replaceAll("\"", ""));

                    if ("ACCEPTED".equals(val) && !val2.equals("AUTHOR")) {

                        String dateInString = data[13].replaceAll("/", "").substring(0, 10);
                        String transDate = dateInString.replaceAll("\"", "");
                        String action = data[106].replaceAll("\"", "");

                        if (sensT1.equals(sensT2)) {
                            //external_trans_id

                            idTrans = Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                            detailT.setiDTran(idTrans);
                            Long Rfact = Long.valueOf((data[12].replaceAll("\"", "")).trim());
                            detailT.setNoSeEnr(numseqStatic);
                            numseqStatic += 1;
                            detailT.setNoCnb(noCnb);
                            detailT.setRefact(Long.toHexString(Rfact));
                            detailT.setCodope(Utils.getsensTrans(action));
                            detailT.setMontantTrans(Integer.valueOf(montant.replaceAll("\"", "").trim()));
                            detailT.setdTtran(Integer.parseInt(transDate.replaceAll("\"", "").trim()));
                            myWriter.write(detailT.printDetaiTrans() + "\n");

                            montantTot = montantTot + Double.parseDouble((data[8].replaceAll("\"", "")).trim());

                        } //else if(cmpte1.equals(cmpte2) && sensT1!=sensT2) {	
                        else {
                            numseqStatic += 1;
                            finrem.setDaRemi(Integer.parseInt(format1));
                            finrem.setNoCnb(noCnb);
                            finrem.setdAttrt(Integer.parseInt(format1));

                            StringBuffer sbf2 = new StringBuffer(Double.toString(montantTot));
                            int pos2 = (sbf2.toString()).indexOf(".");
                            String tot = sbf2.deleteCharAt(pos2).toString();
                            finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot), 7));
                            myWriter.write(finrem.printFinrem() + "\n");

                            montantTot = 0.00;
                            enteRm.setNoSeEnr(numseqStatic);
                            numseqStatic += 1;
                            enteRm.setNoCnb(noCnb);
                            myWriter.write(enteRm.printEntRms() + "\n");
                            int Rfact = Integer.valueOf((data[12].replaceAll("\"", "")).trim());
             
                         idTrans= Integer.valueOf(utils.Utils.readFile("Idtrans.txt"));
                         detailT.setiDTran(idTrans);
                            detailT.setNoSeEnr(numseqStatic);
                            numseqStatic += 1;
                            detailT.setNoCnb(noCnb);
                            detailT.setRefact(Integer.toBinaryString(Rfact));
                            detailT.setCodope(Utils.getsensTrans(action));
                            detailT.setMontantTrans(Integer.valueOf(montant));
                            detailT.setdTtran(Integer.parseInt(transDate));;
                            myWriter.write(detailT.printDetaiTrans() + "\n");

                            montantTot = montantTot + Double.parseDouble(data[2]);
                            sensT1 = sensT2;

                        }

                    }
                }

            }

            try {

                finrem.setNoSeEnr(numseqStatic);
                numseqStatic += 1;
                finrem.setDaRemi(Integer.parseInt(format1));
                // finrem.setNoCnb(Integer.parseInt(data[0]));
                finrem.setdAttrt(Integer.parseInt(format1));

                StringBuffer sbf2 = new StringBuffer(Double.toString(montantTot));
                int pos2 = (sbf2.toString()).indexOf(".");
                String tot = sbf2.deleteCharAt(pos2).toString();

                finrem.setMtBtOri(Utils.padLeftZeros(Integer.parseInt(tot), 7));
                // finrem.setMtBtOri(Utils.padLeftZeros(montantTot,7));
                myWriter.write(finrem.printFinrem() + "\n");

                FinPrestation finprest = new FinPrestation();
                finprest.setNoSeEnr(numseqStatic);
                numseqStatic += 1;
                myWriter.write(finprest.printFinprest() + "\n");

                FinPeriod finped = new FinPeriod();
                finped.setNoSeEnr(numseqStatic);
                numseqStatic += 1;
                myWriter.write(finped.printFinperd() + "\n");

                FinEtab finEtab = new FinEtab();
                finEtab.setNoSeEnr(numseqStatic);
                numseqStatic++;
                myWriter.write(finEtab.printFinEtab() + "\n");

                FinFlux finflu = new FinFlux();
                finflu.setDtTrt(Integer.parseInt(format1));
                finflu.setNoSeEnr(numseqStatic);
                numseqStatic = 1;
                myWriter.write(finflu.printFinFlux());

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("ERREUR LORS DE L'ECRITURE.");
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
