package Model;

import java.util.ArrayList;

import View.dataTransferObjAddTaxo;
import View.myAddTaxoListener;

public class Model {
	private ArrayList<TaxoPark> ParkList = new ArrayList<TaxoPark>();
	
	public void takeParkList(){
		ParkList = new ParkListReader().getParkList();
		System.out.println(ParkList);
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

	
	
	
	
}
