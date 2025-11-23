public class countInversions {

    // using merge sort
    static int merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0, count = 0;
        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right)
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];

        for (int l = 0; l < k; l++)
            arr[left + l] = temp[l];
        return count;
    }

    static int inversions(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += inversions(arr, left, mid);
            count += inversions(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    static int count(int[] arr) {
        return inversions(arr, 0, arr.length - 1);
    }
    // Brute Force (n^2)
    // static int inversions(int[] arr) {
    // int count = 0;
    // for (int i = 0; i < arr.length - 1; i++)
    // for (int j = i; j < arr.length; j++)
    // if (arr[i] > arr[j]) count++;
    // return count;
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(count(arr));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
