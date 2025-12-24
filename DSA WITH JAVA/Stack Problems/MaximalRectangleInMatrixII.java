import java.util.Stack;

public class MaximalRectangleInMatrixII {
    public static int maxArea(int mat[][]) {
        if (mat.length == 0)
            return 0;
        for (int i = 0; i < mat[0].length; i++)
            for (int j = 1; j < mat.length; j++)
                if (mat[j][i] != 0)
                    mat[j][i] += mat[j - 1][i];

        int max = 0;
        for (int[] row : mat)
            max = Math.max(max, largestRectangleArea(row));
        return max;
    }

    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        nse[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        while (!st.isEmpty())
            st.pop();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < pse.length; i++)
            maxArea = Math.max(maxArea, arr[i] * (nse[i] - pse[i] - 1));
        return maxArea;
    }

    public static void main(String[] args) {
        // Sample test case 1
        int[][] mat1 = {
                { 1, 0, 1, 0, 0 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 0, 0, 1, 0 }
        };
        System.out.println("Test1 Output: " + maxArea(mat1));

        // Sample test case 2 (single row)
        int[][] mat2 = {
                { 1, 0, 1, 1 }
        };
        System.out.println("Test2 Output: " + maxArea(mat2));

        // Sample test case 3 (empty matrix)
        int[][] mat3 = {};
        System.out.println("Test3 Output: " + maxArea(mat3));
    }
}
