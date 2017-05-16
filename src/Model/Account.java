package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Account extends Model implements Serializable {
	
	private double curentAccount; // Driver account
	private double curentDebtIn;	// We owe the money to the driver	
	private double curentDebtOut;	//The driver owed money to us
	private double correctionOfBill; //correction of bill	
	private double curentAccrual;	//Accrual
	private double curentPay;		// Pay
	private ArrayList<accountHistoryItem>  accountHistory;
	private int accountID;
	
	private static int SET_ACCRUAL = 1;
	private static int SET_PAY = 2;
	private static int SET_DEBT_OUT = 3;
	private static int SET_DEBT_IN = 4;
	
	
	
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
		/*
		 * 1 Выполнить списание со счета, 
		 * если результат отрицательный то обновить дол водителя
		 * если положительный то обнулить счте и обновить долг
		 */
		
		if (this.curentAccount - this.curentPay >=0) {
			/*
			 * деньги есть - выплачиваем
			 */
			this.curentAccount -= this.curentPay;
			this.curentDebtIn = 0;
			this.curentDebtOut = 0;
			
			
			
		}else {
			/*
			 * денег нету 
			 */
			this.curentDebtIn = 0;
			this.curentDebtOut = this.curentPay - this.curentAccount;
			this.curentAccount = 0;
		}
		/*
		 * 2 создать запись отчета для формирования ведомости
		 */
		//TODO methods
		
		
		/*
		 * 3 записать историюизменений
		 */
		
		accountHistoryItem item = new accountHistoryItem(SET_PAY, curentAccount, curentDebtIn, curentDebtOut, curentPay);
		accountHistory.add(item);
	}
	
	public void setPayCancel() {
		int targetIndexOf = 0;
		/*
		 * Отменяет списание по счету, переносит начисление в долг перед водителем
		 */
		/*
		 * 1 получаем последний элемент истории
		 */
		accountHistoryItem lastPayHistoryItem = getLastHistoryItem(SET_PAY);
		
		/*
		 * 2 создаем дамп истории изменений счета после полученного элемента
		 */
		ArrayList<accountHistoryItem>  dumpAccountHistory = new ArrayList<accountHistoryItem>();
		try {
			targetIndexOf = accountHistory.indexOf(lastPayHistoryItem);
			for (int i = targetIndexOf + 1; i < accountHistory.size(); i++) {
				dumpAccountHistory.add(accountHistory.get(i));
			}
			
		} catch (NullPointerException e) {
			// TODO: handle exception
		}catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		/*
		 * 3 изменяем состояние счета в точке истории счета, в которой было произведено списание
		 */
		this.curentAccount = lastPayHistoryItem.getCurrentPay();
		this.curentDebtIn = lastPayHistoryItem.getCurentDebtIn();
		this.curentDebtOut = lastPayHistoryItem.getCurentDebtOut();
		this.curentPay = lastPayHistoryItem.getCurentPay();
		
		/*
		 * 4 повторяем историю операций после изменения состояния счета
		 */
		
		try {
			for (int i = targetIndexOf + 1; i < dumpAccountHistory.size(); i++) {
				/*
				 * make switch
				 * проделать функции по изменению состояния счета согласно истории 
				 */
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
	}
	
	public void setDebtOut(double newCurentDebtOut) {
		this.curentDebtOut = newCurentDebtOut;
		
		accountHistoryItem item = new accountHistoryItem(SET_DEBT_OUT, curentDebtOut);
		accountHistory.add(item);
	}
	
	public void setDebtIn(double newCurentDebtIn) {
		this.curentDebtIn = newCurentDebtIn;
		
		accountHistoryItem item = new accountHistoryItem(SET_DEBT_IN, curentDebtIn);
		accountHistory.add(item);
	}
	
	
	
	
	
	private accountHistoryItem getLastHistoryItem(int typeHistoryItem) {
		// TODO Auto-generated method stub
		
		try {
			for (int i = accountHistory.size(); i < 0; i--) {
				accountHistoryItem historiItem = accountHistory.get(i);
				if (historiItem.getType() == typeHistoryItem) {
					return historiItem;
				}
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		return null;
	}
	
}
