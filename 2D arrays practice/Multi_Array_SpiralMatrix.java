import java.util.Scanner;

public class Multi_Array_SpiralMatrix {
    static int[][] spiralMatrix(int r, int c) {
        int arr[][] = new int[r][c];
        // topRow -> lastColumn -> buttomRow -> firstColumn
        // -> 2ndTopRow -> 2ndLastColumn -> 2ndButtomRow -> 2ndFirstColumn
        // -> And so on.......
        int topRow = 0, buttomRow = r - 1, firstColumn = 0, lastColumn = c - 1;
        int total = 0;
        System.out.println("Elements in Spiral Order :--");
        while (total < r * c) {
            // topRow -> firstColumn to lastColumn
            for (int i = firstColumn; i <= lastColumn && total < r * c; i++) {
                System.out.print(total++ + " ");
            }
            topRow++;
            // lastColumn -> topRow to buttomRow
            for (int i = topRow; i <= buttomRow && total < r * c; i++) {
                System.out.print(total++ + " ");
            }
            lastColumn--;
            // buttomRow -> lastColumn to firstColumn
            for (int i = lastColumn; i >= firstColumn && total < r * c; i--) {
                System.out.print(total++ + " ");
            }
            buttomRow--;
            // firstColumn -> buttomRow to topRow
            for (int i = buttomRow; i >= topRow && total < r * c; i--) {
                System.out.print(total++ + " ");
            }
            firstColumn++;
        }
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
        int r = sc.nextInt();
        System.out.print("Enter the no. of Columns = ");
        int c = sc.nextInt();
        print2dArray(spiralMatrix(r, c));
        sc.close();
    }
}
