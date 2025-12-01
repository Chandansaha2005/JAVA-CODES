import java.util.List;

public class setMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length;) {
            int idx = nums[i] - 1;
            if (nums[i] == nums[idx] || nums[i] == i + 1)
                i++;
            else {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 4, 4 };
        int[] nums = findDisappearedNumbers(nums);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
