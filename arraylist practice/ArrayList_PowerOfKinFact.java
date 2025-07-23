public class ArrayList_PowerOfKinFact {
    static int fact(int n) {
        if (n < 2)
            return 1;
        return n * fact(n - 1);
    }

    static int maxPower(int k, int n) {
        n = fact(n);
        int p = 0;
        while (n % k == 0) {
            p++;
            n /= k;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
