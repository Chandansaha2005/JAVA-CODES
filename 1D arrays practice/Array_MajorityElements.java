import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_MajorityElements {
    public static List<Integer> majorityElements(int[] nums) {
        int c1 = 0, c2 = 0, candi1 = 0, candi2 = 1;

        for (int num : nums) {
            if (num == candi1)
                c1++;
            else if (num == candi2)
                c2++;
            else if (c1 == 0) {
                candi1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                candi2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = c2 = 0;
        for (int num : nums) {
            if (num == candi1)
                c1++;
            else if (num == candi2)
                c2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (c1 > n / 3)
            result.add(candi1);
        if (c2 > n / 3)
            result.add(candi2);
        if (result.size() == 2) {
                if (result.get(0) > result.get(1)) {
                    java.util.Collections.swap(result, 0, 1);
                    break;
                }
            }
        return result;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int arr[] = new int[sc.nextInt()];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        ArrayList<Integer> res = (ArrayList<Integer>) majorityElements(arr);
        for (int i : res) {
            System.err.print(i + " ");
        }
        sc.close();
    }
}z