public class PrintNToOne {
    static void pi(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        pi(n - 1);
    }

    public static void main(String[] args) {
        pi(5);
    }
}
