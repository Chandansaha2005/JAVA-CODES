import java.util.Scanner;

public class Array_Reference {
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("Enter 5 values = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int arr2[] = arr;
        System.out.print("\nOrignal Array = ");
        PrintArray(arr);
        System.out.print("\nCopied Array = ");
        PrintArray(arr2);
        
        arr2[0]=0;
        arr2[2]=4;
        System.out.println("After changing 2nd array values");
        System.out.print("\nOrignal Array = ");
        PrintArray(arr);
        System.out.print("\nCopied Array = ");
        PrintArray(arr2);
    }
}
