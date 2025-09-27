public class Sort_0s_1s_2s {
    // static void sort012(int[] arr) {
    // Arrays.sort(arr);
    // }// brute force O(nlogn)

    static void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i : arr) {
            if (i == 0)
                c0++;
            if (i == 1)
                c1++;
            if (i == 2)
                c2++;
            if (i > 2 || i < 0)
                return;
        }
        int in = 0;
        for (int i = 0; i < c0; i++) {
            arr[in++] = 0;
        }
        for (int i = 0; i < c1; i++) {
            arr[in++] = 1;
        }
        for (int i = 0; i < c2; i++) {
            arr[in++] = 2;
        }
    }// Optimized Approch

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 0, 0, 1, 0, 1 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}