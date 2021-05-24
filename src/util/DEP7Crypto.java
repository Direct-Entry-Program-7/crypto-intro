package util;

public class DEP7Crypto {

    public static String encrypt(String plainText, String key){
        plainText += key;
        String reversedText = "";
        for (int i = plainText.length() - 1; i >= 0; i--) {
            reversedText += plainText.charAt(i);
        }

        String cipherText = "";
        for (int i = 0; i < reversedText.length(); i++) {
            int code = reversedText.charAt(i);
            code += 10;
            char newChar = (char) code;
            cipherText += newChar;
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, String key){
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
        return originalText.substring(0,originalText.length() - key.length());
    }

}
