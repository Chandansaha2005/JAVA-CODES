
// Smith Number
// Definition: Composite number where sum of digits = sum of digits of its prime factors.
// Example: 666 → 6+6+6 = 18
// Prime factors: 2×3×3×37 → 2+3+3+3+7 = 18 → Smith
import java.util.Scanner;

public class Smith_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), sum = 0, psum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
            System.out.print(" + " + (i % 10));
        }
        System.out.println(" = " + sum);

        // Prime factor
        for (int j = 2, n = num; j <= n; j++) {
            int count = 0;
            while (num % j == 0) {
                num = num / j;
                count++;
            }
            if (count > 0) {
                System.out.println(j + "^" + count);
                if (j < 10) {
                    psum += j;
                } else {
                    for (int i = j; i > 0; i /= 10) {
                        psum += i % 10;
                        System.out.print(" + " + (i % 10));
                    }
                }
            }System.out.println(psum);
        }
    }
}
