import java.util.Scanner;

public class Array_LastElement_FirstElement {
    static void printArray(int a[]) {
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void arrengedArray(int a[]) {
        int min = a[0], temp = 0;
        for (int index = 1; index < a.length; index++) {
            if (a[index] < min) {
                temp = a[index];
                a[index] = min;
                a[index - 1] = temp;
            }
        }
        printArray(a);
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
            System.out.println("Array Is All Ready Sorted");
        } else {
            System.out.println("After Arranging Elements :-");
            arrengedArray(a);
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