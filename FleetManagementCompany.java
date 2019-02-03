package CA4;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextInputDialog;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class FleetManagementCompany extends Application
{
	Button btBack;
	Button btCreate;
	Button btPrint;
	Button btPrintPass;
	Button btPrintFreight;
	Button btQuit;
	Boat[] boats;
	Fleet[] fleet = new Fleet[10];
	List<String> choices = new ArrayList<>();
	int count = 0;
	PassengerBoat[] pBoat = new PassengerBoat[3];
	// Fleet myFleet[] = new Fleet[3];

	public void start(Stage primaryStage)
	{
		Scene scene = new Scene(mainMenu(), 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fleet Management");
		primaryStage.show();
	}

	public GridPane createMenu()
	{

		btBack = new Button("Back");
		Button btChoice = new Button("Click Me");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));

		// Place nodes in the pane
		TextField dialog = new TextField();
		TextField dia2 = new TextField();
		TextField dia3 = new TextField();
		pane.add(new Label("Fleet Company name:"), 0, 1);
		pane.add(dialog, 1, 1);
		pane.add(new Label("Owners Name:"), 0, 2);
		// TextField tfMi = new TextField();
		dia2.setPrefColumnCount(1);
		pane.add(dia2, 1, 2);
		pane.add(new Label("Fleet Id:"), 0, 3);
		pane.add(dia3, 1, 3);
		Button btNext = new Button("Next");
		GridPane.setHalignment(btNext, HPos.RIGHT);
		pane.add(btNext, 1, 4);
		pane.add(btBack, 0, 4);

		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});

		btNext.setOnMouseClicked(e -> {
			try{
			String comName = dialog.getText();
			String ownersName = dia2.getText();
			int id = Integer.parseInt(dia3.getText());
			fleet[0] = new Fleet(ownersName, comName, id);			
			btNext.getScene().setRoot(createMenu2());
			}
			catch(NumberFormatException e2)
			{
				System.out.println("Not parsing well");
				throw(e2);
			}
		});

		return pane;

	}

	public GridPane createMenu2() 
	{
		btBack = new Button("Back");
		// Button btChoice = new Button("Click Me");
		TextField tfBoat = new TextField();
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));

		// Place nodes in the pane
		pane.add(new Label("Passenger or Freight:"), 0, 1);
		pane.add(tfBoat, 1, 1);
		Button btNext = new Button("Next");
		GridPane.setHalignment(btNext, HPos.RIGHT);
		pane.add(btNext, 1, 4);
		pane.add(btBack, 0, 4);

		btNext.setOnMouseClicked(e -> {
			btNext.getScene().setRoot(passMenu());
		});

		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});

		return pane;
	}

	public GridPane passMenu()
	{
		btBack = new Button("Back");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));

		// Place nodes in the pane
		TextField passDialog = new TextField();
		TextField passDia2 = new TextField();
		TextField passDia3 = new TextField();
		TextField passDia4 = new TextField();
		pane.add(new Label("Number of Staff on board:"), 0, 1);
		pane.add(passDialog, 1, 1);

		pane.add(new Label("Passenger Capacity:"), 0, 2);
		passDia2.setPrefColumnCount(1);
		pane.add(passDia2, 1, 2);

		pane.add(new Label("Name of Boat:"), 0, 3);
		pane.add(passDia3, 1, 3);
		// pane.add(new Label("Car Ferry? (T or F)"), 0, 4);
		// pane.add(passDia4, 1, 4);
		Button btSave = new Button("Save");
		GridPane.setHalignment(btSave, HPos.RIGHT);
		pane.add(btSave, 1, 5);
		pane.add(btBack, 0, 5);

		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});

		btSave.setOnMouseClicked(e -> {
			try
			{
				int numStaff = Integer.parseInt(passDialog.getText());
				int passCapacity = Integer.parseInt(passDia2.getText());
				String name = passDia3.getText();
				// boolean carFerry = Boolean.parseBoolean(passDia4.getText());
				PassengerBoat passenger = new PassengerBoat(numStaff, passCapacity, name);
				pBoat[0] = passenger;

			} catch (NumberFormatException e1)
			{
				System.out.println("Not parsing well.");
			}

		});

		return pane;

	}

	public HBox mainMenu()
	{
		HBox hBox = new HBox();
		btCreate = new Button("Create Fleet");
		btPrint = new Button("Print Fleet");
		btPrintPass = new Button("Print Pass");
		btPrintFreight = new Button("Print Freight");
		btQuit = new Button("Quit");

		hBox.setSpacing(5.0);

		hBox.getChildren().addAll(btCreate, btPrint, btPrintPass, btPrintFreight, btQuit);

		btCreate.setOnMouseClicked(e -> {
			btCreate.getScene().setRoot(createMenu());
		});

		btQuit.setOnMouseClicked(e -> {
			Platform.exit();
		});

		btPrint.setOnMouseClicked(e -> {
			btPrint.getScene().setRoot(printMenu());
		});

		btPrintPass.setOnMouseClicked(e -> {
			btPrintPass.getScene().setRoot(printPassMenu());
		});

		btPrintFreight.setOnMouseClicked(e -> {
			btPrintFreight.getScene().setRoot(printFreightMenu());
		});

		return hBox;
	}

	public StackPane printMenu()
	{
		int i = 0;
		btBack = new Button("Back");
		StackPane sPane = new StackPane();
		sPane.setAlignment(btBack, Pos.BOTTOM_LEFT);
		
		TextArea textArea = new TextArea();
		textArea.appendText(String.valueOf(fleet[i].toString()));
		i++;
		textArea.setEditable(false);
		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});
		sPane.getChildren().addAll(textArea, btBack);
		return sPane;

	}

	public StackPane printPassMenu()
	{
		// StringBuilder txt = new StringBuilder();
		btBack = new Button("Back");
		StackPane sPane = new StackPane();
		sPane.setAlignment(btBack, Pos.BOTTOM_LEFT);
		//Fleet myFleet = new Fleet(pBoat);
		//String str = myFleet.toString();
		//Text text = new Text(pBoat.toString());
		//TextArea textArea = new TextArea();
		//textArea.setText(pBoat.toString());
		// Text text = new Text(Arrays.toString(pass));
		//TextArea textArea = new TextArea();
		
		TextArea textArea = new TextArea();
		textArea.appendText(String.valueOf(pBoat[0].toString()));
		textArea.setEditable(false);
		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});
		sPane.getChildren().addAll(textArea, btBack);
		return sPane;
	}

	public StackPane printFreightMenu()
	{
		btBack = new Button("Back");
		StackPane sPane = new StackPane();
		sPane.setAlignment(btBack, Pos.BOTTOM_LEFT);
		Text text = new Text("Story Kid");
		btBack.setOnMouseClicked(e -> {
			btBack.getScene().setRoot(mainMenu());
		});
		sPane.getChildren().addAll(btBack, text);
		return sPane;
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
