package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Account extends Model implements Serializable {
	
	private double curentAccount; // Driver account
	private double curentDebtIn;	// We owe the money to the driver	
	private double curentDebtOut;	//The driver owed money to us
	private double correctionofbill; //correction of bill	
	private double curentAccrual;	//Accrual
	private double curentPay;		// Pay
	private ArrayList<accountHistoryItem>  accountHistory;
	private int accountID;
	
	private static int SET_ACCRUAL = 1;
	
	
	public void setAccrual(double newAccrual){
		this.curentAccount += newAccrual;
		this.curentAccrual = newAccrual;

		accountHistoryItem item = new accountHistoryItem(SET_ACCRUAL, curentAccount, curentAccrual);
		accountHistory.add(item);
	}
	
	public void setPay() {
		this.curentPay = this.curentAccrual + this.curentDebtIn - this.curentDebtOut;
		this.curentAccount -= this.curentPay;
		/*
		 * make business logic
		 */
	}
	
}
