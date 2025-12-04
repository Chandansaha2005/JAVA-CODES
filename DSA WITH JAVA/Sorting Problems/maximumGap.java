import java.util.Arrays;

public class maximumGap {
    static int maxGap(int[] nums) {
        int n = nums.length, max = 0;
        if (n == 1)
            return 0;
        else {
            Arrays.sort(nums);
            for (int i = 0; i < n - 1; i++) {
                max = Math.max(max, (nums[i + 1] - nums[i]));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 9 };
        int ans = maxGap(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("Maximum Gap = " + ans);
    }
}
