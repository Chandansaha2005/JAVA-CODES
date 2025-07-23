import java.util.*;
public class Array_SubArraySum {
    static int sum(int arr[]) {
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }

    static int subArraySum(int[] arr) {
        int s = 0,len=0;
        for (int i = 2; i < arr.length; i++) {
            len+=i;
        }
        int sum[]=new int[len];
        
        // for (int i = 2, k = 0; i < arr.length; i++) {
        //     for (int j = k; j < i; j++) {

        //     }
        // }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3 };
        System.out.print("Sum of Elements = " + subArraySum(arr));
    }
}
