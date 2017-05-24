package Model;

import java.io.Serializable;

import javafx.scene.chart.PieChart.Data;

public class Trip extends Model implements Serializable {
	/*
	 * fields
	 */
	
	private String driverName;
	private String driverPhone;
	private String tripType;// for Uber: trip/misc, for other: trip
	private Data data;
	private String fareCostS;// for Uber save initial
	private int fareCost;
	private String surgeS;// for Uber save initial
	private int surge;
	private String tollS;// for Uber save initial
	private int toll;
	private String ohterS;// for Uber save initial
	private int ohter;
	private String totalCostS;// for Uber save initial
	private int totalCost;
	
	/*
	 * Other fields for 
	 */
	
	private int forTee;
	private int cash;
	private int doplata;
	private int uderganie;
	
	public Trip(String driverName, String driverPhone, String tripType,
			Data data, String fareCostS, int fareCost, String surgeS,
			int surge, String tollS, int toll, String ohterS, int ohter,
			String totalCostS, int totalCost, int forTee, int cash,
			int doplata, int uderganie) {
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.tripType = tripType;
		this.data = data;
		this.fareCostS = fareCostS;
		this.fareCost = fareCost;
		this.surgeS = surgeS;
		this.surge = surge;
		this.tollS = tollS;
		this.toll = toll;
		this.ohterS = ohterS;
		this.ohter = ohter;
		this.totalCostS = totalCostS;
		this.totalCost = totalCost;
		this.forTee = forTee;
		this.cash = cash;
		this.doplata = doplata;
		this.uderganie = uderganie;
	}

	public Trip(String driverName, String driverPhone, String tripType,
			Data data, String fareCostS, int fareCost, String surgeS,
			int surge, String tollS, int toll, String ohterS, int ohter,
			String totalCostS, int totalCost) {//Uber constructor
		super();
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.tripType = tripType;
		this.data = data;
		this.fareCostS = fareCostS;
		this.fareCost = fareCost;
		this.surgeS = surgeS;
		this.surge = surge;
		this.tollS = tollS;
		this.toll = toll;
		this.ohterS = ohterS;
		this.ohter = ohter;
		this.totalCostS = totalCostS;
		this.totalCost = totalCost;
	}

	public Trip(String driverName, String driverPhone, Data data, int fareCost,
			int totalCost, int forTee, int cash, int doplata, int uderganie) {
		//Gett constructor
		this.driverName = driverName;
		this.driverPhone = driverPhone;
		this.data = data;
		this.fareCost = fareCost;
		this.totalCost = totalCost;
		this.forTee = forTee;
		this.cash = cash;
		this.doplata = doplata;
		this.uderganie = uderganie;
	}
	
	
	/*
	 * Getters
	 */
	public String getDriverName() {
		return driverName;
	}

	public String getDriverPhone() {
		return driverPhone;
	}

	public String getTripType() {
		return tripType;
	}

	public Data getData() {
		return data;
	}

	public String getFareCostS() {
		return fareCostS;
	}

	public int getFareCost() {
		return fareCost;
	}

	public String getSurgeS() {
		return surgeS;
	}

	public int getSurge() {
		return surge;
	}

	public String getTollS() {
		return tollS;
	}

	public int getToll() {
		return toll;
	}

	public String getOhterS() {
		return ohterS;
	}

	public int getOhter() {
		return ohter;
	}

	public String getTotalCostS() {
		return totalCostS;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public int getForTee() {
		return forTee;
	}

	public int getCash() {
		return cash;
	}

	public int getDoplata() {
		return doplata;
	}

	public int getUderganie() {
		return uderganie;
	}

	/*
	 * setters
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setFareCostS(String fareCostS) {
		this.fareCostS = fareCostS;
	}

	public void setFareCost(int fareCost) {
		this.fareCost = fareCost;
	}

	public void setSurgeS(String surgeS) {
		this.surgeS = surgeS;
	}

	public void setSurge(int surge) {
		this.surge = surge;
	}

	public void setTollS(String tollS) {
		this.tollS = tollS;
	}

	public void setToll(int toll) {
		this.toll = toll;
	}

	public void setOhterS(String ohterS) {
		this.ohterS = ohterS;
	}

	public void setOhter(int ohter) {
		this.ohter = ohter;
	}

	public void setTotalCostS(String totalCostS) {
		this.totalCostS = totalCostS;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public void setForTee(int forTee) {
		this.forTee = forTee;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public void setDoplata(int doplata) {
		this.doplata = doplata;
	}

	public void setUderganie(int uderganie) {
		this.uderganie = uderganie;
	}
	
	
	
}
