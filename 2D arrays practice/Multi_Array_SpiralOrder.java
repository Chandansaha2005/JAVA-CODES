
/*
1 2 3 
4 5 6 
7 8 9
output = 1 2 3 6 9 8 7 4 5  
 */
import java.util.Scanner;

public class Multi_Array_SpiralOrder {
    static void spiralOrder(int arr[][], int r, int c) {
        // topRow -> lastColumn -> buttomRow -> firstColumn
        // -> 2ndTopRow -> 2ndLastColumn -> 2ndButtomRow -> 2ndFirstColumn
        // -> And so on.......
        int topRow = 0, buttomRow = r - 1, firstColumn = 0, lastColumn = c - 1;
        int total = 0;
        System.out.println("Elements in Spiral Order :--");
        while (total < r * c) {
            // topRow -> firstColumn to lastColumn
            for (int i = firstColumn; i <= lastColumn && total < r * c; i++) {
                System.out.print(arr[topRow][i] + " ");
                total++;
            }
            topRow++;
            // lastColumn -> topRow to buttomRow
            for (int i = topRow; i <= buttomRow && total < r * c; i++) {
                System.out.print(arr[i][lastColumn] + " ");
                total++;
            }
            lastColumn--;
            // buttomRow -> lastColumn to firstColumn
            for (int i = lastColumn; i >= firstColumn && total < r * c; i--) {
                System.out.print(arr[buttomRow][i] + " ");
                total++;
            }
            buttomRow--;
            // firstColumn -> buttomRow to topRow
            for (int i = buttomRow; i >= topRow && total < r * c; i--) {
                System.out.print(arr[i][firstColumn] + " ");
                total++;
            }
            firstColumn++;
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of Columns = ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.print("Enter the Elements = ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print2dArray(arr);
        spiralOrder(arr, r, c);
        sc.close();
    }
}
