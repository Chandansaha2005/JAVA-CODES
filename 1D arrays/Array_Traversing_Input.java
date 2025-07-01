import java.util.Scanner;

public class Array_Traversing_Input {
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter 5 values = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("\nArray = ");
        PrintArray(arr);
    }
}
