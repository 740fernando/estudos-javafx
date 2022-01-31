package gui.util;

import javafx.scene.control.TextField;

/* Constraints - tradução em portugues, limitações.
 * Listener = Uma função que será executada quando o controller sofrer alguma modificação ou interação usuário.
 * Adiciona um listener aos controllers.
 */

public class Constraints {

	/*
	 * obs= Referencia para o controller 
	 * oldValue= O valor que o controller tinha antes de mexer nele
	 * newValue- O novo valor do controller depois que vc mexeu
	 * 
	 */
	//Método verifica se o número é inteiro
	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			// Verficia se newValue não é nulo e verifica se atende a expressão regular(Valida se é ñ é um número inteiro)
			if(newValue !=null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);// Se cair no if, não irá aceitar modificações
			}
		});
	}
	//Método verifica o tamanho máximo, se o tamanho do novo valor for maior que o máximo, eu defino o valor antigo.
	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue)->{
			if(newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}
	//Método verifica se o número é double
	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if(newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
}
