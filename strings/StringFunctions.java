public class StringFunctions {
    public static void main(String[] args) {
        String str = "india";

        // Prints the length of the string "india", which is 5
        System.out.println(str.length()); // 5

        // Prints the character at index 4 (0-based indexing), which is 'a'
        System.out.println(str.charAt(4)); // a

        // Prints the index of the first occurrence of character 'i'
        System.out.println(str.indexOf('i')); // 0

        String str1 = "abc";
        String str2 = "abc";

        // Compares str1 and str2 lexicographically, returns 0 because they are equal
        System.out.println(str1.compareTo(str2)); // 0

        str1 = "cbc";
        str2 = "abc";

        // Returns a positive value (1) because 'c' > 'a' in the first differing
        // character
        System.out.println(str1.compareTo(str2)); // 1

        str1 = "abc";
        str2 = "abz";

        // Returns a negative value (-23) because 'c' < 'z' in the first differing
        // character
        System.out.println(str1.compareTo(str2)); // -23

        // Checks if "india" contains the substring "in"
        System.out.println(str.contains("in")); // true

        // Checks if "india" contains the substring "an"
        System.out.println(str.contains("an")); // false

        // Checks if "india" starts with the substring "in"
        System.out.println(str.startsWith("in")); // true

        // Checks if "india" ends with the substring "ia"
        System.out.println(str.endsWith("ia")); // true

        str1 = "ABC";

        // Converts "india" to uppercase and prints it
        System.out.println(str.toUpperCase()); // INDIA

        // Converts "ABC" to lowercase and prints it
        System.out.println(str1.toLowerCase()); // abc

        str2 = "DEF";

        // Concatenates "ABC" and "DEF" and prints "ABCDEF"
        System.out.println(str1.concat(str2)); // ABCDEF

        // Prints the substring from index 0 to 4 (excluding index 4) => "indi"
        System.out.println(str.substring(0, 4)); // indi

        // Prints the substring from index 2 to the end => "dia"
        System.out.println(str.substring(2)); // dia
    }
}
