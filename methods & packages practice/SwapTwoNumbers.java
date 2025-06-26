import java.util.Scanner; // Importing Scanner class for user input

public class SwapTwoNumbers {

    // This method attempts to swap two numbers using arithmetic operations
    // However, the swapping won't affect the variables in main due to Java's
    // pass-by-value mechanism
    public static void Swap(int a, int b) {
        a = a + b; // Step 1: Add a and b, store the result in a
        b = a - b; // Step 2: Subtract new b from a to get the original a value
        a = a - b; // Step 3: Subtract new b from new a to get original b value
        // But these changes affect only the local copies of a and b
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt user for the first number
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt(); // Read the first integer

        // Prompt user for the second number
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt(); // Read the second integer

        sc.close(); // Close the Scanner object

        // Print values before swap
        System.out.println("Before Swap:-\na = " + a + " ,b = " + b);

        // Call the Swap method (won't work as expected due to pass-by-value)
        Swap(a, b);

        // Print values after swap — note: a and b are still the same
        System.out.println("After Swap:-\na = " + a + " ,b = " + b);
    }
}
