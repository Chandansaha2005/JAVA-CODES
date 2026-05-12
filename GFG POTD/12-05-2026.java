class Solution {
      public ArrayList<Long> RangeLCMQuery(int[] arr, int[][] queries) {
        SegmentTree st = new SegmentTree(arr);
        ArrayList<Long> result = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 1) st.update(q[1], q[2], 0, arr.length - 1, 1);
            else result.add(st.query(q[1], q[2], 0, arr.length - 1, 1));
        }
        return result;
    }
}
class SegmentTree {
    int n;
    long[] tree;
    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new long[4 * n];
        build(arr, 0, n - 1, 1);
    }
    private long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
    private long lcm(long a, long b) {
        if (a == 0 || b == 0) return Math.max(a, b);
        return (a / gcd(a, b)) * b;
    }
    private void build(int[] arr, int l, int r, int idx) {
        if (l == r) {
            tree[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr, l, mid, 2 * idx);
        build(arr, mid + 1, r, 2 * idx + 1);
        tree[idx] = lcm(tree[2 * idx], tree[2 * idx + 1]);
    }
    public void update(int pos, int val, int l, int r, int idx) {
        if (l == r) {
            tree[idx] = val;
            return;
        }
        int mid = (l + r) / 2;
        if (pos <= mid) update(pos, val, l, mid, 2 * idx);
        else update(pos, val, mid + 1, r, 2 * idx + 1);
        tree[idx] = lcm(tree[2 * idx], tree[2 * idx + 1]);
    }
    public long query(int ql, int qr, int l, int r, int idx) {
        if (qr < l || ql > r) return 1;
        if (ql <= l && r <= qr) return tree[idx];
        int mid = (l + r) / 2;
        long left = query(ql, qr, l, mid, 2 * idx);
        long right = query(ql, qr, mid + 1, r, 2 * idx + 1);
        return lcm(left, right);
    }
}
