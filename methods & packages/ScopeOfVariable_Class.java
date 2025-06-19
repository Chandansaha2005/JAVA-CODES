public class ScopeOfVariable_Class {
    // Class-level variables (instance variables) accessible throughout the class
    int a = 10;
    // int a==11; // Invalid: Cannot declare another variable with the same name 'a' in the same scope
    int b = 5;

    // Method to perform addition using class-level variables
    int add() {
        return a + b; // Class-level variables 'a' and 'b' used here
    }

    // Method to perform subtraction using class-level variables
    int sub() {
        return a - b; // Again, accessing the same variables within a different method
    }

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Creating an object to access non-static methods
        ScopeOfVariable_Class obj = new ScopeOfVariable_Class();
        
        // Calling methods and printing results
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
    }
}
