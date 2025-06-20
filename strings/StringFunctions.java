public class StringFunctions {
    public static void main(String[] args) {
        String str = "india";
        System.out.println(str.length());// 5
        System.out.println(str.charAt(4));// a
        System.out.println(str.indexOf('i'));// 0(AS it gives the 1st index whare it found )
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.compareTo(str2)); // 0
        str1 = "cbc";
        str2 = "abc";
        System.out.println(str1.compareTo(str2)); // 1
        str1 = "abc";
        str2 = "abz";
        System.out.println(str1.compareTo(str2)); // -23
    }
}
