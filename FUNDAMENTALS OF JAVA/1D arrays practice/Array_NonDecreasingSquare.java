import java.util.Scanner;

public class Array_NonDecreasingSquare {
    static int[] squareArray(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] * a[i] > a[j] * a[j]) {
                int temp = a[i] * a[i];
                a[i] = a[j] * a[j];
                a[j] = temp;
                j--;
                i++;
            } else {
                a[i] = a[i] * a[i];
                a[j] = a[j] * a[j];
                i++;
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
        System.out.print("Enter the Elements in Sorted manner = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        printArray(squareArray(arr));
        sc.close();
    }
}
