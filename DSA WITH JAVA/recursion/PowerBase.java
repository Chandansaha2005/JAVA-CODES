public class PowerBase {
    static int power(int p, int q) {
        if (q == 0)
            return 1;
        return p * power(p, q - 1);
    }

    public static void main(String[] args) {
        System.out.println("Answer = " + power(2, 2));
    }
}
