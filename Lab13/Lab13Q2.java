package Lab13;


import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
public class Lab13Q2 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Numbers");
		alert.setHeaderText(null);
		
		String text = "Num " + "\t" + "Square " + "\t" + "Cube";
		for(int x =1; x <= 10; x++)
		{
			text += x + "\t\t" + (x*x) + "\t\t" + (x*x*x) + "\n";
		}
		alert.setContentText(text);
		alert.showAndWait();

	}
	public static void main(String[] args)
	{
		launch(args);
	}

}
