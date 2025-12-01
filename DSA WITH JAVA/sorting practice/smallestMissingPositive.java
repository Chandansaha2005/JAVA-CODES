public class smallestMissingPositive {
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length;) {
            if (arr[i] > n || arr[i] < 1 || arr[i] == i + 1 || arr[i] == arr[arr[i] - 1])
                i++;
            else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        System.out.print(firstMissingPositive(arr));
        System.out.println();
    }
}
