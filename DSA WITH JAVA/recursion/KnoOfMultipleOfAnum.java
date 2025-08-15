public class KnoOfMultipleOfAnum {
    static void kMultiple(int n, int k) {
        if (k == 0)
            return;
        kMultiple(n, k - 1);
        System.out.print(n * k + " ");
    }

    public static void main(String[] args) {
        kMultiple(2, 5);
    }
}
