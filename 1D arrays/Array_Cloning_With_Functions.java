import java.util.Arrays;
import java.util.Scanner;

public class Array_Cloning_With_Functions {
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void ComArray(int a1[], int a2[]) {
        System.out.print("\nOrignal Array = ");
        PrintArray(a1);
        System.out.print("\nCopied Array = ");
        PrintArray(a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr2 = arr.clone();
        ComArray(arr, arr2);
        arr2[0] = 0;
        arr2[2] = 4;
        System.out.println("\n\nAfter changing 2nd Array values :- ");
        ComArray(arr, arr2);

        arr[3] = 9;
        arr[4] = 7;
        System.out.println("\n\nAfter changing 2nd Array values :- ");
        ComArray(arr, arr2);

        int arr3[] = Arrays.copyOf(arr, arr.length);
        ComArray(arr, arr3);

        arr3[0] = 0;
        arr3[1] = 0;
        ComArray(arr, arr3);

        int arr4[] = Arrays.copyOfRange(arr, 1, 4);
        ComArray(arr, arr4);

        arr4[0] = 0;
        arr4[1] = 0;
        ComArray(arr, arr4);
        sc.close();
    }
}
