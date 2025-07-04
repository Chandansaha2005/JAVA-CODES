import java.util.Scanner;

public class Array_Reverse {
    static int[] ReverseArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[a.length - (i + 1)];
            a[a.length - (i + 1)] = temp;
            if (i == a.length / 2)
                break;
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
        System.out.print("Enter the Element(s)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        ReverseArray(arr);
        System.out.print("After Reversing :-");
        printArray(arr);
        sc.close();
    }
}