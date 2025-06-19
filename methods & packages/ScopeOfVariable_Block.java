public class ScopeOfVariable_Block {
    void block() {
        int a = 10; // Method-level variable 'a', accessible throughout the entire 'block' method
        System.out.println(a); // Can use 'a' here

        // System.out.println(b); // Error: 'b' is declared later inside a block, not
        // visible here

        { // First inner block
            int b = 12; // Block-level variable 'b', accessible only within this block
            System.out.println(b); // Can access 'b' here
        }

        { // Second inner block
            int b = 13; // A new 'b' is allowed here since it's a different block with its own scope
            System.out.println(b); // Can access this 'b' here
        }

        for (int i = 0; i < 10; i++) { // Loop block // here the "i" is also a block level scope
            int b = 10; // Block-level variable 'b' within the for-loop block
            System.out.println(b); // Can access 'b' here during each iteration
        }
        // System.out.println(i);// Error: we can't access the i here

        if (true) { // If-block
            int b = 45; // Block-level variable 'b' specific to this conditional block
            System.out.println(b); // Can access 'b' inside the if block
        }

        // System.out.println(b); // Error: No 'b' in this method-level scope; all b's
        // are block-scoped
    }

    public static void main(String[] args) {
        ScopeOfVariable_Block obj = new ScopeOfVariable_Block();
        obj.block(); // Invoke method to demonstrate how variable scope works in blocks
    }
}
