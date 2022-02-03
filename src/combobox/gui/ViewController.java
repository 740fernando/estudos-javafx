package combobox.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	// Anota��o para fazer associa��o com a interface gr�fica
	@FXML
	private ComboBox<Person> comboBoxPerson;

	@FXML
	private Button btAll;
	
	// ObservableList - tipo especial de lista que j� fica associado ao componente
	// visual, implementa uma intera��o entre a interface gr�fica(componente) e a
	// cole��o(lista)
	private ObservableList<Person> obsList;
	
	@FXML
	public void onComboBoxPersonAction() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	@FXML
	public void onBtnAllAction() {
		
		for(Person person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1,"Maria","maria@gmail.com"));
		list.add(new Person(2,"Alex","alex@gmail.com"));
		list.add(new Person(3,"Bob","bob@gmail.com"));
		
		//FXCollections - Classe do JAVAFX
		obsList = FXCollections.observableArrayList(list); // instancia a obsList
		comboBoxPerson.setItems(obsList);// define os valores no combobox
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		comboBoxPerson.setCellFactory(factory);
		comboBoxPerson.setButtonCell(factory.call(null));
	}
}
