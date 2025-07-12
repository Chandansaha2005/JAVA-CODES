import java.util.Scanner;

public class Array_ProductOfAll {
    static Scanner sc = new Scanner(System.in);

    static int productOfSum(int arr[]) {
        int p = 1;
        for (int i = 0; i < arr.length; i++) {
            p *= arr[i];
        }
        return p;
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
        System.out.print("Product of all Element in The Array = " + productOfSum(arr));
    }
}
