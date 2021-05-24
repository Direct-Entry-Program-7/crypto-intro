package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.crypto.DEP7Crypto;

public class DecryptionController {
    public TextField txtText;
    public TextField txtCipherText;
    public TextField txtKey;

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {
        String cipherText = txtCipherText.getText();
        String key = txtKey.getText();

        if (cipherText.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid cipher text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        txtText.setText(DEP7Crypto.decrypt(cipherText, key));
    }
}
