public class mergeSort {
    static void MergeSort(int []arr,low,high){
        mid=(low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        merge
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 9, 10, 7 };
        MergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}