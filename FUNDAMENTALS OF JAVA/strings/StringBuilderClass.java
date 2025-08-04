public class StringBuilderClass {
    public static void main(String[] args) {
        // Create a StringBuilder object with initial value "Hello"
        StringBuilder str = new StringBuilder("Hello");

        // Concatenation using '+' doesn't work directly with StringBuilder
        // str = str + "World"; // This will not compile

        // Append " World" to the existing StringBuilder content
        str.append(" World"); // str becomes "Hello World"

        // Cannot assign to characters in a regular String (immutable)
        // str.charAt(0) = 'M'; // This is not allowed with String

        // Change the character at index 0 to 'M'
        str.setCharAt(0, 'M'); // str becomes "Mello World"

        // Insert character 'o' at index 4
        str.insert(4, 'o'); // str becomes "Melloo World"

        // Delete the character at index 0 ('M')
        str.deleteCharAt(0); // str becomes "elloo World"

        // Delete characters from index 0 to 2 (exclusive of 2)
        str.delete(0, 2); // str becomes "loo World"

        // Reverse the content
        str.reverse(); // str becomes "dlroW ool"

        // Print final result
        System.out.println(str); // Output: dlroW ool
    }
}
