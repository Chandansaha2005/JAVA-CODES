// Spy Number
// Definition: Sum of digits = product of digits.
// Example: 1124 → 1+1+2+4 = 8, 1×1×2×4 = 8 → Spy

import java.util.Scanner;

public class Spy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, pro = 1;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
            pro *= i % 10;
        }
        if (sum == pro) {
            System.out.println("Spy number");
        } else {
            System.out.println("Spy number");
        }
        sc.close();
    }
}
