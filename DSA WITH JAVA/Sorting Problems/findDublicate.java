public class findDublicate {
    static int find(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int idx = nums[i];
            if(nums[i] == nums[idx])return nums[i];
            if (idx < nums.length && nums[i] != nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            } else
                i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums3 = { 1, 3, 4, 2, 2 };
        System.out.println(find(nums3));
    }
}
