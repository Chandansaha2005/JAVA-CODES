import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int max = findMax(nums);
        int[] arr = new int[nums.length];
        Stack<Integer> st = new Stack<>();

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
        NextGreaterElementII sol = new NextGreaterElementII();

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
