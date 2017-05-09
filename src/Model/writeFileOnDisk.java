package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class writeFileOnDisk implements Runnable {

	private ArrayList<TaxoPark> parkList;
	private File f1;
	private File f;
	
	public writeFileOnDisk(ArrayList<TaxoPark> parkList, File f1) {
		// TODO Auto-generated constructor stub
		
		this.parkList = parkList;
		this.f1 = f1;
		
	}
	public writeFileOnDisk(ArrayList<TaxoPark> parkList, String f1) {
		// TODO Auto-generated constructor stub
		
		this.parkList = parkList;
		File f = new File(f1);
		try {
			f.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.f1 = (File) f;
		if (f.exists()) {
			System.out.println("Файл создан в конструкторе");
		}
		
	}
	
	/*
	public writeFileOnDisk(driverSuperList driverSuperListLink, String string) {
		// TODO put in file superList
	}*/
	
	
	public boolean setParklist(){
		
		
		return true;
	}
	
	public void putThis(ArrayList<TaxoPark> parkList){
		System.out.println("in putThis");
		/*
		if ((f1).exists()) {
			System.out.println("Файл определн");
			if (((File) f1).canWrite()) {*/
				try (ObjectOutputStream CO = new ObjectOutputStream(new FileOutputStream(f1))){
					
					CO.writeObject(parkList);
					CO.flush();
					
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("IOExc" + e.toString());
				}
		/*	}else {
				System.out.println("File Error");
			}
		}else {
			System.out.println("Файла нет" + f1);
		}*/
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("in run in new thread");
		putThis(parkList);
		
	}
}
