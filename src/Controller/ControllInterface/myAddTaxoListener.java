package Controller.ControllInterface;

import View.dataTransferObjAddTaxo;

public interface myAddTaxoListener {
	public void AddTaxo(dataTransferObjAddTaxo data);
	
	public void removeTaxo(int i);
	
	/*
	 * step two - add events about taxopark element
	 * -remove
	 * -change
	 */
}
