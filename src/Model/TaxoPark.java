package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class TaxoPark implements Serializable {
	
////////////////////////////////////////////////////////////////
//Constructors
////////////////////////////////////////////////////////////////
	
	private ArrayList<Driver> DriverList;


	public TaxoPark(String name, String citiName, String taxiSystem) {
	// TODO Auto-generated constructor stub
		this.name = name;
		this.citiName = citiName;
		this.taxiSystem = taxiSystem;
		TarifList = new ArrayList<Tarif>();
		DriverList = new ArrayList<Driver>();
	}
	
	
	
	////////////////////////////////////////////////////////////////
	//Fields
	////////////////////////////////////////////////////////////////
	private String name, citiName, taxiSystem;
	private ArrayList<Tarif> TarifList;// = new ArrayList<Tarif>();


	////////////////////////////////////////////////////////////////
	//Geters
	////////////////////////////////////////////////////////////////
	public ArrayList<Tarif> getTarifList() {
		return TarifList;
	}
	/**
	* @return the name
	*/
	public String getName() {
		return name;
	}
	
	/**
	* @return the taxiSystem
	*/
	public String getTaxiSystem() {
	return taxiSystem;
	}
	
	/**
	* @return the citiName
	*/
	public String getCitiName() {
	return citiName;
	}
	
	/**
	* @return the DriverList
	*/
	public ArrayList<Driver> getDriverList() {
	return DriverList;
	}
	////////////////////////////////////////////////////////////////
	//Seters
	////////////////////////////////////////////////////////////////
	public void setTarifList(ArrayList<Tarif> tarifList) {
		TarifList = tarifList;
	}
	/**
	* @param Name the name to set
	*/
	public void setName(String name) {
	this.name = name;
	}
	
	/**
	* @param taxiSystem the taxiSystem to set
	*/
	public void setTaxiSystem(String taxiSystem) {
	this.taxiSystem = taxiSystem;
	}
	
	/**
	* @param citiName the citiName to set
	*/
	public void setCitiName(String citiName) {
	this.citiName = citiName;
	}
	
	public ArrayList<Driver> setDriverList() {
		// TODO Auto-generated method stub
		this.DriverList = new ArrayList<Driver>();
		return DriverList;
	}
	
	/* (non-Javadoc)
	* @see java.lang.Object#toString()
	*/
	
	
	////////////////////////////////////////////////////////////////
	//Methods
	////////////////////////////////////////////////////////////////
	@Override
	public String toString() {
	return "taxoPark [name=" + name + ", citiName=" + citiName
	+ ", taxiSystem=" + taxiSystem + "]";
	}
	
	public boolean equalsForTaxopark(TaxoPark TP) {//Get equals for Name, cityName & systemType
		System.out.println(TP.getTaxiSystem());
		if(this.name.equals(TP.getName()) 
				&& this.citiName.equals(TP.getCitiName())
				&& this.taxiSystem.equals(TP.getTaxiSystem())){
			return true;
		}else {
			return false;
		}
	}
	
	public void addTarif(Tarif T) {
		System.out.println(T);
		TarifList.add(T);
	}
	

}
