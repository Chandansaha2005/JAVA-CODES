import java.util.Scanner;

public class opti_bubbleSort {
    static void printArray(int[] arr, int n) {
        System.out.println("\nArray:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("\nIteration = " + i + 1);
            printArray(arr, arr.length);           
            for (int j = 0; j < arr.length - i - 1; j++) {
                boolean swap = true;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = false;
                }
                if (swap)
                    return;
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
        bubble(arr);
        printArray(arr, n);
        sc.close();
    }
}
