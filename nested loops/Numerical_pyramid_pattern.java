
/*
   1
  121
 12321
1234321
 */
import java.util.Scanner;

public class Numerical_pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int o = i - 1; o >= 1; o--) {
                System.out.print(o);
            }
            System.out.println();
        }
        sc.close();
    }
}
