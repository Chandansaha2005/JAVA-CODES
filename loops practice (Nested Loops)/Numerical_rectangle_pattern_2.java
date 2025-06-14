
/*
1 2 3 4 5 6 
1 2 3 4 5 6 
1 2 3 4 5 6 
1 2 3 4 5 6 
*/
import java.util.Scanner;

public class Numerical_rectangle_pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
