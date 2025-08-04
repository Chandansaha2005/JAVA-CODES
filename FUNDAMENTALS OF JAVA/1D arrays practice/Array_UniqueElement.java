import java.util.Scanner;

public class Array_UniqueElement {
    static Scanner sc = new Scanner(System.in);

    static int uniqueElement(int arr[]) {
        int f = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[i] != arr[j]) {
                    f = arr[i];
                } else
                    f = 0;
            }
        }
        return f;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void input(int arr[]) {
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of elements = ");
        int arr[] = new int[sc.nextInt()];
        input(arr);
        System.out.print(uniqueElement(arr));
    }
}
