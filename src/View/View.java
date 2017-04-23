package View;

import Model.Model;

public class View {

	private Taksi generalWindow;

	public View(Model model) {
		// TODO Auto-generated constructor stub
		
		generalWindow = new Taksi();
		generalWindow.start();
	}

}
