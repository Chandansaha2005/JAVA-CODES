import java.util.Scanner;

public class Multi_Array_PrefixSum_Pre_Calculating {
    static void prefixSumMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    static int prefixSum(int arr[][], int s1, int s2, int e1, int e2) {
        int sum = 0;
        prefixSumMatrix(arr);
        for (int i = s1; i <= e1; i++) {
            if (s2 > 0)
                sum += arr[i][e2] - arr[i][s2 - 1];
            else
                sum += arr[i][e2];
        }
        return sum;
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
        System.out.println("---:Enter Co-Ordinates For Prefix Sum:---");
        System.out.print("Enter the no. 1st Co-ordinate of Starting index = ");
        int s1 = sc.nextInt();
        System.out.print("Enter the no. 2nd Co-ordinate of Starting index = ");
        int s2 = sc.nextInt();
        System.out.print("Enter the no. 1st Co-ordinate of Ending index = ");
        int e1 = sc.nextInt();
        System.out.print("Enter the no. 2nd Co-ordinate of Ending index = ");
        int e2 = sc.nextInt();
        System.out.print("Prefix Sum = " + prefixSum(arr, s1, s2, e1, e2));
        sc.close();
    }

}
