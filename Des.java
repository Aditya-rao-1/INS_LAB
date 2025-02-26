import java.util.*;

public class Des {
    public static void generateKeys(String s) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) answer.append(String.format("%08b", (int) c).charAt(0));
        
        String left = answer.substring(0, answer.length() / 2), right = answer.substring(answer.length() / 2);
        int[] lt = {2, 3, 6, 7, 1, 6, 5, 9};
        List<String> keys = new ArrayList<>();
        
        for (int i = 0; i < 8; i++) {
            String newKey = String.format("%08b", Integer.parseInt(right, 2) ^ lt[i]) +
                            String.format("%08b", Integer.parseInt(left, 2) ^ lt[i]);
            List<Integer> rm = new ArrayList<>();
            while (rm.size() < 8) { int r = new Random().nextInt(newKey.length()); if (!rm.contains(r)) rm.add(r); }
            StringBuilder newAnswer = new StringBuilder();
            for (int j = 0; j < newKey.length(); j++) if (!rm.contains(j)) newAnswer.append(newKey.charAt(j));
            keys.add(newAnswer.toString());
        }
        
        for (int i = 0; i < keys.size(); i++) System.out.println("Key " + (i + 1) + " = " + keys.get(i));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        generateKeys(scanner.nextLine());
        scanner.close();
    }
}
