
// Magic Number
// Definition: Recursive sum of digits equals 1.
// Example: 1729 → 1+7+2+9 = 19 → 1+9 = 10 → 1+0 = 1 → Magic
import java.util.Scanner;

public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int n = num;

        while (num >= 10) {
            int sum = 0;
            for (; num > 0; num /= 10) {
                sum += num % 10;
                System.out.print(" + " + num % 10);
            }
            num = sum;
            System.out.println(" = " + num);
        }

        if (num == 1) {
            System.out.println(n + " is a Magic Number!");
        } else {
            System.out.println(n + " is Not a Magic Number.");
        }

        sc.close();
    }
}
