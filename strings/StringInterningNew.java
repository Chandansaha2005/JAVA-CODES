public class StringInterningNew {
    public static void main(String[] args) {
        String str = "Hello"; // "Hello" goes into the String pool
        String gtr = "Hello"; // Reuses the same pooled reference as str
        String str2 = new String("Hello"); // Creates a new String object in the heap
    }
}
