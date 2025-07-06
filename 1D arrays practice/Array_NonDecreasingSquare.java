import java.util.Scanner;

public class Array_NonDecreasingSquare {
    static int[] squareArray(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                int temp = (int) Math.pow(a[i], 2);
                a[i] = (int) Math.pow(a[j], 2);
                a[j] = temp;
                i++;
                j--;
            } else {
                a[i] = (int) Math.pow(a[i], 2);
                a[j] = (int) Math.pow(a[i], 2);
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
