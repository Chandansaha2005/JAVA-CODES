
// // Prime Number
// // Definition: Only divisible by 1 and itself.
// // Example: 7 → Prime
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num < 2) {
            System.out.println(num + " is Not a Prime no.");
        } else if (isPrime) {
            System.out.println(num + " is a Prime no.");
        } else {
            System.out.println(num + " is Not a Prime no.");
        }
    }
}
