package Controller.ControllInterface;

import Model.Tarif;

public interface tarifControllsEvent {
	public void addNewTarif(Tarif T);
	
	public void removeTarif(int i);
	
	public void copyTarif();
}
