public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 5;
        // && AND operator
        System.out.println((a < b) && (b > c));// true
        System.out.println((a < b) && (b == c));// false
        // || OR operator
        System.out.println((a < b) || (b == c));// true
        System.out.println((a > b) || (b == c));// false
        // ! NOT operator
        System.out.println(!(a < b));// false
        System.out.println(!(a > b));// true
    }
}
