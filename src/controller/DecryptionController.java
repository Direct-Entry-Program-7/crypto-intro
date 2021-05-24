package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

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

//        text += key;
//        String reversedText = "";
//        for (int i = text.length() - 1; i >= 0; i--) {
//            reversedText += text.charAt(i);
//        }
//
//        String cipherText = "";
//        for (int i = 0; i < reversedText.length(); i++) {
//            int code = reversedText.charAt(i);
//            code += 10;
//            char newChar = (char) code;
//            cipherText += newChar;
//        }

        String reversedText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int code = cipherText.charAt(i);
            code -= 10;
            char orgChar = (char) code;
            reversedText += orgChar;
        }

        String originalText = "";
        for (int i = reversedText.length() - 1; i >= 0; i--) {
            originalText += reversedText.charAt(i);
        }
        originalText = originalText.substring(0,originalText.length() - key.length());

        txtText.setText(originalText);
    }
}
