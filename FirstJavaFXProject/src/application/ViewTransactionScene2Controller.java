package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class ViewTransactionScene2Controller {
	@FXML
	private Label labelWalletName;
	@FXML
	private TableView dbTable;
	@FXML
	private TableColumn dbDate;
	@FXML
	private TableColumn dbCategory;
	@FXML
	private TableColumn dbValue;
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	
	@FXML
	public void switchToViewTransactionsScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
