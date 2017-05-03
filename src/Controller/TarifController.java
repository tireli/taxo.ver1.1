package Controller;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;

import Controller.ControllInterface.tarifControllsEvent;
import Model.Tarif;
import Model.TaxoPark;
import View.Taksi;

public class TarifController extends Controller implements tarifControllsEvent {

	@Override
	public void addNewTarif(Tarif T) {
		// TODO Auto-generated method stub
		System.out.println("Add tarif event");
		//find select Taxo or GetFirst
		
		int targetIndex;
		Taksi GWrefer = view.getGeneralWindow();
		
		
		
		JList GWParkList = GWrefer.getList();
		
		if (GWParkList.getSelectedIndex() > 0) {
			targetIndex = GWParkList.getSelectedIndex();
		}else {
			targetIndex = 0;
		}
		
		// Add tarif to target TaxoPark
		
		
		
		ArrayList<TaxoPark> TP = model.getParkList();
		TaxoPark targetTP = TP.get(targetIndex);
		targetTP.addTarif(T);
		view.setChangeWindow();
		model.WriteChanges();
	}

	@Override
	public void removeTarif(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void copyTarif() {
		// TODO Auto-generated method stub

	}

}
