import java.util.Arrays;

public class Sort_0s_1s_2s {
    // static void sort012(int[] arr) {
    // Arrays.sort(arr);
    // }//brute force O(nlogn)


    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 0, 0, 1, 0, 1 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}