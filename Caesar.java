import java.util.Scanner;

public class Caesar {
    public static String ccipherencrypt(String s, int key) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + key) % 26 + 'A');
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + key) % 26 + 'a');
            }
            ciphertext.append(c);  // Use StringBuilder instead of +=
        }
        return ciphertext.toString();
    }

    public static String ccipherdecrypt(String s, int key) {
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' - key + 26) % 26 + 'A');
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' - key + 26) % 26 + 'a');
            }
            plaintext.append(c);  // Use StringBuilder instead of +=
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String s = sc.nextLine();
        System.out.println("Enter the shift key: ");
        int key = sc.nextInt();
        sc.close(); // Always close the Scanner

        String encryptedStr = ccipherencrypt(s, key);
        System.out.println("Encrypted text: " + encryptedStr);
        System.out.println("Decrypted text: " + ccipherdecrypt(encryptedStr, key));
    }
}
