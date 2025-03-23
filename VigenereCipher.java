public class VigenereCipher {
    public static String encrypt(String pl, String key) {
        StringBuilder res=new StringBuilder();
        int k=key.length(),j=0;
        for(char c:pl.toCharArray()){
            if(Character.isAlphabetic(c)){
                int shift=key.charAt(j%k)-'A';
                char enc=(char)((c-'A'+shift)%26+'A');
                res.append(enc);
                j++;
            }
            else res.append(c);
        }
        return res.toString();  
    }
    public static String decrypt(String ct, String key) {
        StringBuilder res=new StringBuilder();
        int k=key.length(),j=0;
        for(char c:ct.toCharArray()){
            if(Character.isAlphabetic(c)){
                int shift=key.charAt(j%k)-'A';
                char decr=(char)((c-'A'-shift+26)%26+'A');
                res.append(decr);
                j++;
            }
            else res.append(c);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String plaintext = "aditya";
        String key = "KEY";
        plaintext=plaintext.toUpperCase();
        key=key.toUpperCase();
        String encryptedText = encrypt(plaintext, key);
                System.out.println("Ciphertext: " + encryptedText);
                
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Decrypted text: " + decryptedText);
            }      
}
