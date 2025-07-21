import java.util.Scanner;

public class Array_StockBuySell {
    static Scanner sc = new Scanner(System.in);

    static int maxProfit(int arr[]) {
        int Profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                Profit += arr[i] - arr[i - 1];
            }
        }
        return Profit;
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
        System.out.print("Maximum Profit = " + maxProfit(arr));
    }
}
