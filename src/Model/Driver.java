package Model;

import java.io.Serializable;

public class Driver extends Model implements Serializable {

	private String name;
	private String[] phones;
	private String[] aliasNames;
	private Tarif CurentTarif;
	private Account CurentAccount;
	private String bankID;
	private boolean OneCvigruzka;
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
	
	/*
	 * Need Methods for working:
	 * add driver
	 * add drivers from CSV file
	 * find changes and merge list
	 * delete driver
	 * change driver propirties 
	 */
	
		
}
