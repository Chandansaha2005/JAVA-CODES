public class negetiveFollowedPositive {
    static swap(int i,int j){
        int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
    }

    static void partition(int[] arr) {
        int pivot = arr[arr.length - 1], i = -1;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] < pivot) {
                i++;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, -3, 8, -5, 6, 7, -4, 9 };
        partition(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
