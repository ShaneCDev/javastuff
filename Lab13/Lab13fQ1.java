package Lab13;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;


public class Lab13fQ1 extends Application
{
	TextField cel;
	TextField far;
	Button btClose;
	static boolean controller = false;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		GridPane gPane = new GridPane();
		cel = new TextField();
		far = new TextField();
		gPane.setVgap(10);
		gPane.setHgap(10);
		gPane.setAlignment(Pos.CENTER);
		gPane.add(new Label("Celsius: "), 0, 1);
		gPane.add(cel, 1, 1);
		gPane.add(new Label("Fahrenheit: "), 2, 1);
		gPane.add(far, 3, 1);
		btClose = new Button("Close");
		gPane.add(btClose, 4, 2);
		/*cel.setOnAction(e -> {
			convertCel();
			cel.requestFocus();
		});*/ 
		
		/*DoubleProperty fTemp = new SimpleDoubleProperty();
		fTemp.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable cel)
			{
				convertCel();
			}
				
		});*/
		
		cel.textProperty().addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable ov) 
			{
				convertCelToFah();
			}
			

		});
		far.textProperty().addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable ov) 
			{
				convertFahToCel();
			}
			

		});
		
		btClose.setOnAction(e -> {
			Platform.exit();
		});
		
		Scene scene = new Scene(gPane, 500, 70);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Temp Converter");
		primaryStage.show();
		
	}
	public void convertCelToFah()
	{
		if(!controller && cel.getText().length() > 0)
		{
		controller = true;
		double celsius = Double.parseDouble(cel.getText());
		double fahrenheit = (celsius * 9/5) + 32;
		far.setText(String.valueOf(fahrenheit));
		controller = false;
		}
	}
	public void convertFahToCel()
	{
		if(!controller && far.getText().length() > 0) 
		{
		controller = true;
		double fahrenheit = Double.parseDouble(far.getText());
		double celsius = (fahrenheit - 32) * 5/9;
		cel.setText(String.valueOf(celsius));
		controller = false;
		}
	}
	public static void main(String[] args)
	{
		launch(args);
	}


}
