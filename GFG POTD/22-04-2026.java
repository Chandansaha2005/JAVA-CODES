class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length,q = queries.length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        for (int i = 0; i < q; i++) {
            int l = queries[i][0],r = queries[i][1], sum = prefixSum[r + 1] - prefixSum[l], count = r - l + 1;
            result.add(sum / count);
        }
        return result;
    }
}
