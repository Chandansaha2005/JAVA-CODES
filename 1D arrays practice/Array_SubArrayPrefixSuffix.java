import java.util.Scanner;

public class Array_SubArrayPrefixSuffix {
    static Scanner sc = new Scanner(System.in);

    static void suffixSum(int arr[]) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        printArray(arr);
    }

    static int prefix(arr[])

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
    }
}
