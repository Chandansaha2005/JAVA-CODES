public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        // str = str +"World";// this will not work here
        str.append(" World");
        // str.charAt(0)='M';// this didn't work in string
        str.setCharAt(0, 'M');
        System.out.println(str);
    }
}
