import java.util.Scanner;

public class Multi_Array_SpiralOrder {
    static int[][] spiralMatrix(int n){
        int arr[][]=new int[n-1][n-1];
        
        return arr;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows = ");
        int n = sc.nextInt();
        print2dArray(spiralMatrix(n));
        sc.close();
    }
}
