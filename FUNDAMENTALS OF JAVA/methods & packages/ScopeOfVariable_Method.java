public class ScopeOfVariable_Method {
    // Class-level (instance) variables accessible throughout all non-static methods
    int a = 10;
    // int a==11; // Invalid: Cannot declare another variable with the same name 'a'
    // in the same scope
    int b = 5;

    // Method demonstrating method-level (local) variables
    int add() {
        int p = 5; // p and q are local to this method
        int q = 4;
        return p + q; // These variables can't be used outside this method
    }

    // Another method with its own local variables named p and q
    int sub() {
        int p = 5;
        int q = 10; // Same variable names allowed in a different method
        int result = p - q;
        return result;
    }

    public static void main(String[] args) {
        // Create an object to call instance methods
        ScopeOfVariable_Method obj = new ScopeOfVariable_Method();

        // Call the methods and print their results
        System.out.println("Addition (using method-level variables): " + obj.add());
        System.out.println("Subtraction (also using method-level variables): " + obj.sub());
    }
}
