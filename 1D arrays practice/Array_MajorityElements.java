import java.util.ArrayList;
import java.util.Scanner;

public class Array_MajorityElements {
    static ArrayList<Integer> majorityElements(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                }
            }
            if (c > (n / 3)) {
                if (result.size() == 0 || arr[i] != result.get(0)) {
                    result.add(arr[i]);
                }
            }
            if (result.size() == 2) {
                if (result.get(0) > result.get(1)) {
                    java.util.Collections.swap(result, 0, 1);
                    break;
                }
            }
            
        }return result;
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
        ArrayList<Integer> res = majorityElements(arr);
        for (int i : res) {
            System.err.print(i + " ");
        }
        sc.close();
    }
}