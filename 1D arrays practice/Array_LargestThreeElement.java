import java.util.Arrays;
import java.util.Scanner;

public class Array_LargestThreeElement {
    static Scanner sc = new Scanner(System.in);

    static int[] largestThree(int arr[]) {
        int ans[] = { 0, 0, 0 };
        for (int i = 1; i <= ans.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1] && arr[j - 1] != ans[i - 1]) {
                    ans[i - 1] = arr[j - 1];
                }
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
