public class reversePairs {
    static int merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int res = 0;
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                res += (m - i + 1);
            }
        }
        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= r)
            temp[k++] = arr[j++];

        for (i = 0; i < temp.length; i++) {
            arr[l + i] = temp[i];
        }
        return res;
    }

    static int mergeSort(int[] arr, int l, int r) {
        int res = 0;
        if (l < r) {
            int m = (r + l) / 2;
            res += mergeSort(arr, l, m);
            res += mergeSort(arr, m + 1, r);
            res += merge(arr, l, m, r);
        }
        return res;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 7, 5, 6, 4 };
        int result = reversePairs(nums);
        System.out.println("Number of reverse pairs: " + result);
    }
}
