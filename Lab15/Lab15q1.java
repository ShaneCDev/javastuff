package Lab15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Lab15q1 extends Application
{
	Button btnSave = new Button("Save File");
	TextArea textArea = new TextArea();
	Path filePath = Paths.get("c:/Users/C00219567/Desktop/hello.txt");

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		StackPane sPane = new StackPane();
		sPane.getChildren().add(textArea);
		sPane.getChildren().add(btnSave);
		sPane.setAlignment(btnSave, Pos.BOTTOM_LEFT);

		btnSave.setOnMouseClicked(e -> {
			FileChooser fileChooser = new FileChooser();
			FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
			fileChooser.getExtensionFilters().add(extFilter);
			File file = fileChooser.showSaveDialog(primaryStage);
			if (file != null)
			{
				saveFile(textArea.getText(), file);
			}
		});
		textArea.setOnMouseClicked(e -> {
			readFile();
		});
		Scene scene = new Scene(sPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Text Editor");
		primaryStage.show();
	}

	public void saveFile(String content, File file)
	{
		BufferedWriter writer = null;
		try
		{
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(content);
		} catch (IOException e)
		{
		} finally
		{
			try
			{
				if (writer != null)
				{
					writer.close();
				}
			} catch (IOException e)
			{

			}
		}
	}

	public void readFile()
	{
		try
		{
			String content = Files.lines(filePath).collect(Collectors.joining("\n"));
			textArea.setText(content);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}
