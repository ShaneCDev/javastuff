package Lab13;

import  javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lab13CQ1 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		StackPane stackPane = new StackPane();
		Text text = new Text("JavaFX by Shane");
		Circle circle = new Circle();
		circle.centerXProperty().bind(stackPane.widthProperty().divide(2));
		circle.centerYProperty().bind(stackPane.heightProperty().divide(2));
		circle.setRadius(100.0);
		circle.setStroke(Color.RED);
		circle.setFill(Color.BLACK);
		text.setFill(Color.GREEN);
		text.setFont(Font.font(null, FontWeight.BOLD, 20));
		text.setEffect(new GaussianBlur());
		stackPane.getChildren().addAll(circle, text);
		
		Scene scene = new Scene(stackPane, 300.0, 300.0);
		primaryStage.setTitle("Lab13CQ1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);

	}

	

}
