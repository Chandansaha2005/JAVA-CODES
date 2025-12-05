import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class bucketSorting {

    static void bucketSort(float arr[]) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();
        for (int i = 0; i < n; i++)
            buckets[(int) (arr[i] * n)].add(arr[i]);
        for (int i = 0; i < n; i++)
            Collections.sort(buckets[i]);
        int j = 0;
        for (int i = 0; i < n; i++)
            for (int k = 0; k < buckets[i].size(); k++)
                arr[j++] = buckets[i].get(k);
    }

    static void printArray(float arr[]) {
        for (float num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        float arr[] = new float[n];
        System.out.print("Enter elements (between 0 and 1) = ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextFloat();
        System.out.print("Before Sorting : ");
        printArray(arr);
        bucketSort(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
        sc.close();
    }
}
