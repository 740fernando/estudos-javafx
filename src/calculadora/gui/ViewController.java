package calculadora.gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private Button btTest;

	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;

	@FXML
	private Label labelResult;

	@FXML
	private Button btSum;

	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAleart("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtTestAction() {
		// Alerts.showAleart("ALERT TITLE", null,"ALERT CONTENT",
		// AlertType.INFORMATION);

	}
	/*
	 * URL - caminho da tela, na maioria das vzes n iremos usar.
	 * ResourceBundle - recursos que poder� usar na aplica��o
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 5);
		Constraints.setTextFieldMaxLength(txtNumber2, 5);
	}
}
