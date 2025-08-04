import java.util.Arrays;
import java.util.Scanner;

public class Array_LargestThreeElement {
    static Scanner sc = new Scanner(System.in);

    static void largestThree(int arr[]) {
        if (arr.length < 3) {
            printArray(arr);
            return;
        }
        for (int i = arr.length - 1; i > arr.length - 4; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printArray(int arr[]) {
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
        Arrays.sort(arr);
        System.out.print("Largest three Number in The Array = ");
        largestThree(arr);
    }
}
