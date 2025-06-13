
// Tech Number
// Definition: Even number of digits, square of the number formed by splitting in half = original.
// Example: 2025 → Split: 20 & 25 → (20+25)² = 45² = 2025 → Tech
import java.util.Scanner;

public class Tech_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), sum = 0, c = 0;
        for (int i = num; i > 0; i /= 10) {
            c++;
        }
        int split = (int) Math.pow(10, c / 2);

        for (int j = num; j > 0; j /= split) {
            sum += j % split;
            System.out.print(" + " + j % split);
        }
        System.out.println(" = " + sum);
        int square = (int) Math.pow(sum, 2);
        System.out.println(sum + "^2 = " + square);

        if (square == num) {
            System.out.println("It's a Tech Number");
        } else {
            System.out.println("It's Not a Tech Number");
        }
        sc.close();

    }
}
