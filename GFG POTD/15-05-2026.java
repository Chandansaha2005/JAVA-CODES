class Solution {
    public int optimalKeys(int n) {
        if (n <= 6) return n; 
        int[] dp = new int[n + 1];
        for (int i = 0; i <= 6 && i <= n; i++) dp[i] = i;
        for (int i = 7; i <= n; i++) {
            dp[i] = 0;
            for (int j = i - 3; j >= 1; j--) {
                int curr = dp[j] * (i - j - 1);
                dp[i] = Math.max(dp[i], curr);
            }
        } return dp[n];
    }
}