import java.util.LinkedList;
import java.util.Queue;

public class SubarrayMinimumChecker {

    public static int countValidSubarrays(int[] arr) {
        int n = arr.length;
        Queue<Integer> q1 = new LinkedList<>();
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 1 };
        System.out.println(countValidSubarrays(arr1)); // Expected 5

        int[] arr2 = { 1, 3, 5, 2 };
        System.out.println(countValidSubarrays(arr2)); // Expected 8

        int[] arr3 = { 7 };
        System.out.println(countValidSubarrays(arr3)); // Expected 1

        int[] arr4 = { 1, 2, 3, 4 };
        System.out.println(countValidSubarrays(arr4)); // Expected ?

        int[] arr5 = { 2, 2, 2 };
        System.out.println(countValidSubarrays(arr5)); // Expected ?
    }
}
