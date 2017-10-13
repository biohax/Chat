package client;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClient extends Application {

	private static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		MainClient.primaryStage = primaryStage;
		showView();
	}

	private void showView() {
		// Load lay-out (.fxml file)
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("application.fxml"));

		// Create the root scene
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
		Scene scene = new Scene(root);

		// get controller from root pane
		ControllerClient controller = loader.getController();

		// prepare primaryStage
		primaryStage.setTitle("Chat Client");
		primaryStage.setScene(scene);

		primaryStage.setMinHeight(500);
		primaryStage.setMinWidth(700);

		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}
