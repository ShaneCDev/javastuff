package Lab13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Lab13dQ1 extends Application
{
	private CirclePane circlePane = new CirclePane();
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		VBox vBox = new VBox();
		vBox.setSpacing(10);
		vBox.setAlignment(Pos.CENTER);
		Button btRed = new Button("Red");
		Button btGreen = new Button("Green");
		Button btBlue = new Button("Blue");
		
		vBox.getChildren().add(btRed);
		vBox.getChildren().add(btGreen);
		vBox.getChildren().add(btBlue);
		
		

		
		btRed.setOnAction(new RedHandler());
		btGreen.setOnAction(new GreenHandler());
		btBlue.setOnAction(new BlueHandler());
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(vBox);
		//borderPane.setTop(vBox);
		BorderPane.setAlignment(vBox, Pos.CENTER);
		
		Scene scene = new Scene(borderPane, 500, 250);
		primaryStage.setTitle("Lab13dQ1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	class RedHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent e)
		{
			circlePane.red();
		}
	}
	class GreenHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			circlePane.green();
		}
	}
	class BlueHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			circlePane.blue();
		}
	}
	class CirclePane extends StackPane 
	{
		private Circle circle = new Circle(50);
		
		public CirclePane()
		{
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
		}
		public void red()
		{
			circle.setStroke(Color.RED);
			circle.setFill(Color.RED);
		}
		public void green()
		{
			circle.setStroke(Color.GREEN);
			circle.setFill(Color.GREEN);
		}
		public void blue()
		{
			circle.setStroke(Color.BLUE);
			circle.setFill(Color.BLUE);
		}
	
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}
