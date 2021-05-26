package utils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Panel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Utils {
    
   
    public static boolean isNumeric(String string) {
    long intValue;
		
  //  System.out.println(String.format("Parsing string: \"%s\"", string));
		
    if(string == null || string.equals("")) {
      //  JOptionPane.showMessageDialog(null, "An error occurred when creating config file "+"\n");            
      //  System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Long.parseLong(string);
        return true;
    } catch (NumberFormatException e) {
       // System.out.println("Input String cannot be parsed to Integer.");
    }
    return false;
}
    
     
 public static String  readFile( String path) throws FileNotFoundException, IOException{
  String st=""; 
try{
 File fi = new File(path); 
 BufferedReader br = new BufferedReader(new FileReader(fi)); 
 st = br.readLine(); 
 if(st.equals("")){     
  JOptionPane.showMessageDialog(null, "Sequence Number might have not been initialized" + "\n");            
     System.exit(1);     
}
    else{ 
     st=st.trim();
 //System.out.println(st); 
  BufferedWriter writer = new BufferedWriter(new FileWriter(fi));
  int val=Integer.parseInt(st)+1;
writer.write(String.valueOf(val));
      writer.flush();
 }
}
catch(NullPointerException e){
      JOptionPane.showMessageDialog(null, "configuration File not Found" + "\n");            

}
 return st;

    }           
     public static void csvTable(JPanel pan, String source,JTable table) {
    //super(title);
   // JTable table = new JTable();
    JScrollPane scroll = new JScrollPane(table);
    String[] colNames = { "Electronic Payment Contract Number ", "Transaction ID", "Transaction Amount", " Transaction Direction(DT or CT)"};
    DefaultTableModel model = new DefaultTableModel(colNames, 0);
    InputStream is;
    try {
        if(source.indexOf("http")==0) {
            URL facultyURL = new URL(source);
            is = facultyURL.openStream();
        }
        else { //local file?
            File f = new File(source);
            is = new FileInputStream(f);
        }
        insertData(is,model,table);
        //table.getColumnModel().getColumn(0).setCellRenderer(new CustomCellRenderer());
    }
    catch(IOException ioe) {
        JOptionPane.showMessageDialog(pan, ioe, "Error reading data", JOptionPane.ERROR_MESSAGE);
    }

    JPanel buttonPanel = new JPanel();
   JButton closeButton = new JButton("Close");
    JButton webButton = new JButton("Proctinator.com");
    buttonPanel.add(closeButton);
    buttonPanel.add(new JLabel("   You can download this file from our site: "));
    buttonPanel.add(webButton);

    JPanel notesPanel = new JPanel();
    JLabel note1 = new JLabel(" Make sure that your list is formatted exactly as shown below, including the *markers between categories ");
    JLabel note2 = new JLabel(" Be sure to place each faculty member into the correct category: *Teacher, *Subs, *TeacherAids, *TeacherAssistants ");
    JLabel note3 = new JLabel(" Note that the your faculty list must be a plain text file:  Export to either CSV or tab delimited format.");
    BoxLayout layout = new BoxLayout(notesPanel, BoxLayout.Y_AXIS);
    notesPanel.setLayout(layout);
    notesPanel.add(note1);
    notesPanel.add(note2);
    notesPanel.add(note3);       
 /*  getContentPane().add(notesPanel, BorderLayout.NORTH);
    getContentPane().add(scroll, BorderLayout.CENTER);
    getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    pack();
    */
}

public static void insertData(InputStream is,DefaultTableModel model,JTable table) {
    Scanner scan = new Scanner(is);
    String[] array;
    while (scan.hasNextLine()) {
        String line = scan.nextLine();
        if(line.indexOf(",")>-1)
            array = line.split(",");
        else
            array = line.split("\t");
        Object[] data = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            data[i] = array[i];

        model.addRow(data);
    }
    table.setModel(model);
}
    
	
	
	public static String padLeftZeros(String inputString, int length) {
		if (inputString.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		
		while (sb.length() < length - inputString.length()) {
			sb.append('0');
		}
		sb.append(inputString);
		return sb.toString();
	}
	
	public static String padRightSpace(String inputString, int length) {
		int var= inputString.length();
		if (var>= length) {
			
			return inputString;
		}
		else {
		while(var< length) {
			inputString=inputString+" ";
			var +=1;		
		}
		
		return inputString;
		}
	}
	
	public static int  padLeftZeros(int inputString, int length) {
		String val= String.valueOf( inputString);
		
		if (val.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		
		while (sb.length() < length - val.length()) {
			sb.append('0');
		}
		sb.append(inputString);
		return Integer.parseInt(sb.toString());
	}
	
	public static String  getsensTrans(String action) {
		
		if(action.equals("REFUND")) {return "DT";}
		else if(action.equals("CAPTURE")) {return "CT";}
		else return null;
		
	}
	public int findPosChar(char c,String s) {
		
	if((s.indexOf(c)!=-1)){return s.indexOf(c );}
	else return Integer.parseInt(s);
        } 
        
        
        
	/*public static int padRightIntSpace(int inputString, int length) {
		int var= String.valueOf(inputString).length();
		String str="";

          if (var>= length) {
			
			return inputString;
		}
		else {
		while(var< length) {		
		str =String.valueOf(inputString)+" ";
			var +=1;		
		}
		inputString=Integer.parseInt(str);
		return inputString;
	}

	}
	*/
	

}
