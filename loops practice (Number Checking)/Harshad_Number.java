
// Harshad Number
// Definition: Number divisible by the sum of its digits.
// Example: 18 → 1+8 = 9 → 18 is divisible by 9 → Harshad
import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the nuber = ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
            System.out.print(" + " + i % 10);
        }
        System.out.println(" = " + sum);
        if (num % sum == 0) {
            System.out.println(num + "%" + sum + " = 0 It's a Harshad number");
        } else {
            System.out.println(num + "%" + sum + " != 0 It's Not a Harshad number");
        }
        sc.close();
    }
}
