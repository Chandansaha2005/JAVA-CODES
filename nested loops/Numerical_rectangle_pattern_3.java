
/*
121212
121212
121212
121212 
*/
import java.util.Scanner;

public class Numerical_rectangle_pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 2; j++) {
                if (j % 2 == 0) {
                    System.out.print("2");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
