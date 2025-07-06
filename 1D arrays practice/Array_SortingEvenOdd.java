import java.util.Scanner;

public class Array_SortingEvenOdd {
    static int[] sortEvenOdd(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 == 1 && a[j] % 2 == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if (a[i] % 2 == 0) {
                i++;
            }
            if (a[j] % 2 == 1) {
                j--;
            }

        }
        return a;
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements (0 or 1)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        printArray(sortEvenOdd(arr));
        sc.close();
    }
}
