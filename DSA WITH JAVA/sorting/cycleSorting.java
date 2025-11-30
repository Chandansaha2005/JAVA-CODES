import java.util.Scanner;

public class cycleSorting {

    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i)
                i++;
            else {
                int idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        cycleSort(arr);
        System.out.println("\nSorted array:");
        printArray(arr);
        sc.close();
    }
}