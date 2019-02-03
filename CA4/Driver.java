package CA4;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Driver 
{
	Button btCreate;
	Button btPrint;
	Button btPrintPass;
	Button btPrintFreight;
	Button btQuit;
	
	public void start(Stage primaryStage)
	{
		HBox hBox = new HBox();
		btCreate = new Button();
		btPrint = new Button();
		btPrintPass = new Button();
		btPrintFreight = new Button();
		btQuit = new Button();
		hBox.getChildren().addAll(btCreate, btPrint, btPrintPass, btPrintFreight, btQuit);
		
		
		btCreate.setOnMouseClicked(e -> {
			new CreateStage();
		});
		
		Scene scene = new Scene(hBox, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fleet Management");
		primaryStage.show();
	}
	public class CreateStage
	{
		CreateStage()
		{
			Stage subStage = new Stage();
			subStage.setTitle("Fleet Management");
			
			FlowPane root = new FlowPane();
			root.setAlignment(Pos.CENTER);
			Scene scene = new Scene(root, 300, 200);
			
			subStage.setScene(scene);
			subStage.show();
		}
	}
	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
}