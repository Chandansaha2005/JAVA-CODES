import java.util.Scanner;

public class Array_Dublicate_Element {
    static void printArray(int a[]) {
        System.out.print("Array = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void checkDublicate(int a[], int x) {
        int c = 0, l = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                c++;
                System.out.println(x + " Present At Index " + i);
                l = i;
            }
        }
        if (c != 0) {
            System.out.println(x + " Last Occurence found At Index " + l);
            System.out.print(x + " Present " + c + " Times");
        } else
            System.out.print(x + " is Not Present in This Array");
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
