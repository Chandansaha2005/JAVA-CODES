class Solution {
    static int maxSumSub(int[] arr) {
        int n = arr.length,sum = 0,ans = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;
        }
        return ans;
    }
    static int maxOnes(int[] arr) {
        int n = arr.length,oneCnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                arr[i] = -1;
                oneCnt++;
            } else arr[i] = 1;
        }
        int maxDiff = maxSumSub(arr);
        return oneCnt + maxDiff;
    }
};
