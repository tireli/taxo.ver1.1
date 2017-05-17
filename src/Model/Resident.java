package Model;

import java.io.Serializable;

public class Resident extends Model implements Serializable {
	
	private String residentTypeName;
	
	public Resident(String residentTypeName) {
		this.residentTypeName = residentTypeName;
	}



	public String getResidentName() {
		// TODO Auto-generated method stub
		return this.residentTypeName;
	}

}
