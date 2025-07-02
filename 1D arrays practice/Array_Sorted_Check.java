import java.util.Scanner;

public class Array_Sorted_Check {
    static void printArray(int a[]) {
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void checkSortedArray(int a[]) {
        boolean flag = true;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array Is Sorted");
        } else {
            System.out.println("Array Is Not Sorted");

        }
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
        checkSortedArray(arr);
        sc.close();
    }
}
