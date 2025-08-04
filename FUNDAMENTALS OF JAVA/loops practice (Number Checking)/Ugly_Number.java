
// Ugly Number
// Definition: A number whose prime factors are only 2, 3, or 5.
// Example: 30 → 2×3×5 → Ugly
import java.util.Scanner;

public class Ugly_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int n = num;
        boolean flag = true;

        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (num % i == 0) {
                num = num / i;
                count++;
            }
            if (count > 0) {
                System.out.println(i + "^" + count);
                if (i > 5) {
                    flag = false;
                }
            }

        }
        if (flag) {
            System.out.println("The number is ugly");
        } else {
            System.out.println("The number is not ugly");
        }
        sc.close();
    }
}
