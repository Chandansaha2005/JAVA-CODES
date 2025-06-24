public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world");
        // str = str +"world";// this will not work here
        str.append("World");
    }
}
