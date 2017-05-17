package Model;

import java.util.ArrayList;

import Controller.ControllInterface.myAddTaxoListener;
import View.dataTransferObjAddTaxo;

public class Model{
	private ArrayList<TaxoPark> ParkList = new ArrayList<TaxoPark>();//driverSuperList
	private driverSuperList driverSuperListLink = new driverSuperList();//<TaxoPark>();
	
	public ArrayList<TaxoPark> takeParkList(){
		ParkList = new ParkListReader().getParkList();
		System.out.println(ParkList);
		if (ParkList != null) {
			return ParkList;
		}else {
			 
			return getParkList();//ParkList;
		}
		
	}

	public Model() {
		
	}
		
	public boolean putParkList(ArrayList<TaxoPark> ParkList){
		boolean ansver = new writeFileOnDisk(ParkList, new ParkListReader().getFile()).setParklist();
		
		return ansver;
	}

	public ArrayList<TaxoPark> getParkList() {
		System.out.println("getParkList");
		return ParkList;
	}
	

	public void setParkList(ArrayList<TaxoPark> parkList) {
		ParkList = parkList;
	}

	public void WriteChanges() {
		System.out.println("in WriteChanges");
//		writeFileOnDisk wfod = new writeFileOnDisk(ParkList, "/aleksei/red/serFileToSave.fts");
		Thread t = new Thread(new writeFileOnDisk(ParkList, "/home/aleksei/RED/serFileToSave.fts"));
		t.start();
		/*
		Thread t2 = new Thread(new writeFileOnDisk(driverSuperListLink, "/home/aleksei/RED/serFileToSave2.fts"));
		t2.start();*/
		
		
	}

	public driverSuperList getDriverSuperListLink() {
		return driverSuperListLink;
	}

	

	
	
	
	
}
