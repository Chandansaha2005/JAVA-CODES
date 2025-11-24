public class swapFix {
    static void fix(int[] arr) {
        int x = -1, y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (x == -1 && arr[i] < arr[i - 1])
                x = i - 1;
            if (arr[i] < arr[i - 1])
                y = i;
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 5, 6, 7, 4, 9 };
        fix(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
