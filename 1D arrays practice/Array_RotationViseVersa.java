import java.util.Scanner;

public class Array_RotationViseVersa {
    static void rotateArr(int arr[], int d) {
        int l = arr.length;
        if (d % l != 0)
            if (d > l + 1)
                d = d % 2;
        for (int j = 0; j < d; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                System.out.println(arr[i]);
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        }
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
        rotateArr(arr, k);
        printArray(arr);
        sc.close();
    }
}
