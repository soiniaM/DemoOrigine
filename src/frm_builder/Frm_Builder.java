/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm_builder;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import vues.PayLFormat;

/**
 *
 * @author SONIA
 */
public class Frm_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       try {
            new File("config.txt").createNewFile();
           new File("Idtrans.txt").createNewFile();

        } catch (IOException e) {
            //   System.out.println("An error occurred.");
            JOptionPane.showMessageDialog(null, "An error occurred when creating initiales files " + "\n");

        }
               vues.Principale p = new vues.Principale();


        
//File monFic=null;
   	 //  OtherCsv payl= new OtherCsv();
                 // payl.paylineGenere(("C:\\Users\\SONIA\\Documents\\payline.csv"));



    }

}
