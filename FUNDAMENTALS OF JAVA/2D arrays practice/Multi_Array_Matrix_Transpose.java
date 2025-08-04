import java.util.Scanner;

public class Multi_Array_Matrix_Transpose {
    static Scanner sc = new Scanner(System.in);

    static int[][] Transpose(int arr[][], int r, int c) {
        int[][] trans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        return trans;
    }

    static int[][] TransposeInPlace(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
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

        System.out.print("Enter the no. of Rows of Matrix = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of Column of Matrix = ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter Elements:-");
        input2dArray(arr);
        print2dArray(arr);
        System.out.println("Transpose Of This Matrix :-");
        // print2dArray(Transpose(arr, r, c));
        print2dArray(TransposeInPlace(arr, r, c));
        sc.close();
    }
}