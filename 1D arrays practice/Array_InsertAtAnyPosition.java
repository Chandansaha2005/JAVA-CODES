import java.util.Scanner;

public class Array_InsertAtAnyPosition {
    static int[] insertAtFirst(int a[], int k, int p) {
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = k;
        return a;
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element = ");
        int n = sc.nextInt();
        int arr[] = new int[n], k, p;
        System.out.print("Enter the Element(s)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("\nEnter The Number You Want To Insert At First = ");
        k = sc.nextInt();
        System.out.print("\nEnter The Number of Position Whare You Want To Insert At First = ");
        p = sc.nextInt();
        printArray(insertAtFirst(arr, k, p));
    }
}
