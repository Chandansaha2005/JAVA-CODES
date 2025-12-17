import java.util.Arrays;
import java.util.Stack;

public class NextLargerElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--)
            st.push(nums[i]);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i])
                st.pop();
            if (!st.isEmpty())
                arr[i] = st.peek();
            else
                arr[i] = -1;
            st.push(nums[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        NextLargerElementII sol = new NextLargerElementII();

        int[][] tests = {
                { 1, 2, 1 },
                { 1, 2, 3, 4, 3 },
                { 5, 4, 3, 2, 1 },
                { 2, 2, 2 }
        };

        for (int[] test : tests) {
            int[] result = sol.nextGreaterElements(test);
            System.out.print("Input: " + Arrays.toString(test));
            System.out.println(" -> Output: " + Arrays.toString(result));
        }
    }
}
