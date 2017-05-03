package View;

import java.awt.EventQueue;

import Model.Model;

public class View {

	private Taksi generalWindow;
	private Model model;

	public View(Model model) {
		generalWindow = new Taksi(model);
	}
	
	public void setChangeWindow(){
		System.out.println("setChangeWindow");
		generalWindow.setCange();
	}

	public Taksi getGeneralWindow() {
		return generalWindow;
	}
	

}
