
/*
//Pascal Triangle
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
*/
import java.util.Scanner;

public class PascalTriangle {
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static int Com(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));

    }

    public static void pascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(Com(i, j) + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row = ");
        int row = sc.nextInt();
        pascal(row);
        sc.close();
    }
}
