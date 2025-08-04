
// Twisted Prime Number
// Definition: A prime whose reverse is also prime.
// Example: 13 → reverse = 31 → both prime → Twisted Prime
import java.util.Scanner;

public class Twisted_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), reverse = 0;

        for (int i = num; i > 0; i /= 10) {
            reverse = reverse * 10 + (i % 10);
        }

        System.out.println("Reverse of " + num + " = " + reverse);

        boolean isNumPrime = isPrime(num);
        boolean isReversePrime = isPrime(reverse);

        if (isNumPrime && isReversePrime) {
            System.out.println(num + " & " + reverse + " are Twisted Prime Numbers");
        } else {
            System.out.println(num + " & " + reverse + " are Not Twisted Prime Numbers");
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
