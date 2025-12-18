import java.util.Arrays;

public class NumberOfVisiblePeople {
    public static int[] canSeePersonsCount(int[] h) {
        int[] arr = new int[h.length];
        for (int i = 0; i < h.length - 1; i++) {
            int count = 1;
            int prev = 0;
            for (int j = i + 1; h[i] > h[j] && j < h.length - 1;) {
                prev = j;
                j++;
                if (h[prev] > h[j])
                    continue;
                count++;
                if (h[i] < h[j])
                    break;
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
