public class ScopeOfVariable_Block {
    void block() {
        int a = 10; // Method-level variable 'a'
        System.out.println(a); // Accessible anywhere within the method

        // System.out.println(b); // Error: 'b' is declared later inside a block and
        // is not visible here

        { // First block with its own scope
            int b = 12; // Block-level variable 'b'
            System.out.println(b); // Accessible here inside the block
        }

        { // Second block with a separate scope
            int b = 13; // Same name allowed because it's a different block
            System.out.println(b); // Accessible inside this block
        }

        // System.out.println(b); // Error: 'b' is not accessible outside its block
    }

    public static void main(String[] args) {
        ScopeOfVariable_Block obj = new ScopeOfVariable_Block();
        obj.block(); // Invoke method to demonstrate scope behavior
    }
}
