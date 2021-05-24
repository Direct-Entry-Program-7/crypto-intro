package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) throws IOException {
        loadForm("Let's Encrypt", "/view/EncryptionForm.fxml");
    }

    public void btnDecrypt_OnAction(ActionEvent actionEvent) throws IOException {
        loadForm("Let's Decrypt","/view/DecryptionForm.fxml");
    }

    private void loadForm(String title, String loadFormURL) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource(loadFormURL));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.centerOnScreen();
        stage.initOwner(this.root.getScene().getWindow());
        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }
}
