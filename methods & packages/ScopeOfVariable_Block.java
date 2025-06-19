public class ScopeOfVariable_Block {
    void block() {
        int a = 10; // ✅ Method-level variable 'a'
        System.out.println(a); // Can use 'a' within the method

        // System.out.println(b); // ❌ Error: 'b' is declared later inside a block and
        // is not visible here

        { // Opening a new block—this is a block-level scope
            int b = 12; // ✅ Block-level variable 'b'
            System.out.println(b); // Allowed: 'b' is accessible inside this block
        }

        // System.out.println(b); // ❌ Error: 'b' is out of scope here
    }

    public static void main(String[] args) {
        ScopeOfVariable_Block obj = new ScopeOfVariable_Block();
        obj.block(); // Call the method to see variable scope in action
    }
}
