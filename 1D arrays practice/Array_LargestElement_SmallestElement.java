import java.util.*;

public class Array_LargestElement_SmallestElement {
    static void printArray(int a[]) {
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void arrengedArray(int a[]) {
        int min = a[0], max = a[0];
        for (int index = 1; index < a.length; index++) {
            if (a[index] < min) {
                min = a[index];
            }
            if (a[index] > max) {
                max = a[index];
            }
        }
        int b[] = { min, max };
        System.out.print("\nSmallest and Greatest element ");
        printArray(b);
    }

    static void kthArrengedArray(int a[], int k) {
        int min, max;
        Arrays.sort(a);
        min = a[0 + (k - 1)];
        max = a[(a.length - 1) - k + 1];
        int b[] = { min, max };
        System.out.print("\nKth Smallest and Greatest element ");
        printArray(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        arrengedArray(arr);
        System.out.print("\nEnter kth value = ");
        int k = sc.nextInt();
        kthArrengedArray(arr, k);
        sc.close();
    }
}