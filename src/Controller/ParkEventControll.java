package Controller;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Controller.ControllInterface.DriversEvent;
import Controller.ControllInterface.myAddTaxoListener;
import Model.Driver;
import Model.Model;
import Model.TaxoPark;
import Model.changeInfo;
import Model.driverSuperList;
import View.Taksi;
import View.dataTransferObjAddTaxo;

public class ParkEventControll extends Controller implements myAddTaxoListener, DriversEvent {
	
	private dataTransferObjAddTaxo addTaxo;
	private String taxoName;
	private String taxoCitiName;
	private String taxoSystem;
	private String LicenseKey;
	private ArrayList<TaxoPark> referParkList;
	private DefaultListModel listModel = new DefaultListModel();
	private boolean addFlag;
	private TaxoPark currentTaxoPark;
	
	/*
	 * Constant
	 */
	final private int DRIVER_COMPARE_OK = 2;
	final private int DRIVER_COMPARE_WARNING = 1;
	final private int DRIVER_COMPARE_ERROR = 0;
	private ArrayList<Driver> driverList;
	
	@Override
	public void AddTaxo(dataTransferObjAddTaxo data) {
		
		ArrayList<TaxoPark> nameList = model.getParkList();// Old DATA from model
		
		// TODO Auto-generated method stub
		System.out.println("Add Taxo event");
		System.out.println(data.toString());
		this.taxoName = data.getTextFieldNewTaxoSelfName().getText();
		this.taxoCitiName = data.getTxtNewTaxoCitiName().getText();
		this.taxoSystem = data.getComboBox().getSelectedItem().toString();
		
		TaxoPark newTaxo = new TaxoPark(taxoName, taxoCitiName, taxoSystem);
		addFlag = true;
		if (nameList != null) {
				
			
			if (nameList.size() > 0) {
				for (int i = 0; i < nameList.size(); i++) {//For each TaxoPark check double
					System.out.println("nameList[i] " + nameList.get(i));
					System.out.println("nameList.get(i).equalsForTaxopark(newTaxo) = " + nameList.get(i).equalsForTaxopark(newTaxo));
					if (nameList.get(i).equalsForTaxopark(newTaxo)){
						System.out.println("Уже есть такой таксопарк");
						addFlag = false;
					}
				}
			}else{
				System.out.println("nameList.size() " + nameList.size());
			}
		}else {
			nameList = new ArrayList<TaxoPark>();
			//nameList.add(newTaxo);
			model.setParkList(nameList);
		}
		
		System.out.println("addFlag " + addFlag);
		if (addFlag) {
			nameList.add(newTaxo);
			view.setChangeWindow();
			model.WriteChanges();
		}
		
	}
	
	void changeModelAddTaxo(TaxoPark newTaxo){
	//	System.out.println("changeModelAddTaxo");
	//	System.out.println(model.toString());
	//	referParkList = model.getParkList();
	//	TaxoPark newTaxo = new TaxoPark(taxoName, taxoCitiName, taxoSystem);
	//	referParkList.add(newTaxo);
	//	view.setChangeWindow();
	}

	@Override
	public void removeTaxo(int i) {
		// TODO Auto-generated method stub
		ArrayList<TaxoPark> nameList = model.getParkList();// Old DATA from model
		nameList.remove(i);
		view.setChangeWindow();
		model.WriteChanges();
	}

