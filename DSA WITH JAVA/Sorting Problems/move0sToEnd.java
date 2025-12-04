public class move0sToEnd {
    static void sort0s(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 5, 0, 3, 4, 2 };
        sort0s(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
