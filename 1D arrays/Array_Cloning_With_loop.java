import java.util.Scanner; // Import Scanner class for taking user input

public class Array_Cloning_With_loop {

    // Method to print elements of an array
    static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print each element followed by a space
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        int arr[] = new int[5]; // Declare first array of size 5
        int arr2[] = new int[5]; // Declare second array of size 5 for manual cloning

        // Input 5 elements into the original array
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = sc.nextInt(); // Store input in arr
        }

        // Clone arr into arr2 using a loop (element-by-element copy)
        for (int index = 0; index < arr.length; index++) {
            arr2[index] = arr[index]; // Copy each element individually
        }

        sc.close(); // Close the scanner

        // Print original and copied arrays
        System.out.print("\nOriginal Array = ");
        PrintArray(arr);

        System.out.print("\nCopied Array = ");
        PrintArray(arr2);

        // Modify copied array values (these changes do NOT affect the original array)
        arr2[0] = 0;
        arr2[2] = 4;

        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOriginal Array = ");
        PrintArray(arr); // Original remains unchanged

        System.out.print("\nCopied Array = ");
        PrintArray(arr2); // Reflects new changes

        // Modify original array values
        arr[3] = 9;
        arr[4] = 7;

        System.out.println("\nAfter changing 2nd Array values :- ");
        System.out.print("\nOriginal Array = ");
        PrintArray(arr); // Reflects latest changes

        System.out.print("\nCopied Array = ");
        PrintArray(arr2); // Unaffected by changes to original array
    }
}
