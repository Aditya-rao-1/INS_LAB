import java.util.Scanner;

public class MonoAlphaCipher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String REVERSED = new StringBuilder(ALPHABET).reverse().toString();

    private static String transform(String text, String from, String to) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toLowerCase().toCharArray()) {
            int index = from.indexOf(c);
            result.append(index != -1 ? to.charAt(index) : c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        String encrypted = transform(text, ALPHABET, REVERSED);
        String decrypted = transform(encrypted, REVERSED, ALPHABET);
        
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        sc.close();
    }
}
