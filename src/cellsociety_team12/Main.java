package cellsociety_team12;

import cellsociety_team12.Setup;
import javafx.application.Application;
import javafx.stage.Stage;

/** 
 * The Main class starts the program. It calls the Setup method which does all setup work
 * for the simulation. This class has no dependencies.
 *
 * @author advaitreddy
 *
 */

public class Main extends Application {

	public void start(Stage s) throws Exception {
		
		new Setup(s);
	}

	public static void main(String[] args) {
		launch();
	}

}
