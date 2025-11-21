import java.util.Scanner;

public class quickSorting {
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before Sorting : ");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("After Sorting : ");
        printArray(arr);
        sc.close();
    }
}
