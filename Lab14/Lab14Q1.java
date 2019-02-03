package Lab14;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Lab14Q1 extends Application
{
	Circle circle = new Circle(5.0);
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Pane pane = new FlowPane();
		Canvas canvas = new Canvas();
		TranslateTransition transition = new TranslateTransition();
		pane.getChildren().add(canvas);
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
		
		Scene scene = new Scene(pane, 350, 200);
		primaryStage.setTitle("MouseDraw");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.setOnMouseClicked(e -> {
				moveOnMousePress(scene, circle, transition);
		});
	}
	public TranslateTransition createTranslateTransition(Circle circle)
	{
		TranslateTransition transition = new TranslateTransition();
		transition.setOnFinished(new EventHandler<ActionEvent>(){
		@Override public void handle(ActionEvent t) {
	        circle.setCenterX(circle.getTranslateX() + circle.getCenterX());
	        circle.setCenterY(circle.getTranslateY() + circle.getCenterY());
	        circle.setTranslateX(0);
	        circle.setTranslateY(0);
	}
		});
		return transition;
	}
	public void moveOnMousePress(Scene scene, Circle circle, TranslateTransition transition)
	{
		scene.setOnMousePressed(new EventHandler<MouseEvent>(){
			@Override public void handle(MouseEvent e)
			{
				if(!e.isControlDown())
				{
					circle.setCenterX(e.getSceneX());
					circle.setCenterY(e.getSceneY());
				}
				else
				{
					transition.setToX(e.getSceneX() - circle.getCenterX());
					transition.setToY(e.getSceneY() - circle.getCenterY());
					transition.playFromStart();
				}
			}
	});
	}
	public static void main(String[] args)
	{
		launch(args);
	}

}

