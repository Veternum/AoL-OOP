package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ViewTransactionScene1Controller implements Initializable {
	@FXML
	private ChoiceBox<String> cbChooseViewWallet;
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;

	static String CbChooseViewWaletValue;
	
	@FXML
	public void switchToViewTransactionsScene2(ActionEvent event) throws IOException {
		
		CbChooseViewWaletValue = cbChooseViewWallet.getValue();
		
		Parent root = FXMLLoader.load(getClass().getResource("ViewTransactionScene2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cbChooseViewWallet.getItems().setAll(User.walletNames);
		
	}
	
	@FXML
	public void switchToMainScene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
