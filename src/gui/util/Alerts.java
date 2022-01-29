package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


//Classe responsável por exibir os alerts

public class Alerts {

	public static void showAleart(String title, String header, String content, AlertType type) {
		
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}
