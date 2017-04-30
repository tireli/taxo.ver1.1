package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ParkListReader {
	
	private String filePath = "/home/aleksei/RED/serFileToSave.fts";
	private File f1;
	private ArrayList<TaxoPark> ParkList;
	
	ParkListReader(){
		if (checFile()) {
			readFile(f1);
		}
	}
	
	public boolean checFile(){
		f1 = new File(filePath);
		if (f1.exists()) {
			return true;
		}else {
			return false;
		}
	}
	
	public File makeFile(){
		File f1 = new File(filePath);
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("FMK ERR");
		}
	//	f1.setWritable(true);
	//	System.out.println(filePath + fileName);
		return f1;
	}		
	
	public void readFile(File f1){
		try (ObjectInputStream CI = new ObjectInputStream(new FileInputStream(f1))){
			System.out.println("Read file");
			ArrayList<TaxoPark> readObject = (ArrayList<TaxoPark>) CI.readObject();
			ParkList = readObject;
			System.out.println(readObject);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOExc" + e.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			System.out.println("IOExc" + e.toString());
		}
	}

	public ArrayList<TaxoPark> getParkList() {
		return ParkList;
	}

	public File getFile() {
		return f1;
	}
	
	
}
