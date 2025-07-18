import java.util.Scanner;

public class Array_MaximumProductSubarray {
    static Scanner sc = new Scanner(System.in);

    static int maxProduct(int[] arr) {
        int max = arr[0], min = arr[0], res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int p = arr[i];
            if (p < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(p, max * p);
            min = Math.min(p, min * p);
            res = Math.max(res, max);
        }
        return res;
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

        System.out.print("\nSmallest Positive Missing Number in The Array = " + maxProduct(arr));
    }
}
