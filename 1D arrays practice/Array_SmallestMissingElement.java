import java.util.Arrays;
import java.util.Scanner;

public class Array_SmallestMissingElement {
    static Scanner sc = new Scanner(System.in);

    static int smallestMissing(int arr[]) {
        int num = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] - 1 != arr[i - 1]) {
                num = arr[i] - 1;
            }
        }
        return num;
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
        Arrays.sort(arr);
        System.out.print("Smallest Positive Missing Number in The Array = " + smallestMissing(arr));
    }
}
