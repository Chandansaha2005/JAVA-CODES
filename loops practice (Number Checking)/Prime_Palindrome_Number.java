import java.util.Scanner;

public class Prime_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), rem = 0, sum = 0;
        sc.close();

        boolean isPrime = true, isPalindrome = true;

        // Prime Check
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (num < 2) {
            isPrime = false;
        }

        // Palindrome Check
        for (int j = num; j > 0; j /= 10) {
            rem = j % 10;
            sum = sum * 10 + rem;
        }
        if (sum == num) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }

        if (isPrime && isPalindrome) {
            System.out.println(num + " is a Prime-Palindrome Number");
        } else {
            System.out.println(num + " is Not a Prime-Palindrome Number");

        }
    }
}
