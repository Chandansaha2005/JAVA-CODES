import java.util.Scanner;

public class Array_IntegerSwap {
    static int[] SwapIntergers(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
            break;
        }
        return a;
    }

    static void printArray(int a[]) {
        System.out.print("Numbers = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        System.out.print("Enter Two Numbers to Swap = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        SwapIntergers(arr);
        System.out.print("After Swapping ");
        printArray(arr);
        sc.close();
    }
}
