
// Armstrong Number
// Definition: Sum of digits raised to the power of number of digits = number.
// Example: 153 → 1³ + 5³ + 3³ = 153 → Armstrong
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        int digits = 0, rem = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        for (int c = num; c > 0; c /= 10) {
            digits++;
        }
        for (int n = num; n > 0; n /= 10) {
            rem = n % 10;
            System.out.print(" + " + rem + "^" + digits);
            sum += Math.pow(rem, digits);
        }
        System.out.println(" = " + sum);
        if (num == sum)
            System.out.println(sum + " == " + num + "\nIt's a Armstrong Number");
        else
            System.out.println(sum + " != " + num + "\nIt's Not a Armstrong Number");

        sc.close();

    }
}
