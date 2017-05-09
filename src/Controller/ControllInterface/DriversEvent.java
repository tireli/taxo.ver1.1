package Controller.ControllInterface;

import Model.Driver;
import Model.changeInfo;

public interface DriversEvent {
	
	public void addDriverEvent(Driver driver); 
	
	public void changeDriverEvent(int index, changeInfo driverInfo); 

	public void deleteDriverEvent(int index); 
	
	public void addMenyDriverEvent(Driver driver); 

}
