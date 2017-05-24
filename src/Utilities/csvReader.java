package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import Model.Driver;
import Model.Tarif;

public class csvReader {
	
	/*
	 * make object: 
	 * 1 file path 
	 * 2 return lines
	 */
	
	private String filename;
	private BufferedReader fp;
	private int co;
	private String[] cols;

	public csvReader(String filename) {
		this.filename = filename;
		this.co = 0;
		init();
	}
	
	public void init(){
		try {
			fp = new BufferedReader(new FileReader(filename));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String[] nextItem(){
		try {
		 //	String filename = "/home/aleksei/RED/drivers08-15.csv";
	     //   BufferedReader fp = new BufferedReader(new FileReader(filename));

	       /* String[] hdr = fp.readLine().split(";");
	        if(hdr != null)
	            System.out.println(hdr[0] + "\t\t\t" + "name\t" + hdr[hdr.length - 1]);
*/
	   //     String[] cols;
	  //      int co = 0;
	        cols = null;
	        if(fp.ready()){
	//        while(co < 20){
	            cols = fp.readLine().split(",");
	            for(int i  = 0; i < cols.length; i++)
	                System.out.println(cols[0] + "^^^^^^" + '\t' + cols[i]);
	            
	       //     addDriverEvent(new Driver(cols[0], cols[3], "", "", new Tarif("Auto DEFAULT")));
	            co++;	
	            
	       }else{
	    	   fp.close();
	    	   fp  = null;
	    	   return null;
	       }
	        
	//        hdr = null;
	    } catch(Exception e){
	        e.printStackTrace();
	    }
		
		
		
		return cols;
		
	}

}
