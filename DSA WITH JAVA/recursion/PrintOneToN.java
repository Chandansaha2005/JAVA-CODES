public class PrintOneToN {
    static void pi(int n) {
        if (n == 0)
            return;
        pi(n-1);
        System.err.print(n + " ");
    }

    public static void main(String[] args) {
        pi(5);
    }
}