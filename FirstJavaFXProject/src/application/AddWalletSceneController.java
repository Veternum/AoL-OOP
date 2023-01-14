package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class AddWalletSceneController {
	@FXML
	private TextField tfWalletName;
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	@FXML
	private Label invalidWallet;

	// Event Listener on Button.onAction
	@FXML
	public void addWalletBtn(ActionEvent event) throws IOException {
//		String walletName = tfWalletName.getText();
//		
//		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
//		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
		
		checkAddWallet(event);
	}
		
	
	public void checkAddWallet(ActionEvent event) throws IOException {
		String walletName = tfWalletName.getText();
		
		if (walletName.length() <= 20) {
			Wallet wallet = new Wallet(walletName);
			User.addWallet(wallet);
			
//			AddTransactionSceneController.addCbChooseWalletValue(walletName);
			
			Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} else {
			invalidWallet.setText("Wallet name must be < 20");
		}
	}
}
