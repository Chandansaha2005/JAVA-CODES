
// Krishnamurthy Number
// Definition: Sum of factorial of digits = number.
// Example: 145 → 1! + 4! + 5! = 145 → Krishnamurthy
import java.util.Scanner;

public class Krishnamurthy_Number {
    public static void main(String[] args) {
        int fact = 1, sum = 0, rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i /= 10) {
            rem = i % 10;
            System.out.print(" + " + rem + "!");
            fact = 1;
            for (int j = 1; j <= rem; j++) {
                fact *= j;
            }
            sum += fact;
        }
        System.out.println(" = " + sum);
        if (num == sum) {
            System.out.println(num + " = " + sum + " It's a Krishnamurthy Number");
        } else {
            System.out.println(num + " != " + sum + " It's Not a krishnamurthy number");
        }
        sc.close();
    }
}
