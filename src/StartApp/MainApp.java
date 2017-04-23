package StartApp;

import javax.swing.SwingUtilities;

import Controller.Controller;
import Model.Model;
import View.View;

public class MainApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				runApp();
			}

			
		});
	}
	
	private static void runApp() {
		// TODO Auto-generated method stub
		Model model = new Model();
		
		View view = new View(model);
		
		Controller controller = new Controller(model, view);
		
	//	view.setLoginListener(controller);
	}

}
