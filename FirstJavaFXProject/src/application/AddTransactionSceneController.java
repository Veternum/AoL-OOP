package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;

public class AddTransactionSceneController {
	@FXML
	private ChoiceBox<String> cbChooseWallet;
	@FXML
	private TextField tfTransactionValue;
	@FXML
	private TextField tfTransactionCategory;
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;

	// Event Listener on Button.onAction
	@FXML
	public void expenseBtn(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	// Event Listener on Button.onAction
	@FXML
	public void incomeBtn(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void addCbChooseWalletValue(String walletName) {
		cbChooseWallet.getItems().add(walletName);
	}
	
	
}
