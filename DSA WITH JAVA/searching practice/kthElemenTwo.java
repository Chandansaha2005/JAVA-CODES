public class kthElemenTwo {
    static int kthElement(int[] a, int[] b, int k) {
        int n = a.length, m = b.length;
        if (n > m) return kthElement(b, a, k);
        int lo = Math.max(0, k - m), hi = Math.min(k, n);
        while (lo <= hi) {
            int mid1 = (lo + hi) / 2,mid2 = k - mid1;
            int l1 = (mid1 == 0 ? Integer.MIN_VALUE : a[mid1 - 1]);
            int r1 = (mid1 == n ? Integer.MAX_VALUE : a[mid1]);
            int l2 = (mid2 == 0 ? Integer.MIN_VALUE : b[mid2 - 1]);
            int r2 = (mid2 == m ? Integer.MAX_VALUE : b[mid2]);
            if (l1 <= r2 && l2 <= r1) return Math.max(l1, l2);
            if (l1 > r2) hi = mid1 - 1;
            else lo = mid1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 7, 9 };
        int[] b = { 1, 4, 8, 10 };
        int k = 5;
        System.out.println(kthElement(a, b, k));
    }
}