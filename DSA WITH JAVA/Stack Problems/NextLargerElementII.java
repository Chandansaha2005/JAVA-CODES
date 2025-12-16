import java.util.Arrays;
import java.util.Stack;

public class NextLargerElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int max = findMax(nums);
        int[] arr = new int[nums.length];
        arr[n - 1] = (nums[n - 1] == max) ? -1 : max;
        Stack<Integer> st = new Stack<>();
        st.push(max);

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < st.peek()) {
                arr[i] = st.peek();
                st.push(nums[i]);
            } else if (nums[i] > st.peek()) {
                while (st.peek() > nums[i])
                    st.pop();
                arr[i] = st.peek();
                st.push(nums[i]);
            } else
                arr[i] = -1;
        }
        return arr;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];
        return max;
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
