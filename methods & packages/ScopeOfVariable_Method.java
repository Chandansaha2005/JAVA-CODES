public class ScopeOfVariable_Method {
    // Class-level (instance) variables accessible to all methods in the class
    int a = 10;
    // int a==11; // Invalid: can't declare another variable with the same name 'a'
    // in the same scope
    int b = 5;

    // Method demonstrating method-level (local) variables
    int add() {
        int p = 5; // p and q are local to this method only
        int q = 4;
        return p + q; // Local variables are accessible within the method
    }

    // This method tries to use p and q, but they'll be out of scope here
    int sub() {
        // int result = p - q; // ❌ Error: p and q are not defined in this method
        return a - b; // ✅ Instead, use class-level variables if needed
    }

    public static void main(String[] args) {
        // Creating an object to call instance methods
        ScopeOfVariable_Method obj = new ScopeOfVariable_Method();

        // Calling add() and sub(), and printing the results
        System.out.println("Addition (using local variables): " + obj.add());
        System.out.println("Subtraction (using class-level variables): " + obj.sub());
    }
}
