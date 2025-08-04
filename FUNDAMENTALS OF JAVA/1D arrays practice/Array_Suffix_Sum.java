import java.util.Scanner;

public class Array_Suffix_Sum {
    static void suffixSum(int arr[]) {
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i] = arr[i] + arr[i + 1];
        }
        printArray(arr);
    }

    static void printArray(int arr[]) {
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        suffixSum(arr);
        sc.close();
    }
}
