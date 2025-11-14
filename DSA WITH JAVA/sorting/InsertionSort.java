/**
 * The InsertionSort class contains a static method that implements the
 * insertion sort algorithm to
 * sort an integer array in ascending order.
 */

public class InsertionSort {
    static void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // This part of the code is the inner loop of the insertion sort algorithm. It
            // is
            // responsible for shifting elements to the right until the correct position for
            // the current
            // element is found within the sorted part of the array.
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            } 
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 9, 10, 7 };
        insertion(arr);
        printArray(arr);
    }
}
