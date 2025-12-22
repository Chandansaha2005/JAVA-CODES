import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
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
        int[][] tests = {
                { 2, 1, 5, 6, 2, 3 },
                { 2, 4 },
                { 6, 2, 5, 4, 5, 1, 6 }
        };

        for (int[] test : tests) {
            int result = largestRectangleArea(test);
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + result);
        }
    }
}
