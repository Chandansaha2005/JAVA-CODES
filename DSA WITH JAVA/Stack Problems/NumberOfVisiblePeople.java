import java.util.Arrays;
import java.util.Stack;

public class NumberOfVisiblePeople {
    public static int[] canSeePersonsCount(int[] h) {
        int n = h.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(h[n - 1]);
        for (int i = n - 2; i > 0; i--) {
            int count = 0;
            while (!st.isEmpty() && st.peek() < h[i]) {
                st.pop();
                count++;
            }
            if (h[i] < st.peek()) {
                st.push(h[i]);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] tests = {
                { 11, 19, 12, 15, 14, 18, 7, 1, 8, 9 },
                { 10, 6, 8, 5, 11, 9 },
                { 5, 1, 2, 3, 10 },
                { 3, 2, 1 },
                { 1, 2, 3, 4 }
        };

        for (int[] test : tests) {
            int[] result = canSeePersonsCount(test);
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + Arrays.toString(result));
        }
    }
}
