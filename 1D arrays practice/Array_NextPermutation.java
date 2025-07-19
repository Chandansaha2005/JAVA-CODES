import java.util.Scanner;

public class Array_NextPermutation {

    static void nextPermutation(int arr[]) {
        int k = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                k = i - 1;
                break;
            }
        }
        if (k == -1) {
            rev(0, arr.length - 1, arr);
            printArray(arr);
            return;
        }
        for (int i = arr.length - 1; i > k; i--) {
            if (arr[i] > arr[k]) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        rev(k + 1, arr.length - 1, arr);
        printArray(arr);
    }

    static void rev(int start, int end, int arr[]) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int arr[] = new int[sc.nextInt()];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        nextPermutation(arr);
        sc.close();
    }
}
