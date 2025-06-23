public class StringEqual {
    public static void main(String[] args) {
        String s1 = "India"; // s1 refers to a String literal in the String pool
        String s2 = "India"; // s2 also refers to the same object in the pool as s1
        String s3 = new String("India"); // s3 refers to a new String object in the heap, not the pool

        // Compares references of s1 and s2 — both point to the same object in the
        // String pool
        System.out.println(s1 == s2); // true

        // Compares references of s1 and s3 — s3 is a different object in memory
        System.out.println(s1 == s3); // false

        // Compares values (content) of s1 and s2 — both have the same sequence of
        // characters
        System.out.println(s1.equals(s2)); // true

        // Compares values (content) of s1 and s3 — still true because equals checks
        // content, not references
        System.out.println(s1.equals(s3)); // true
    }
}
