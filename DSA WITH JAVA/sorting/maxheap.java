public class maxheap {
    static void findMax(int[] arr, int index, int n) {
        int largest=
    }

    static void builtheap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            findMax(arr, i, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 3, 8, 10, 2, 5 };
        builtheap(arr, arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
