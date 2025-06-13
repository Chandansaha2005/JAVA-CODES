
// Neon Number
// Definition: Square of number, sum of digits = number.
// Example: 9 → 9² = 81 → 8+1 = 9 → Neon
import java.util.Scanner;

public class Neon_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int Square = (int) Math.pow(num, 2), sum = 0;
        System.out.println("Square of " + num + " is " + Square);
        for (int i = Square; i > 0; i /= 10) {
            sum += (i % 10);
            System.out.print(" + " + i%10);
        }
        if (sum == num) {
            System.out.println(" = " + sum + "\nIt's a Neon Number");
        } else {
            System.out.println(" != " + sum + "\nIt's Not a Neon Number");
        }
        sc.close();
    }
}
