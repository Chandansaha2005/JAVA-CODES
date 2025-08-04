import java.util.Scanner;

public class Array_Rotation {
    static int[] RotateArray(int a[], int k) {
        int l = a.length;
        if (k % l != 0) {
            if (k > l + 1)
                k = k % 2;
            for (int j = 0; j < k; j++) {
                int temp = a[l - 1];

                for (int i = l - 2; i >= 0; i--) {
                    a[i + 1] = a[i];
                }
                a[0] = temp;
            }
        }
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
        int arr[] = new int[n], k;
        System.out.print("Enter the Element(s)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("Enter The Number of Rotation you want = ");
        k = sc.nextInt();
        System.out.println("After " + k + " Rotation :-");
        // for (int i = 0; i < k; i++) {
        // printArray(RotateArray(arr));
        // }
        printArray(RotateArray(arr, k));
        sc.close();
    }
}
