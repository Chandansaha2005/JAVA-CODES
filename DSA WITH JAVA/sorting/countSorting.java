import java.util.Scanner;

public class countSorting {

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int arr[], int n) {
        int max = findMax(arr), k = 0;
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements = ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Before Sorting : ");
        printArray(arr);
        countSort(arr, arr.length - 1);
        System.out.print("After Sorting : ");
        printArray(arr);
        sc.close();
    }
}