	@Override
	public void addDriverEvent(Driver driver) {
		// TODO Auto-generated method stub
		System.out.println(driver.getName() + "  -  " + driver.getPhones());
		/*
		 * Do add new Driver
		 * 1 - find selected taxoPark
		 */
		boolean dirverAddInListFlag = false;
		ArrayList<TaxoPark> taxoParkList = model.getParkList();
		Taksi GeneralWindow = view.getGeneralWindow();
		JList ViewModelList = GeneralWindow.getList();
		if (ViewModelList != null) {
			int currentTaxoParkIndex = ViewModelList.getSelectedIndex();
			System.out.println("currentTaxoParkIndex +  " + currentTaxoParkIndex);
			try {
				currentTaxoPark = taxoParkList.get(currentTaxoParkIndex);
				} catch (NullPointerException e) {
				// TODO: handle exception
					currentTaxoPark = taxoParkList.get(0);
				}catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					currentTaxoPark = taxoParkList.get(0);
				}
			
			
			
			/*
			 * 2 check for double in current TaxoPark 
			 */
			
			driverList = currentTaxoPark.getDriverList();
			if (driverList == null) {
				driverList = currentTaxoPark.setDriverList();
			}
			
			outer:	for (int i = 0; i < driverList.size(); i++) {
				Driver comparableDriver = driverList.get(i);
				System.out.println("Start Driver compare at i = " + i);
				System.out.println("driverList.get(i) = " + driverList.get(i).getName());
				switch (driver.compareDriver(comparableDriver)) {
				case DRIVER_COMPARE_OK:
					/*
					 * Driver Find
					 * to do - nothing
					 */
					System.out.println("DRIVER_COMPARE_OK FOR 1");
					continue outer;
				//	break;
				case DRIVER_COMPARE_WARNING:
					/*
					 * Driver not find, but heave same fields
					 * to do - search in superList
					 */
					System.out.println("DRIVER_COMPARE_WARNING FOR 1");
					ArrayList<Driver> driverSuberList = model.getDriverSuperListLink().getSuperList();
					for (int j = 0; j < driverSuberList.size(); j++) {
						Driver secondCompareDriver = driverSuberList.get(j);
						switch (driver.compareDriver(secondCompareDriver)) {
						case DRIVER_COMPARE_OK:
							/*
							 * Driver Find
							 * to do - nothing
							 */
						//	driverSuberList.add(driver);
							System.out.println("DRIVER_COMPARE_OK FOR 2");
							
							continue;
						//	break;
						case DRIVER_COMPARE_WARNING:
							System.out.println("DRIVER_COMPARE_WARNING FOR 2");
							
							break;
						case DRIVER_COMPARE_ERROR:
							/*
							 * Driver not find
							 */
							System.out.println("DRIVER_COMPARE_ERROR FOR 2");
							driverSuberList.add(driver);
							System.out.println("Start Driver add 2 ERR");
							driverList.add(driver);
							break;

						default:
							break;
						}
					}
					dirverAddInListFlag = false;
					break outer;
				//	break;
				case DRIVER_COMPARE_ERROR:
					/*
					 * Driver not find
					 */
					System.out.println("DRIVER_COMPARE_ERROR FOR 1");
					System.out.println("Start Driver add 1 ERR");
					
			//		driverList.add(driver);
					dirverAddInListFlag = true;
			//		break outer;

				default:
					break;
				}
			System.out.println("dirverAddInListFlag in FOR " + dirverAddInListFlag);
			}
			System.out.println("dirverAddInListFlag " + dirverAddInListFlag);
			if (driverList.size() <= 0) {
				System.out.println("Start Driver add");
				driverList.add(driver);
			}
			if (dirverAddInListFlag) {
				driverList.add(driver);
			}
			/*
			 * check for double in Super list 
			 */
			boolean heavDoubleInSuperList = false;
			if (heavDoubleInSuperList) {
				/*
				 * ???
				 */
			}else {
				/*
				 * 
				 */
			}
			
			
		}else {
			/*
			 * Error
			 */
		}
		
		
		
		view.upDateDriverInfoInGeneralWindow();
		model.WriteChanges();
	}

	@Override
	public void changeDriverEvent(int index, changeInfo driverInfo) {
		// TODO Auto-generated method stub
		
		
		view.setChangeWindow();
		model.WriteChanges();
	}

	@Override
	public void deleteDriverEvent(int index) {
		// TODO Auto-generated method stub
		
		
		view.setChangeWindow();
		model.WriteChanges();
	}

	@Override
	public void addMenyDriverEvent(Driver driver) {
		// TODO Auto-generated method stub
		
		
		view.setChangeWindow();
		model.WriteChanges();
	}

	public void deleteAllDriverEvent() {
		// TODO Auto-generated method stub
		ArrayList<TaxoPark> taxoParkList = model.getParkList();
		Taksi GeneralWindow = view.getGeneralWindow();
		JList ViewModelList = GeneralWindow.getList();
		if (ViewModelList != null) {
			int currentTaxoParkIndex = ViewModelList.getSelectedIndex();
			System.out.println("currentTaxoParkIndex +  " + currentTaxoParkIndex);
			try {
				currentTaxoPark = taxoParkList.get(currentTaxoParkIndex);
				} catch (NullPointerException e) {
				// TODO: handle exception
					currentTaxoPark = taxoParkList.get(0);
				}catch (ArrayIndexOutOfBoundsException e) {
					// TODO: handle exception
					currentTaxoPark = taxoParkList.get(0);
				}
		}
			
		driverList = currentTaxoPark.getDriverList();	
		driverList.clear();
		
		view.upDateDriverInfoInGeneralWindow();
		model.WriteChanges();
		
	}

}
