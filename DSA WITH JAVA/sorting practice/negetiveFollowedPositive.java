public class negetiveFollowedPositive {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void partition(int[] arr) {
        int right = arr.length - 1, left = 0;
        
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 8, -5, 6, 7, -4, 9 };
        partition(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
