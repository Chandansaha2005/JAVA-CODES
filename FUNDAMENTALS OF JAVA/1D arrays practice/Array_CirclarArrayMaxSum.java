public class Array_CirclarArrayMaxSum {
    static int circularSubArraySum(int[] arr) {
        int total = 0, tempMax = 0, tempMin = 0, maxSum = arr[0], minSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            tempMax = Math.max(tempMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, tempMax);

            tempMin = Math.min(tempMin + arr[i], arr[i]);
            minSum = Math.min(minSum, tempMin);

            total += arr[i];
        }
        int normSum = maxSum;
        int circulerSum = total - minSum;
        if (minSum == total)
            return normSum;
        return Math.max(normSum, circulerSum);
    }

    public static void main(String[] args) {
        int arr[] = { 10, -3, -4, 7, 6, 5, -4, -1 };
        System.out.println(circularSubArraySum(arr));
        ;
    }
}
