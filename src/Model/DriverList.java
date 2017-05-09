package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class DriverList extends Model implements Serializable {

	
	private ArrayList<Driver> DriverList = new ArrayList<Driver>();
	private Driver curentDriver;
	
	
	public DriverList(ArrayList<Driver> driverList, Driver curentDriver) {
		
		this.curentDriver = curentDriver;
	}


	public ArrayList<Driver> getDriverList() {
		return DriverList;
	}


	public Driver getCurentDriver() {
		return curentDriver;
	}


	public void setDriverList(ArrayList<Driver> driverList) {
		DriverList = driverList;
	}


	public void setCurentDriver(Driver curentDriver) {
		this.curentDriver = curentDriver;
	}
	
	/*
	 * Need Methods for working:
	 * add driver
	 * add drivers from CSV file
	 * find changes and merge list
	 * delete driver
	 * change driver propirties 
	 */
	
	public void addDriver(String driverName, String driverPhoneNumber) {
		/*
		 * Add new Driver to list
		 */
	}
	
	public void addDriverFromCSV(String driverName, String driverPhoneNumber) {
		/*
		 * Add new Driver to list from CSV file
		 */
	}
	
	public void changeDriver(int indexInCurentList, changeInfo changeInfo) {
		/*
		 * change Driver
		 */
	}
	
	public void deleteCurentDriver(int indexInCurentList) {
		/*
		 * delete driver
		 */
	}
	
	
	
	
	
	
}
