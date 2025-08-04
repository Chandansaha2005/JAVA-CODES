
// Circular Prime Number
// Definition: All rotations of the digits are prime.
// Example: 197 → 197, 971, 719 → All prime → Circular Prime
import java.util.Scanner;

public class Circular_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt(), c = 0;
        int num = n;
        boolean Circular = true;
        for (int j = num; j > 0; j /= 10) {
            c++;
        }
        int d = (int) Math.pow(10, c - 1);
        int i = c;
        while (i >= 1) {
            int rotation = (num % 10) * d + (num / 10);
            if (isPrime(rotation)) {
                System.out.println(rotation + " is a Prime number");
                Circular = true;
            } else {
                System.out.println(rotation + " is Not a Prime number");
                Circular = false;
            }
            num = rotation;
            i--;
        }
        if (Circular) {
            System.out.println(n + " is a Circular Prime Number");
        } else {
            System.out.println(n + " is Not a Circular Prime Number");
        }
        sc.close();

    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
