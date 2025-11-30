public class findDublicate {
    static int find(int[] arr) {
        for (int i = 0; i < nums.length;) {
            int idx = nums[i];
            if (idx < nums.length && nums[i] != nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            } else
                i++;
        }
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1])
                return i;
        return 0;
    }

    public static void main(String[] args) {
        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums3));
    }
}
