import java.util.Scanner;

public class Array_Greater_Element {

    static void printArray(int a[]) {
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void checkDublicate(int a[], int x) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x) {
                c++;
                System.out.println(a[i] + " At Index " + i + " is Greater Than " + x);
            }
        }
        if (c != 0) {
            System.out.print("Number of Element Greater than " + x + " is " + c);
        } else
            System.out.print(x + " is Greater Than All Element of This Array");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("\nEnter the elements U12 Search = ");
        int x = sc.nextInt();
        checkDublicate(arr, x);
        sc.close();
    }
}
