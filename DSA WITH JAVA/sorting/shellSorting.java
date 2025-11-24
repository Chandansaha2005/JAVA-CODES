import java.util.Scanner;

public class shellSorting {

    static void shellSort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2)
            for (int i = gap; i < arr.length; i++)
                for (int j = i - gap; j >= 0; j -= gap)
                    if (arr[j + gap] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    } else
                        break;
        // for (int gap = n / 2; gap > 0; gap /= 2)
        // for (int i = gap; i < n; i++) {
        // int temp = arr[i], j;
        // for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
        // arr[j] = arr[j - gap];
        // arr[j] = temp;
        // }
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
        shellSort(arr);
        System.out.println("\nSorted array:");
        printArray(arr);
        sc.close();
    }

}
