import java.util.Scanner;

public class Array_Manipulation {
    static void manipulation(int a[]) {
        int unique = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                unique = a[i];
                System.out.println("Unique number = " + unique);
            }
        }

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
        manipulation(arr);
        sc.close();
    }
}
