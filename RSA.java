import java.util.Scanner;
import java.math.BigInteger;

public class RSA {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int modInverse(int e, int phi) {
        for (int i = 1; i < phi; i++) {
            if ((e * i) % phi == 1) {
                return i;
            }
        }
        return -1;
    }

    public static BigInteger modPow(BigInteger base, BigInteger exp, BigInteger mod) {
        return base.modPow(exp, mod);
    }

    public static void RSAEncryption(int p, int q, int msg) {
        int n = p * q;
        int phi = (p - 1) * (q - 1);
        int e = 0;

        for (int i = 2; i < phi; i++) {
            if (gcd(i, phi) == 1) {
                e = i;
                break;
            }
        }

        int d = modInverse(e, phi);

        BigInteger N = BigInteger.valueOf(n);
        BigInteger E = BigInteger.valueOf(e);
        BigInteger D = BigInteger.valueOf(d);
        BigInteger M = BigInteger.valueOf(msg);

        BigInteger c = modPow(M, E, N);
        System.out.println("Encrypted message: " + c);

        BigInteger decrypted = modPow(c, D, N);
        System.out.println("Decrypted message: " + decrypted);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        int p = sc.nextInt();

        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();

        System.out.print("Enter the message: ");
        int msg = sc.nextInt();

        RSAEncryption(p, q, msg);

        sc.close();
    }
}
