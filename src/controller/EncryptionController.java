package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import util.DEP7Crypto;

import java.util.Arrays;

public class EncryptionController {
    public TextField txtText;
    public TextField txtKey;
    public TextField txtCipherText;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
        String text = txtText.getText();
        String key = txtKey.getText();

//        "abc     ".trim() = "abc"
//        "     abc".trim() = "abc"

        if (text.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid text", ButtonType.OK).show();
            txtText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        txtCipherText.setText(DEP7Crypto.encrypt(text, key));

    }
}
