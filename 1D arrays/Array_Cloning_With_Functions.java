import java.util.Arrays; // Import Arrays utility class for array operations
import java.util.Scanner; // Import Scanner class to take user input

public class Array_Cloning_With_Functions {

    // Method to print elements of an array
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print each element followed by a space
        }
    }

    // Method to compare and display two arrays side-by-side
    static void ComArray(int a1[], int a2[]) {
        System.out.print("\nOriginal Array = ");
        PrintArray(a1); // Display original array
        System.out.print("\nCopied Array = ");
        PrintArray(a2); // Display copied array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        int arr[] = new int[5]; // Declare original array
        int arr2[] = new int[5]; // Declare second array for cloning

        // Read 5 input values from the user
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = sc.nextInt(); // Store values in original array
        }

        // Clone arr using .clone() method (creates a shallow copy)
        arr2 = arr.clone();
        ComArray(arr, arr2); // Display both arrays

        // Modify the cloned array
        arr2[0] = 0;
        arr2[2] = 4;
        System.out.println("\n\nAfter changing 2nd Array values :- ");
        ComArray(arr, arr2); // Shows that original array remains unchanged

        // Modify the original array
        arr[3] = 9;
        arr[4] = 7;
        System.out.println("\n\nAfter changing 2nd Array values :- ");
        ComArray(arr, arr2); // Both arrays have independent values

        // Use Arrays.copyOf to create a new array copy
        int arr3[] = Arrays.copyOf(arr, arr.length);
        ComArray(arr, arr3); // Display original and new copied array

        // Modify copied array
        arr3[0] = 0;
        arr3[1] = 0;
        ComArray(arr, arr3); // Original remains unchanged

        // Use Arrays.copyOfRange to copy a range (from index 1 to 3, exclusive of index 4)
        int arr4[] = Arrays.copyOfRange(arr, 1, 4);
        ComArray(arr, arr4); // Display original and sliced copy

        // Modify the range-copied array
        arr4[0] = 0;
        arr4[1] = 0;
        ComArray(arr, arr4); // Demonstrate independence of arr4

        sc.close(); // Close scanner
    }
}
