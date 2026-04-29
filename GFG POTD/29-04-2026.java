class Solution {
    public int minSwaps(int[] arr) {
        int numberOfOnes = 0,n = arr.length;
        for (int i = 0; i < n; i++) if (arr[i] == 1) numberOfOnes++;
        if (numberOfOnes == 0) return -1;
        int x = numberOfOnes,count_ones = 0, maxOnes;
        for (int i = 0; i < x; i++) if (arr[i] == 1) count_ones++;
        maxOnes = count_ones;
        for (int i = 1; i <= n - x; i++) {
            if (arr[i - 1] == 1) count_ones--;
            if (arr[i + x - 1] == 1) count_ones++;
            if (maxOnes < count_ones) maxOnes = count_ones;
        }
        int numberOfZeroes = x - maxOnes;
        return numberOfZeroes;
    }
}
