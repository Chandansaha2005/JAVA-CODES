
// Twin Prime Number
// Definition: Prime numbers differing by 2.
// Example: (11,13), (17,19) → Twin Primes
import java.util.Scanner;

public class Twin_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The 1st Number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter The 2nd Number = ");
        int num2 = sc.nextInt();
        if (isPrime(num1) && isPrime(num2)) {
            if (num1 + 2 == num2 || num2 + 2 == num1) {
                System.out.println("(" + num1 + "," + num2 + ") are Twin Prime no.");
            } else {
                System.out.println("(" + num1 + "," + num2 + ")Both are Prime But Not Twin Prime no.");
            }
        } else {
            System.out.println("(" + num1 + "," + num2 + ")Both are Not Prime no.");
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
