public class Array_SubArraySum2 {
    static int subArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (i + 1) * (arr.length - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 3, 2 };
        System.out.println(subArraySum(arr));
    }
}
