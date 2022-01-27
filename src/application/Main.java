package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml")); // Instanciei um objeto Loader do tipo FXMLLoader
			ScrollPane scrollPane = loader.load(); // carrega a view
			
			//macete para deixar o scroll pane ajustado a janela
			scrollPane.setFitToHeight(true); //define a altura 
			scrollPane.setFitToWidth(true); // define a largura
			
			Scene mainScene = new Scene(scrollPane); // Cria objeto Scene
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
