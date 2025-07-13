
// Find the difference between the sum of elements at even indices to the sum of elements at odd indices
import java.util.Scanner;

public class Array_SumOfEvenVsSumOfOdd {
    static Scanner sc = new Scanner(System.in);

    static int evenAndOddDiff(int arr[]) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        return even - odd;
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
        System.out.print("Difference Between Even And Odd Index element = " + evenAndOddDiff(arr));
    }
}
