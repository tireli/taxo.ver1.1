package Controller;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import Controller.ControllInterface.myAddTaxoListener;
import Model.Model;
import Model.TaxoPark;
import View.dataTransferObjAddTaxo;

public class ParkEventControll extends Controller implements myAddTaxoListener {
	
	private dataTransferObjAddTaxo addTaxo;
	private String taxoName;
	private String taxoCitiName;
	private String taxoSystem;
	private String LicenseKey;
	private ArrayList<TaxoPark> referParkList;
	private DefaultListModel listModel = new DefaultListModel();
	private boolean addFlag;
	
	
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

}
