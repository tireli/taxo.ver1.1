package Model;

import java.util.ArrayList;

public class Model {
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
	
	
}
