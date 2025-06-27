import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String as[]) {
        try {
            // Begin try block: code that may throw exceptions is placed here
            int a, b, c;
            Scanner ob = new Scanner(System.in);

            System.out.print("Enter the 1st No. = ");
            a = ob.nextInt();  // May throw InputMismatchException if input is not an integer

            System.out.print("Enter the 2nd No. = ");
            b = ob.nextInt();  // Same risk as above

            c = a / b;         // May throw ArithmeticException if b is 0

            ob.close();        // Close Scanner to free up resources
            System.out.print("Division = " + c); // Output result if no exceptions are thrown

        } catch (InputMismatchException e) {
            // Catch block for invalid inputs (non-integer entries)
            System.out.println("\nInput Mismatch Exception !!");
        } catch (Exception e) {
            // Generic catch block for other exceptions like division by zero
            System.out.print("Arithmetic division problem / by 0 can't be possible \n" + e);
        }

        // ✳ NOTE: Every try block **must** be followed by at least one catch or a finally block.
        // You cannot have a standalone try without a handler.
    }
}
