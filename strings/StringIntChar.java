public class StringIntChar {
    public static void main(String[] args) {
        String str = "chandan";

        // Concatenates the string with an integer. The integer 1 is converted to a
        // string and appended.
        System.out.println(str + 1); // Output: chandan1

        // Concatenates the string with a character. 'S' is promoted to a string and
        // appended.
        System.out.println(str + 'S'); // Output: chandanS

        // Concatenates the string with another string literal.
        System.out.println(str + " Saha"); // Output: chandan Saha
    }
}
