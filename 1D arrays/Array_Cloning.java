import java.util.Scanner;

public class Array_Cloning {
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int index = 0; index < arr.length; index++) {
            arr2[index] = arr[index];
        }
        sc.close();
        arr2 = arr.clone();
        System.out.print("\nOrignal Array = ");
        PrintArray(arr);
        System.out.print("\nCopied Array = ");
        PrintArray(arr2);

        arr2[0] = 0;
        arr2[2] = 4;
        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOrignal Array = ");
        PrintArray(arr);
        System.out.print("\nCopied Array = ");
        PrintArray(arr2);

        arr[3] = 9;
        arr[4] = 7;
        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOrignal Array = ");
        PrintArray(arr);
        System.out.print("\nCopied Array = ");
        PrintArray(arr2);

    }
}
