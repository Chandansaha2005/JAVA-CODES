import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bucketSorting {
    static void bucketSort(int arr[]) {
        int n = arr.length();
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int index = (int) (arr[i] * n);
            buckets[index].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(buckets[i]);
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            for (Float k = 0; k < buckets[i].size(); k++) {
                arr[j++] = buckets[i].get(k);
            }
        }
    }

    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting : ");
        printArray(arr);

        bucketSort(arr);

        System.out.print("After Sorting : ");
        printArray(arr);

        sc.close();
    }
}
