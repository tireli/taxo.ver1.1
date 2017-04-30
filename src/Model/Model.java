package Model;

import java.util.ArrayList;

import Controller.ControllInterface.myAddTaxoListener;
import View.dataTransferObjAddTaxo;

public class Model{
	private ArrayList<TaxoPark> ParkList = new ArrayList<TaxoPark>();
	
	public ArrayList<TaxoPark> takeParkList(){
		ParkList = new ParkListReader().getParkList();
		System.out.println(ParkList);
		return ParkList;
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

	public void WriteChanges() {
		System.out.println("in WriteChanges");
//		writeFileOnDisk wfod = new writeFileOnDisk(ParkList, "/aleksei/red/serFileToSave.fts");
		Thread t = new Thread(new writeFileOnDisk(ParkList, "/home/aleksei/RED/serFileToSave.fts"));
		t.start();
	}

	

	
	
	
	
}
