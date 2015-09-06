package garhping;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application{

	public static void main(String[] args)  {
		Application.launch(Start.class, args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
		primaryStage.setScene(new Scene(root, 600, 600));
		primaryStage.show();
	}

}
