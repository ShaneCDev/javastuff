package Lab13;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Lab13aQ3 extends Application
{
	@Override
	public void start(Stage arg0) throws Exception
	{
		TextInputDialog dialog = new TextInputDialog("first name");
		TextInputDialog dialog2 = new TextInputDialog("surname");
		Alert yourName = new Alert(AlertType.INFORMATION);
		dialog.setTitle("Lab13aQ3");
		dialog.setHeaderText("A dialog box");
		dialog.setContentText("Enter your name:");
		dialog2.setTitle("Lab13aQ3");
		dialog2.setHeaderText("Confirmation");
		dialog2.setContentText("Enter your last name:");
		dialog.showAndWait();
		dialog2.showAndWait();
			
		yourName.setContentText("Hello " + dialog.getResult() + " " + dialog2.getResult());
		yourName.showAndWait();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}
