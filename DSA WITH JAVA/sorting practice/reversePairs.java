public class reversePairs {
    static int res = 0;

    static int merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r)
            if (arr[i] > (2L * arr[j])) {
                res += (m - i + 1);
                j++;
            } else
                i++;
        i = l;
        j = m + 1;
        while (i <= m && j <= r)
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        while (i <= m)
            temp[k++] = arr[i++];
        while (j <= r)
            temp[k++] = arr[j++];
        for (i = 0; i < temp.length; i++)
            arr[l + i] = temp[i];
        return res;
    }

    static int mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return res;
    }

    public static int reversePairs(int[] nums) {
        res = 0;
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647 };
        int result = reversePairs(nums);
        System.out.println("Number of reverse pairs: " + result);
    }
}
