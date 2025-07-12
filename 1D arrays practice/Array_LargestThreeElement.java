import java.util.Arrays;
import java.util.Scanner;

public class Array_LargestThreeElement {
    static Scanner sc = new Scanner(System.in);

    static int[] largestThree(int arr[]) {
        int ans[] = new int[3], i = 0;
        ans[i] = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > arr[j - 1]) {
                ans[i++] = arr[j];
            }
        }
        return ans;
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
        System.out.print("Largest three Number in The Array = ");
        printArray(largestThree(arr));
    }
}
