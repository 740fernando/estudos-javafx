package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); // Instanciei um objeto Loader do tipo FXMLLoader
			Parent parent = loader.load(); // carrega a view
			Scene mainScene = new Scene(parent); // Cria objeto Scene
			primaryStage.setScene(mainScene); // define mainScene como principal
			primaryStage.setTitle("Sample JavaFX application"); // define titulo
			primaryStage.show();// exibe na tela
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
