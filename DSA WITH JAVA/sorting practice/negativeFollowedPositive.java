public class negativeFollowedPositive {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void partition(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && arr[i] < 0)
                i++;
            while (j >= 0 && arr[j] >= 0)
                j--;
            if (i < j)
                swap(arr, i, j);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 8, -5, 6, 7, -4, 9 };
        partition(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
