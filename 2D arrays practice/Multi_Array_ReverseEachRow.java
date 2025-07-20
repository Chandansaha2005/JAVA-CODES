import java.util.Scanner;

public class Multi_Array_ReverseEachRow {
    static Scanner sc = new Scanner(System.in);

    static void reverse(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void reverseEachRow(int arr[][]) {
        for (int[] i : arr) {
            reverse(i);
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

        System.out.print("Enter the no. of Rows of Matrix = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of Column of Matrix = ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter Elements:-");
        input2dArray(arr);
        print2dArray(arr);
        System.out.println("Reversing Each Row Of This Matrix :-");
        reverseEachRow(arr);
        print2dArray(arr);
        sc.close();
    }
}