import java.util.Scanner;

public class Array_PalindromeCheck {
    static Scanner sc = new Scanner(System.in);

    static void palindrome(int arr[]) {
        boolean f = true;
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                f = false;
            }
        }
        if (f == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
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
        palindrome(arr);
    }

}
