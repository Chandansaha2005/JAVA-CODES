
/* 
   1
  2 2
 3   3
4444444
*/
import java.util.Scanner;

public class Numerical_pyramid_pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int o = i; o >= 1; o--) {
                if (i != row && o != i) {
                    System.out.print(" ");
                } else
                    System.out.print(i);
            }
            for (int k = 2; k <= i; k++) {
                if (i != row && k < i) {
                    System.out.print(" ");
                } else
                    System.out.print(i);
            }

            System.out.println();
        }
        sc.close();
    }
}
