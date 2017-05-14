package Model;

import java.io.Serializable;

public class Driver extends Model implements Serializable {

	private String name;
	private String lastName;
	private String phserName;
	private String[] phones;
	private String[] aliasNames;
	private Tarif CurentTarif;
	private Account CurentAccount;
	private String bankID;
	private boolean OneCvigruzka;
	private Resident residentType;
//	private 
//	private 
	
	public Driver(String name, String phone, String aliasName,
			Tarif curentTarif, Account curentAccount, String bankID) {
		this.name = name;
		this.phones = new String[5];
		this.phones[0] = phone;
		this.aliasNames = new String[5];
		this.aliasNames[0] = aliasName;
		CurentTarif = curentTarif;
		CurentAccount = curentAccount;
		this.bankID = bankID;
	}
	public Driver(String name, String phone) {
		this.name = name;
		this.phones = new String[5];
		this.phones[0] = phone;
	}
	public Driver(String name, String phone, String lastName, String phserName,
			Tarif tarif/*, Resident resident*/) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.lastName = lastName;
		this.phserName = phserName;
		this.phones = new String[5];
		this.phones[0] = phone;
		this.CurentTarif = tarif;
		//this.residentType = resident;
		
	}
	public String getName() {
		return name;
	}
	public String[] getPhones() {
		return phones;
	}
	public String[] getAliasNames() {
		return aliasNames;
	}
	public Tarif getCurentTarif() {
		return CurentTarif;
	}
	public Account getCurentAccount() {
		return CurentAccount;
	}
	public String getBankID() {
		return bankID;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhserName() {
		return phserName;
	}
	public boolean isOneCvigruzka() {
		return OneCvigruzka;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhones(String[] phones) {
		this.phones = phones;
	}
	public void setAliasNames(String[] aliasNames) {
		this.aliasNames = aliasNames;
	}
	public void setCurentTarif(Tarif curentTarif) {
		CurentTarif = curentTarif;
	}
	public void setCurentAccount(Account curentAccount) {
		CurentAccount = curentAccount;
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	public void setOneCvigruzka(boolean oneCvigruzka) {
		OneCvigruzka = oneCvigruzka;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhserName(String phserName) {
		this.phserName = phserName;
	}
	public int compareDriver(Driver comparableDriver) {
		// TODO Auto-generated method stub
		String[] comparePhones = comparableDriver.getPhones();
		boolean phoneCheck = false;
		System.out.println("phoneCheck =  " + phoneCheck);
		for (int i = 0; i < this.phones.length; i++) {
			for (int j = 0; j < comparePhones.length; j++) {
				System.out.println(this.phones[i]  + " = " +  comparePhones[j]);
				if (this.phones[i] != null && comparePhones[j] != null) {
					if (this.phones[i].equals(comparePhones[j])) {
						phoneCheck = true;
					}
				}
				
			}
		}
		System.out.println("phoneCheck =  " + phoneCheck);
		boolean nameCheck = false;
		if (this.name == comparableDriver.getName()/* &&
				this.lastName == comparableDriver.getLastName()*/) {
			nameCheck = true;
		}
		
		if (nameCheck && phoneCheck) {
			return 2;
		}else if (nameCheck || phoneCheck) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	/*
	 * Need Methods for working:
	 * add driver
	 * add drivers from CSV file
	 * find changes and merge list
	 * delete driver
	 * change driver propirties 
	 */
	
		
}
