package StartApp;

import Controller.Controller;
import Model.Model;
import View.View;

public class runMyApp implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		runApp();
	}
	private static void runApp() {
		// TODO Auto-generated method stub
		Model model = new Model();
		
		View view = new View(model);
		
		Controller controller = new Controller(model, view);
		
	//	view.setLoginListener(controller);
	}
}
