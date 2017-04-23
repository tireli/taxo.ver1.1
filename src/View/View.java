package View;

import Model.Model;

public class View {

	private Taksi generalWindow;
	private Model model;

	public View(Model model) {
		// TODO Auto-generated constructor stub
		
		this.model = model;
		generalWindow = new Taksi(model);
		generalWindow.start();
	}
	
	public void setChangeWindow(){
		System.out.println("setChangeWindow");
		generalWindow.setCange();
	}

}
