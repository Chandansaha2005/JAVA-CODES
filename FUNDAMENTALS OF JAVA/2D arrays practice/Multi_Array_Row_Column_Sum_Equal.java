import java.util.Scanner;

public class Multi_Array_Row_Column_Sum_Equal {
    static int balenceSum(int[][] mat) {
        int res = 0, maxS = 0;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[i][j];
            }
            maxS = Math.max(maxS, sum);
        }
        for (int j = 0; j < mat.length; j++) {
            int sum = 0;
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][j];
            }
            maxS = Math.max(maxS, sum);
        }
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[i][j];
            }
            res += maxS - sum;
        }
        return res;
    }

    static void print2dArray(int arr[][]) {
        System.out.println("\nMatrix:- ");
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
        int r = sc.nextInt();
        System.out.print("Enter the no. of Columns = ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.err.print("Enter the Element of " + (i + 1) + " no. row & " + (j + 1) + " no. Column = ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        print2dArray(arr);
        System.out.println(balenceSum(arr));
        sc.close();
    }
}
