public class PrintOneToN {
    static void pi(int n) {
        if (n == 0)// Base Case
            return;
        pi(n - 1);// Assumption
        System.err.print(n + " ");// SelfWork
    }

    public static void main(String[] args) {
        pi(5);
    }
}