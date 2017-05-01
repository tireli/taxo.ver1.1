package Controller;

import Controller.ControllInterface.tarifControllsEvent;
import Model.Tarif;

public class TarifController extends Controller implements tarifControllsEvent {

	@Override
	public void addNewTarif(Tarif T) {
		// TODO Auto-generated method stub
		System.out.println("Add tarif event");
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
