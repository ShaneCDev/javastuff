package Lab13;

import java.util.Optional;

import javafx.application.Application;

import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Lab13aQ4 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
			TextInputDialog input = new TextInputDialog();
			Alert evenOrOdd = new Alert(AlertType.INFORMATION);
			
			input.setTitle("Lab13aQ4");
			input.setContentText("Enter an integer: ");
			input.showAndWait();
			int temp = Integer.valueOf(input.getResult());
			if(temp % 2 == 1)
			{
				evenOrOdd.setContentText(temp + " is odd.");
				evenOrOdd.showAndWait();
			}
			else
			{
				evenOrOdd.setContentText(temp + " is even.");
				evenOrOdd.showAndWait();
			}
	}
	public static void main(String[] args)
	{
		launch(args);
	}


}
