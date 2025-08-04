import java.util.Scanner; // Import Scanner class to take input from user

public class Array_Reference {

    // Method to print elements of an array
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print each element separated by space
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        int arr[] = new int[5]; // Declare an array of size 5

        System.out.print("Enter 5 values = "); // Prompt user to enter values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Store input values into the array
        }
        sc.close(); // Close the scanner to free resources

        int arr2[] = arr; // Copy reference of arr to arr2, not the values (both point to same array)

        System.out.print("\nOriginal Array = ");
        PrintArray(arr); // Print original array

        System.out.print("\nCopied Array = ");
        PrintArray(arr2); // Print copied array (same as original at this point)

        // Modify the copied array (which also affects the original, since they share memory)
        arr2[0] = 0;
        arr2[2] = 4;

        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOriginal Array = ");
        PrintArray(arr); // Print original array after modifications (affected by arr2 changes)

        System.out.print("\nCopied Array = ");
        PrintArray(arr2); // Print copied array after modifications

        // Modify original array directly
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOriginal Array = ");
        PrintArray(arr); // Print original array again (shows all modifications)

        System.out.print("\nCopied Array = ");
        PrintArray(arr2); // Print copied array again (same as original)
    }
}
