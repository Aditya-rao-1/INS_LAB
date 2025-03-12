import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a prime number: ");
        int q = scanner.nextInt();
        
        System.out.print("Enter a primitive root: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the private key of A: ");
        int Xa = scanner.nextInt();
        
        System.out.print("Enter the private key of B: ");
        int Xb = scanner.nextInt();
        
        // Compute public keys
        double Ya = Math.pow(a, Xa) % q;
        double Yb = Math.pow(a, Xb) % q;
        
        System.out.println("Public key of A: " + (int)Ya);
        System.out.println("Public key of B: " + (int)Yb);
        
        // Compute shared keys
        double Ka = Math.pow(Yb, Xa) % q;
        double Kb = Math.pow(Ya, Xb) % q;
        
        System.out.println("Shared key for A: " + (int)Ka);
        System.out.println("Shared key for B: " + (int)Kb);
        
        scanner.close();
    }
}
