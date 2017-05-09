package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class driverSuperList  implements Serializable {
	
	private ArrayList<Driver> superList = new ArrayList<Driver>();;

	public driverSuperList() {
		
		
	}

	public ArrayList<Driver> getSuperList() {
		return superList;
	}
	
	public void addDriverToSuperList(Driver driver) {
		this.superList.add(driver);
	}
	

}
