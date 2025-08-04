import java.util.Scanner;

public class Multi_Array_MatrixAddition {
    static Scanner sc = new Scanner(System.in);

    static void add2dArrays(int arr1[][], int arr2[][]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
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

        System.out.print("Enter the no. of Rows and Column of Matrices = ");
        int r = sc.nextInt();
        int arr1[][] = new int[r][r];
        int arr2[][] = new int[r][r];
        System.out.println("Enter Elements for 1st Matrix:-");
        input2dArray(arr1);
        print2dArray(arr1);
        System.out.println("Enter Elements for 1st Matrix:-");
        input2dArray(arr2);
        print2dArray(arr2);
        System.out.println("Addition of This Two Matrix :-");
        add2dArrays(arr1, arr2);
        print2dArray(arr1);
        sc.close();
    }
}
