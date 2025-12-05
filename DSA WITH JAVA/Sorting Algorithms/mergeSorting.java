import java.util.Scanner;

public class mergeSorting {

    static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right)
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];

        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        for (int l = 0; l < k; l++)
            arr[left + l] = temp[l];

    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

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