import java.util.Scanner;

public class Multi_Array_PascalTriangle {
    static void print2dArray(int arr[][]) {
        System.out.println("Matrix:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * 1. arr[i][j]=arr[i-1][j]+arr[i-1][j-1]
     * as in pascal triangle each element is the sum of it's upper left and right
     * side element
     * 2.In every row , first &last element = 1
     * 3. Jagged/Staggered Array => ith row has (i+1) columns
     */
    static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i+1 columns
            ans[i] = new int[i + 1];
            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows = ");
        int n = sc.nextInt();
        print2dArray(pascalTriangle(n));
        sc.close();
    }
}