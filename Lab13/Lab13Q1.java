package Lab13;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Lab13Q1 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("My Message Box");
		alert.setHeaderText("Hello");
		alert.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}

	

}
