import java.util.Scanner;

public class Multi_Array_MatrixMultiplication {
    static Scanner sc = new Scanner(System.in);

    static int[][] Multiply2dArrays(int arr1[][], int arr2[][], int r1, int c1, int r2, int c2) {
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return ans;
    }

    static void input2dArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.print("Enter the Element of " + (i + 1) + " no. row & " + (j + 1) + " no. Column = ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void print2dArray(int arr[][]) {
        System.out.println("Matrix:- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the no. of Rows of 1st Matrices = ");
        int r1 = sc.nextInt();
        System.out.print("Enter the no. of Columns of 1st Matrices = ");
        int c1 = sc.nextInt();
        System.out.print("Enter the no. of Rows of 1st Matrices = ");
        int r2 = sc.nextInt();
        System.out.print("Enter the no. of Columns of 1st Matrices = ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("WRONG INPUT !!! \nNo. of Columns of 1st Matrix And No. Rows Of 2nd Matrix Should be ");

        } else {
            int arr1[][] = new int[r1][c1];
            int arr2[][] = new int[r2][c2];
            System.out.println("Enter Elements for 1st Matrix:-");
            input2dArray(arr1);
            print2dArray(arr1);
            System.out.println("Enter Elements for 1st Matrix:-");
            input2dArray(arr2);
            print2dArray(arr2);
            System.out.println("Multiplication of This Two Matrix :-");
            print2dArray(Multiply2dArrays(arr1, arr2, r1, c1, r2, c2));
        }
        sc.close();
    }
}
