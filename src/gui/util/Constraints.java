package gui.util;

import javafx.scene.control.TextField;

/* Constraints - tradu��o em portugues, limita��es.
 * Listener = Uma fun��o que ser� executada quando o controller sofrer alguma modifica��o ou intera��o usu�rio.
 * Adiciona um listener aos controllers.
 */

public class Constraints {

	/*
	 * obs= Referencia para o controller 
	 * oldValue= O valor que o controller tinha antes de mexer nele
	 * newValue- O novo valor do controller depois que vc mexeu
	 * 
	 */
	//M�todo verifica se o n�mero � inteiro
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			// Verficia se newValue n�o � nulo e verifica se atende a express�o regular(Valida se � � � um n�mero inteiro)
			if(newValue !=null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);// Se cair no if, n�o ir� aceitar modifica��es
			}
		});
	}
	//M�todo verifica o tamanho m�ximo, se o tamanho do novo valor for maior que o m�ximo, eu defino o valor antigo.
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			if(newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}
	//M�todo verifica se o n�mero � double
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if(newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
