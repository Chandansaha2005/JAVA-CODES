// Abundant Number
// Definition: A number whose sum of proper divisors is more than the number itself.
// Example: 12 → Divisors: 1, 2, 3, 4, 6 → Sum = 16 > 12 → Abundant

import java.util.Scanner;

public class Abundant_Number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + sum);
        if (num < sum)
            System.out.println(sum + " > " + num + "\nIt's a Abundant Number");
        else
            System.out.println(sum + " < " + num + "\nIt's Not a Abundant Number");
        sc.close();
    }
}