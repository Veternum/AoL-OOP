package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;

public class AddTransactionSceneController implements Initializable {
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
	
//	private String[] walletNames;
	private ArrayList<String> walletNames = new ArrayList<>();
	
//	private ObservableList<String> items = new

	// Event Listener on Button.onAction
	@FXML
	public void expenseBtn(ActionEvent event) throws IOException {
		int value = Integer.parseInt(tfTransactionValue.getText());
		String category = tfTransactionCategory.getText();
		
//		if (!validateBtnClicked(value, category)) {
//			return;
//		}
		
		Wallet wallet = getChoosenWallet();
		
		if (wallet == null) return;
		
		wallet.addTransaction(value, category, true);
		
		wallet.printTransactions();
		
		// template switch to main scene
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	// Event Listener on Button.onAction
	@FXML
	public void incomeBtn(ActionEvent event) throws IOException {
		int value = Integer.parseInt(tfTransactionValue.getText());
		String category = tfTransactionCategory.getText();
		
//		if (!validateBtnClicked(value, category)) {
//			return;
//		}
		
		Wallet wallet = getChoosenWallet();
		
		if (wallet == null) return;
		
		wallet.addTransaction(value, category, false);
		
		wallet.printTransactions();
		
		// template switch to main scene
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void addCbChooseWalletValue(String walletName) {
		cbChooseWallet.getItems().add(walletName);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<Wallet> wallets = User.wallets;
		
		walletNames.clear();
		for (Wallet x : wallets) {
			walletNames.add(x.getWalletName());
		}
		
		cbChooseWallet.getItems().setAll(walletNames);
		
	}
	
	public boolean validateBtnClicked(int value, String category) {
		value = Integer.parseInt(tfTransactionValue.getText());
		category = tfTransactionCategory.getText();
		
		// vd: 0 <= value <= x, category <= 30
//		if (value < 0) {
//			return false;
//		}
		
		return true;
	}
	
	private Wallet getChoosenWallet() {
		String walletName = cbChooseWallet.getValue();
		
		for (Wallet x: User.wallets) {
			if (x.getWalletName().equals(walletName)) return x;
		}
		
		return null;
}
	
}
