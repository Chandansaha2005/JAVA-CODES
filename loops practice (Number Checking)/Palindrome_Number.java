// Palindrome Number
// Definition: Same forwards and backwards.
// Example: 121 → Same → Palindrome

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, rem = 0;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i /= 10) {
            rem = i % 10;
            sum = sum * 10 + rem;
        }
        if (sum == num) {
            System.out.println("Reverse of " + num + " = " + sum + "\nIt's a Palindrome Number");
        } else {
            System.out.println("Reverse of " + num + " != " + sum + "\nIt's Not a Palindrome Number");

        }
        sc.close();
    }
}
