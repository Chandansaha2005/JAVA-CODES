public class CallByValue {
    public static void sum(int a, int b) {// Function Declaretion
        a += 5; // these a b have the same value but not the same variable as actual parameters
        b *= 5;
        System.out.println("IN FUNCTION: a=" + a + ",b=" + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 25;
        System.out.println("BEFORE: a=" + a + ",b=" + b);
        sum(a, b);// Calling the function
        System.out.println("AFTER: a=" + a + ",b=" + b);
    }
}
