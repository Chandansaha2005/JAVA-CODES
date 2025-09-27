
public class Sort_0s_1s_2s_DNF_Algo {
    static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1)
                mid++;
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
    }// with DNF algorithm

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 2, 0, 1, 2, 1, 2, 0, 0, 1, 0, 1 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}