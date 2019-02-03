package Lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
public class Lab13cQ2 extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		StackPane stack = new StackPane();
	
		for(int i = 0; i < 16; i++)
		{
			Ellipse e = new Ellipse(100, 50, 100, 30);
			e.setRotate(i * 360 / 32);
			e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			e.setFill(Color.WHITE);
			stack.getChildren().add(e);
		}
		Scene scene = new Scene(stack, 300, 250);
		primaryStage.setTitle("Lab13cQ2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}

	

}
