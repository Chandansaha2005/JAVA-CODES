public class mergeWithoutGaps {
    static void mergeArrays(int[] a, int[] b) {
        int n = a.length,m = b.length,gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                if (j < n && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (i < n && j >= n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                } else if (i >= n && b[i - n] > b[j - n]) {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }
                i++;
                j++;
            }
            if (gap == 1)
                break;
            gap = (gap + 1) / 2;
        }
    }
    public static void main(String[] args) {
        int[] a = { 1, 5, 9, 10, 15, 20 };
        int[] b = { 2, 3, 8, 13 };
        mergeArrays(a, b);

        for (int ele : a)
            System.out.print(ele + " ");
        System.out.println();
        for (int ele : b)
            System.out.print(ele + " ");
    }
}