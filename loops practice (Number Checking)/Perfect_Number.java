
// Perfect Number
// Definition: Sum of proper divisors = number.
// Example: 28 → 1+2+4+7+14 = 28 → Perfect
import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(" + " + sum);
            }
        }
        System.out.println(" = " + sum);
        if (sum == num) {
            System.out.println(sum + "=" + num + "\nIt's a Perfect number");
        } else {
            System.out.println(sum + "=" + num + "\nIt's Not a Perfect number");
        }
        sc.close();
    }
}
