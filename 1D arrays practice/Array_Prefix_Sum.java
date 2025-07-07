import java.util.Scanner;

public class Array_Prefix_Sum {

    static int[] prefixSum(int arr[]) {
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            f += arr[i];
            arr[i] = f;
        }
        return arr;
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
        int arr[] = new int[n];
        System.out.print("Enter the Elements in Sorted manner = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        printArray(prefixSum(arr));
        sc.close();
    }
}
