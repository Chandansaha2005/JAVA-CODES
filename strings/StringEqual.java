public class StringEqual {
    public static void main(String[] args) {
        String s1 = "India";
        String s2 = "India";
        String s3 = new String("India");
        System.out.println(s1 == s2);// true
        System.out.println(s1 == s3);// false
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// true

    }
}
