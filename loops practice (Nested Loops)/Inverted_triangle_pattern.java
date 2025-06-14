
/*
* * * * 
* * * 
* * 
*  
*/
import java.util.Scanner;

public class Inverted_triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int row = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
