package Model;

import java.io.Serializable;

public class accountHistoryItem extends Model implements Serializable {

	public accountHistoryItem(int operationType, double curentAccount,
			double curentAccrual) {
		// make history for operationType 
		
	}

	public accountHistoryItem(int sET_PAY, double curentAccount,
			double curentDebtIn, double curentDebtOut, double curentPay) {
		// TODO Auto-generated constructor stub
	}

	public accountHistoryItem(int sET_DEBT_OUT, double curentDebtOut) {
		// TODO Auto-generated constructor stub 
	}

	public double getCurrentPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCurentDebtIn() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCurentDebtOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCurentPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

}
