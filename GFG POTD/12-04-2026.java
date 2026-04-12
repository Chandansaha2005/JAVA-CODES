class Solution {
    public boolean isToeplitz(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        for(int i = 1; i < n; i++) for(int j = 1; j < m; j++) if(mat[i][j] != mat[i - 1][j - 1]) return false;
        return true;
    }
}