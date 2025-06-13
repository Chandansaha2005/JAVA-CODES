
// Dudeney Number
// Definition: A number whose cube root equals the sum of its digits.
// Example: 512 → Digits: 5+1+2 = 8, and 8³ = 512 → Dudeney
import java.util.Scanner;

public class Dudeney_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += (i % 10);
            System.out.print(" + " + (i % 10));
        }
        System.out.println(" = " + sum);
        int cube = (int) Math.pow(sum, 3);
        System.out.println(sum + "^3 = " + cube);
        if (num == cube) {
            System.out.println(num + " is a Dudeney Number");
        } else {
            System.out.println(num + " is Not a Dudeney Number");
        }
        sc.close();
    }
}
