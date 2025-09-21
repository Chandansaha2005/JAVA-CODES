import java.util.Scanner;

public class selectionSort {
    static void printArray(int[] arr, int n) {
        System.out.println("\nArray:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (arr[i] > arr[min]) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, n);
        selection(arr);
        printArray(arr, n);
        sc.close();
    }
}
