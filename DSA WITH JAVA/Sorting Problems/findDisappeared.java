import java.util.ArrayList;
import java.util.List;

public class findDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
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
                res.add(i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 4, 4 };
        List<Integer> ans = findDisappearedNumbers(nums);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}