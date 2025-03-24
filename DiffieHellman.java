import java.util.Scanner;

public class diffhelman {
    //(base^exp) % mod
    public static long modExp(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod; 
            exp >>= 1; 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a prime number (q): ");
        int q = scanner.nextInt();

        System.out.print("Enter a primitive root (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the private key of A (Xa): ");
        int Xa = scanner.nextInt();

        System.out.print("Enter the private key of B (Xb): ");
        int Xb = scanner.nextInt();

        // Compute public keys
        long Ya = modExp(a, Xa, q);
        long Yb = modExp(a, Xb, q);

        System.out.println("Public key of A (Ya): " + Ya);
        System.out.println("Public key of B (Yb): " + Yb);

        // Compute shared secret keys
        long Ka = modExp(Yb, Xa, q);
        long Kb = modExp(Ya, Xb, q);

        System.out.println("Shared key for A (Ka): " + Ka);
        System.out.println("Shared key for B (Kb): " + Kb);

        scanner.close();
    }
}
//23 5 6 15== 8 9 2 2 shared key matched
