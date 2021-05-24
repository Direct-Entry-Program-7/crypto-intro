package lk.ijse.crypto;

public class DEP7Crypto {

    public static String encrypt(String plainText, String key){
        String cipherText = "";

        /* Let's combine the plain text and the key
         * Eg:
         *  plaintText = "ijse"
         *  key = "123"
         *  scrambledText = "ijse123" */
        String scrambledText = plainText + key;

        /* Now let's reverse the whole thing
         * Eg:
         *  scrambledText = "ijse123"
         *  reversedText = "123ijse" */
        String reversedText = reverseString(scrambledText);

        /*
         * Let's generate a secret by adding unicode value of each
         * character in the key  */
        int secret = getUnicodeSum(key);

        for (int i = 0; i < reversedText.length(); i++) {
            int code = reversedText.charAt(i);
            code += secret;
            char newChar = (char) code;
            cipherText += newChar;
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, String key){
        String reversedText = "";

        /* We still have no idea whether this is the right key,
         *  anyway let's continue  */
        int secret = getUnicodeSum(key);

        for (int i = 0; i < cipherText.length(); i++) {
            int code = cipherText.charAt(i);
            code -= secret;
            char newChar = (char) code;
            reversedText += newChar;
        }

        /* To generate the original text we have reverse the reversed text */
        String originalText = reverseString(reversedText);

        /* Let's find out whether this is the right key */
        if (!originalText.endsWith(key)){
            throw new RuntimeException("Invalid key");
        }

        return originalText.substring(0,originalText.length() - key.length());
    }

    private static String reverseString(String text){
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        return reversedText;
    }

    private static int getUnicodeSum(String text){
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            sum += text.codePointAt(i);
        }
        return sum;
    }

}
