import java.util.Arrays;

public class LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        // placeholder
        return 0;
    }

    public static void main(String[] args) {
        int[][] tests = {
            {2, 1, 5, 6, 2, 3},
            {2, 4},
            {6, 2, 5, 4, 5, 1, 6}
        };

        for (int[] test : tests) {
            int result = largestRectangleArea(test);
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + result);
        }
    }
}
