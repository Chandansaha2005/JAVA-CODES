import java.util.Arrays;

public class NumberOfVisiblePeople {
    public static int[] canSeePersonsCount(int[] heights) {
        // placeholder
        return new int[heights.length];
    }

    public static void main(String[] args) {
        int[][] tests = {
            {10, 6, 8, 5, 11, 9},
            {5, 1, 2, 3, 10},
            {3, 2, 1},
            {1, 2, 3, 4}
        };

        for (int[] test : tests) {
            int[] result = canSeePersonsCount(test);
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Output: " + Arrays.toString(result));
        }
    }
}
