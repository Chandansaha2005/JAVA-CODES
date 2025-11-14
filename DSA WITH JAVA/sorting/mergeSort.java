public class mergeSort {
    static void merge(int []arr,int low,int mid,int high){
        int i , j ; 
        
    }

    static void divide(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 9, 10, 7 };
        divide(arr, 0, arr.length - 1);
        printArray(arr);
    }
}