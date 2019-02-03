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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Lab13dQ2 extends Application
{
	private Button btExit = new Button("Close Application");
	private Button btUpdate = new Button("Update");
	private TextField tfRed = new TextField();
	private TextField tfGreen = new TextField();
	private TextField tfBlue = new TextField();
	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		VBox vBox = new VBox();
		vBox.setSpacing(10);
		vBox.setAlignment(Pos.CENTER);
		vBox.getChildren().add(btUpdate);
		vBox.getChildren().add(new Label("Red: "));
		vBox.getChildren().add(tfRed);
		vBox.getChildren().add(new Label("Green: "));
		vBox.getChildren().add(tfGreen);
		vBox.getChildren().add(new Label("Blue: "));
		vBox.getChildren().add(tfBlue);
		vBox.getChildren().add(btExit);
		tfRed.setAlignment(Pos.CENTER);
		tfGreen.setAlignment(Pos.CENTER);
		tfBlue.setAlignment(Pos.CENTER);

		btUpdate.setOnAction(new CircleHandler());
		btExit.setOnAction(new ExitHandler());

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(vBox);
		BorderPane.setAlignment(vBox, Pos.CENTER);

		Scene scene = new Scene(borderPane, 500, 500);
		primaryStage.setTitle("Lab13dQ2");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	class ExitHandler implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event)
		{
			Platform.exit();
		}

	}

	class CircleHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			circlePane.updateRGB();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
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

		public void updateRGB()
		{
			int red = Integer.parseInt(tfRed.getText());
			int blue = Integer.parseInt(tfBlue.getText());
			int green = Integer.parseInt(tfGreen.getText());
			circle.setFill(Color.rgb(red, green, blue));
		}

	}
}
