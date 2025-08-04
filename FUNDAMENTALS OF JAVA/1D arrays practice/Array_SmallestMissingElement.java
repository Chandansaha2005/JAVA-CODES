import java.util.Arrays;
import java.util.Scanner;

public class Array_SmallestMissingElement {
    static Scanner sc = new Scanner(System.in);

    static int smallestMissing(int arr[]) {
        Arrays.sort(arr);
        int smallest = 1;
        for (int num : arr) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
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

        System.out.print("\nSmallest Positive Missing Number in The Array = " + smallestMissing(arr));
    }
}
