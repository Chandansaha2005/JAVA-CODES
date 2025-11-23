import java.util.Scanner;

public class optimized_countSorting {

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
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;
        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < res.length; i++)
            arr[i] = res[i];
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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting : ");
        printArray(arr);

        countSort(arr, arr.length);

        System.out.print("After Sorting : ");
        printArray(arr);

        sc.close();
    }
}
