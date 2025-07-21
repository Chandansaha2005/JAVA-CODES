import java.util.Scanner;

public class Array_StockBuySell {
    static Scanner sc = new Scanner(System.in);

    static int max(int arr[], int start) {
        int max = arr[0];
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                max = arr[i - 1];
            }
        }
        return max;
    }

    static int maxProfit(int arr[]) {
        int max = 0, buy = 0, sell = 0, Profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                Profit-=arr[i-1];
        }else if(arr[])
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
