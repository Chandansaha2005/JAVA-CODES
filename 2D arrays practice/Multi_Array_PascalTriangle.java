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
        print2dArray(RotateMatrix(arr, r, c));
        sc.close();
    }
}