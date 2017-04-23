package Model;

import java.util.ArrayList;

import View.dataTransferObjAddTaxo;
import View.myAddTaxoListener;

public class Model implements myAddTaxoListener {
	private ArrayList<TaxoPark> ParkList;
	
	public void takeParkList(){
		ParkList = new ParkListReader().getParkList();
		System.out.println(ParkList);
	}

	public Model() {
		takeParkList();
	}
		
	public boolean putParkList(ArrayList<TaxoPark> ParkList){
		boolean ansver = new writeFileOnDisk(ParkList, new ParkListReader().getFile()).setParklist();
		
		return ansver;
	}

	@Override
	public void AddTaxo(dataTransferObjAddTaxo data) {
		// TODO Auto-generated method stub
		
		System.out.println("event add Taxo ");
		
		
	}

	
	
	
}
