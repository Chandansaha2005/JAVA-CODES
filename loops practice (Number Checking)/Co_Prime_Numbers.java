
// Co-Prime Numbers
// Definition: Two numbers with GCD = 1.
// Example: (8, 15) → GCD = 1 → Co-Prime
import java.util.Scanner;

public class Co_Prime_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt(), small, c = 0;
        if (num1 < num2)
            small = num1;
        else
            small = num2;
        for (int i = 1; i <= small; i++) {
            if (num2 % i == 0 && num1 % i == 0) {
                c++;
                System.out.println("GCD = " + i);
            }
        }
        if (c < 2) {
            System.out.println("(" + num1 + "," + num2 + ") are Co-Prime");
        } else {
            System.out.println("(" + num1 + "," + num2 + ") are Not Co-Prime");
        }
        sc.close();
    }
}
