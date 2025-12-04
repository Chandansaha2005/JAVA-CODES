import java.util.List;

public class setMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length;) {
            int idx = nums[i] - 1;
            if (nums[i] == nums[idx] || nums[i] == i + 1)
                i++;
            else {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                res[0] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1)
                res[1] = i+1;
        }
        return res;
    }
//2 3 3 4 5 6
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 4, 6, 5 };
        int[] arr = findErrorNums(nums);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
