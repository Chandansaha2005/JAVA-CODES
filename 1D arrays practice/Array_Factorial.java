import java.util.Scanner;

public class Array_Factorial {
    static Scanner sc = new Scanner(System.in);

    static int multiply(int j, int arr[], int size) {
        int rem = 0;
        for (int i = 0; i < size; i++) {

        }
        return arr;
    }

    static void factorial(int n) {
        int arr[] = new int[1000];
        arr[0] = 1;
        int size = 1;
        for (int i = 2; i <= n; i++) {
            size = multiply(i, arr, size);
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        printArray(input(arr, factorial(sc.nextInt())));
    }
}
