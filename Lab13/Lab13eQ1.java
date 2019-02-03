package Lab13;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Lab13eQ1 extends Application
{
	private Button btPlus = new Button("+");
	private Button btMinus = new Button("-");
	private Button btSqrt = new Button("√");
	private Button btMult = new Button("x");
	private Button btDiv = new Button("/");
	private Button btEquals = new Button("=");
	private String op;
	private double x;
	private double y;
	TextField tf = new TextField();
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		
	
		BorderPane bPane = new BorderPane();
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		bPane.setTop(tf);
		tf.setEditable(false);

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        setSize(button1);
        setSize(button2);
        setSize(button3);
        setSize(button4);
        setSize(button5);
        setSize(button6);
        setSize(button7);
        setSize(button8);
        setSize(button9);
        setSize(button0); 
        setSize(btDiv);
        setSize(btMult);
        setSize(btMinus);
        setSize(btSqrt);
        setSize(btEquals);
        setSize(btPlus);
		
      
		
			button1.setOnAction(e -> {
				tf.setText("1");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
				
			});
			button2.setOnAction(e -> {
				tf.setText("2");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button3.setOnAction(e -> {
				tf.setText("3");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button4.setOnAction(e -> {
				tf.setText("4");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button5.setOnAction(e -> {
				tf.setText("5");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button6.setOnAction(e -> {
				tf.setText("6");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button7.setOnAction(e -> {
				tf.setText("7");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button8.setOnAction(e -> {
				tf.setText("8");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button9.setOnAction(e -> {
				tf.setText("9");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			button0.setOnAction(e -> {
				tf.setText("0");
				x = Double.parseDouble(tf.getText());
				y = Double.parseDouble(tf.getText());
			});
			  btEquals.setOnAction(e ->{
					Calc(x, y, op);
				});
				btSqrt.setOnAction(e -> {
					Sqrt(x, op);
				});
		

		gridPane.add(button7, 0, 0);
        gridPane.add(button8, 1, 0);
        gridPane.add(button9, 2, 0);
        gridPane.add(btDiv, 3, 0);

        gridPane.add(button4, 0, 1);
        gridPane.add(button5, 1, 1);
        gridPane.add(button6, 2, 1);
        gridPane.add(btMult, 3, 1);

        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);
        gridPane.add(button3, 2, 2);
        gridPane.add(btMinus, 3, 2);

        gridPane.add(button0, 0, 3);
        gridPane.add(btSqrt, 1, 3);
        gridPane.add(btEquals, 2, 3);
        gridPane.add(btPlus, 3, 3);

        bPane.setCenter(gridPane);
        
        primaryStage.setScene(new Scene(bPane, 200, 250));
        primaryStage.show();
	}

	
		
	
	private void Calc(double x, double y, String op)
	{
		if(op == "+")
		{
			String temp = Double.toString(x) + Double.toString(y);
			tf.setText(temp);
		}
		if(op == "-")
		{
			
		}
		if(op == "x")
		{
			
		}
		if(op == "/")
		{
		
		}
		
	}
	private double Sqrt(double x, String op)
	{
		if(op == "√")
		{
			return Math.sqrt(x);
		}
		return 0;
	}
	private void setSize(Button button)
	{
		button.setPrefHeight(35.0);
		button.setPrefWidth(35.0);
	}
	public static void main(String[] args)
	{
		launch(args);
	}

	

}
