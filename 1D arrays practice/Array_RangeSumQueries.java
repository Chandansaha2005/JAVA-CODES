import java.util.Scanner;

public class Array_RangeSumQueries {
    static int prefixSum(int arr[], int l, int r) {
        int f = 0;
        for (int i = l; i <= r; i++) {
            f += arr[i];
        }
        return f;
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element = ");
        int n = sc.nextInt();
        int arr[] = new int[n], l = 0, r = 0;
        System.out.print("Enter the Elements in Sorted manner = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("Enter the Starting Index = ");
        l = sc.nextInt();
        System.out.print("Enter the Ending Index = ");
        r = sc.nextInt();
        System.out.print("Sum from Index " + l + " to Index " + r + " = " + prefixSum(arr, l, r));
        sc.close();
    }
}
