public class fibonacciseries {
    static int fibo(int n) {
        if (n == 1 || n == 0)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    static void fibosiri(int n) {
        if (n == 0)
            return;
        fibosiri(n - 1);
        System.out.print(fibo(n) + " ");
    }

    public static void main(String[] args) {
        fibosiri(10);
    }
}
