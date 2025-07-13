import java.util.Scanner;

public class Array_UniqueElement {
    static Scanner sc = new Scanner(System.in);

    static int uniqueElement(int arr[]) {
        int f = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    f = 0;
                } else
                    f = arr[i];
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
