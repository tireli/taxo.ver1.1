package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class TripList extends Model implements Serializable {
	
	private ArrayList<Trip> TripList = new ArrayList<Trip>();

	public TripList(ArrayList<Trip> tripList) {
		super();
		TripList = tripList;
	}

	public ArrayList<Trip> getTripList() {
		return TripList;
	}

	public void setTripList(ArrayList<Trip> tripList) {
		TripList = tripList;
	}
	
	

}
