
// Kaprekar Number
// Definition: Square of number can be split and summed to get the number.
// Example: 45 → 45² = 2025 → 20 + 25 = 45 → Kaprekar
import java.util.Scanner;

public class Kaprekar_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, sum = 0;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println(num + "^2 = " + square);

        for (int i = num; i > 0; i /= 10) {
            c++;
        }

        int split = (int) Math.pow(10, c );

        for (int j = square; j > 0; j /= split) {
            sum += j % split;
            System.out.print(" + " + j % split);
        }
        System.out.println(" = " + sum);
        if (sum == num) {
            System.out.println(num + " = " + sum + " It's a Kaprekar Number");
        } else {
            System.out.println(num + " != " + sum + " It's Not a Kaprekar Number");
        }
        sc.close();
    }
}
