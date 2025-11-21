import java.util.Scanner;

public class mergeSorting {

    /**
     * The `merge` function merges two sorted subarrays within a larger array in
     * ascending order.
     * 
     * @param arr   The `arr` parameter is an integer array that represents the
     *              input array that needs to
     *              be merged.
     * @param left  The `left` parameter in the `merge` method represents the
     *              starting index of the left
     *              subarray that needs to be merged. It indicates the beginning
     *              index of the range of elements in
     *              the original array that are to be sorted and merged.
     * @param mid   The `mid` parameter in the `merge` method represents the index
     *              that divides the array
     *              into two subarrays. It is the middle index between the `left`
     *              and `right` indices, indicating
     *              the boundary between the left and right subarrays that need to
     *              be merged.
     * @param right The `right` parameter in the `merge` method represents the index
     *              of the rightmost
     *              element in the subarray that is being merged. It indicates the
     *              end point of the right subarray
     *              within the overall array that needs to be merged.
     */
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

    /**
     * The `mergeSort` function recursively divides an array into smaller subarrays
     * and then merges
     * them in sorted order.
     * 
     * @param arr   The `arr` parameter is an array of integers that you want to
     *              sort using the merge
     *              sort algorithm.
     * @param left  The `left` parameter represents the index of the leftmost
     *              element in the array or
     *              subarray that you want to sort. In the `mergeSort` function, it
     *              indicates the starting index of
     *              the current subarray being sorted.
     * @param right The `right` parameter in the `mergeSort` method represents the
     *              index of the
     *              rightmost element in the subarray that is currently being
     *              sorted. It helps in dividing the array
     *              into smaller subarrays for sorting and merging during the merge
     *              sort algorithm.
     */
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