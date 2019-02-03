package Lab13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Pos;

public class Lab13fQ2 extends Application 
{
	TextField heightWidth;
	
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create a pane to hold the circle
        Pane pane = new Pane();
        heightWidth = new TextField();
        heightWidth.setAlignment(Pos.TOP_LEFT);
        heightWidth.setText("Width = " + "," + " Height = " );
        
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        pane.getChildren().add(circle); // Add circle to the pane
        pane.getChildren().add(heightWidth);
  //      pane.heightProperty().bind(heightWidth.heightProperty());
        
        
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCenteredWithListener"); // Set the stage title
        primaryStage.setScene(scene);                // Put scene in stage
        primaryStage.show();                         // Display the stage
    }

    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
