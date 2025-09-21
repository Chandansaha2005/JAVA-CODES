import java.util.Scanner; // Import Scanner class for user input

public class bubbleSort {

    // Method to print the elements of the array
    static void printArray(int[] arr, int n) {
        System.out.println("\nArray:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element separated by space
        }
    }

    // Method to perform Bubble Sort on the array
    static void bubble(int[] arr) {
        // Outer loop for each pass through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];       // Temporary variable to hold value
                    arr[j] = arr[j + 1];     // Swap current with next
                    arr[j + 1] = temp;       // Complete the swap
                }
            }
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Prompt user for number of elements
        System.out.print("Enter the no. of elements = ");
        int n = sc.nextInt(); // Read number of elements

        int[] arr = new int[n]; // Declare array of size n

        // Prompt user to enter the elements
        System.err.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read each element into the array
        }

        printArray(arr, n); // Print original array
        bubble(arr);        // Sort the array using Bubble Sort
        printArray(arr, n); // Print sorted array

        sc.close(); // Close the Scanner to free resources
    }
}
