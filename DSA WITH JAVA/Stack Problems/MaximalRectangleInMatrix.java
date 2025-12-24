import java.util.Stack;

class MaximalRectangleInMatrix {
    public static int maximalRectangle(char[][] matrix) {
        int[][] mat = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mat[i][j] = matrix[i][j] - '0';
            }
        }
        // prefix sum Column wise. And if zero occur then continue or ignore it.
        for (int i = 0; i < mat.length - 1; i++) {
            if (mat[i][i + 1] == 0)
                continue;
            else
                mat[i][i + 1] += mat[i][i];
        }
        for (int[] cs : mat) {
            for (int c : cs) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        return 0; // placeholder
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
        char[][] matrix1 = {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' }
        };
        System.out.println("Test1 Output: " + maximalRectangle(matrix1));

        // Sample test case 2 (empty matrix)
        char[][] matrix2 = {};
        System.out.println("Test2 Output: " + maximalRectangle(matrix2));

        // Sample test case 3 (single row)
        char[][] matrix3 = {
                { '1', '1', '1', '1' }
        };
        System.out.println("Test3 Output: " + maximalRectangle(matrix3));
    }
}
