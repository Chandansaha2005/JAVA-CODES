class Solution {
    int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    int pour(int fromCap, int toCap, int d) {
        int from = fromCap, to = 0, steps = 1;
        while (from != d && to != d) {
            int transfer = Math.min(from, toCap - to);
            to += transfer;
            from -= transfer;
            steps++;
            if (from == d || to == d) break;
            if (from == 0) {
                from = fromCap;
                steps++;
            }if (to == toCap) {
                to = 0;
                steps++;
            }
        } return steps;
    }
    public int minSteps(int m, int n, int d) {
        if (d > Math.max(m, n) || d % gcd(m, n) != 0) return -1;
        return Math.min(pour(m, n, d), pour(n, m, d));
    }
}
