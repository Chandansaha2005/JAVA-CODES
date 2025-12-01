public class smallestMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length;) {
            if (nums[i] > n || nums[i] < 1 || nums[i] == i + 1 || nums[i] == nums[nums[i] - 1])
                i++;
            else {
                int idx = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1 };
        System.out.print(firstMissingPositive(nums));
        System.out.println();
    }
}
