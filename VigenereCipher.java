public class VigenereCipher {
    
    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        
        plaintext = plaintext.toUpperCase();
        key = key.toUpperCase();
        
        int keyLength = key.length();
        int j = 0;
        
        for (int i = 0; i < plaintext.length(); i++) {
            char plainChar = plaintext.charAt(i);
            if (Character.isAlphabetic(plainChar)) {
                char keyChar = key.charAt(j % keyLength);
                int encryptedValue = ((plainChar - 'A') + (keyChar - 'A')) % 26;
                ciphertext.append((char) ('A' + encryptedValue));
                j++;
            } else {
                ciphertext.append(plainChar);
            }
        }
        
        return ciphertext.toString();
    }
    
    public static String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();
        
        ciphertext = ciphertext.toUpperCase();
        key = key.toUpperCase();
        
        int keyLength = key.length();
        int j = 0;
        
        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            if (Character.isAlphabetic(cipherChar)) {
                char keyChar = key.charAt(j % keyLength);
                int decryptedValue = ((cipherChar - 'A') - (keyChar - 'A') + 26) % 26;
                plaintext.append((char) ('A' + decryptedValue));
                j++;
            } else {
                plaintext.append(cipherChar);
            }
        }
        
        return plaintext.toString();
    }
    
    public static void main(String[] args) {
        String plaintext = "HELLO WORLD";
        String key = "KEY";
        
        String encryptedText = encrypt(plaintext, key);
        System.out.println("Ciphertext: " + encryptedText);
        
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted text: " + decryptedText);
    }
}
