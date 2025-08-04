import java.util.Scanner;

public class Array_SubArrayPrefixSuffix {
    static Scanner sc = new Scanner(System.in);

    static int suffixSum(int arr[], int n) {
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        printArray(arr);
        return arr[n];
    }

    static int prefix(int arr[], int n) {
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            f += arr[i];
            arr[i] = f;
        }
        return n;
    }

    static void printArray(int arr[]) {
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void input(int arr[]) {
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the number of elements = ");
        int arr[] = new int[sc.nextInt()];
        input(arr);
        printArray(arr);
        System.out.print(prefix(arr, arr.length));
        System.out.print(suffixSum(arr, arr.length));
    }
}
