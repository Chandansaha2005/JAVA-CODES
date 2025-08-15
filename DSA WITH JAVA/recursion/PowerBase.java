public class PowerBase {
    static int power(int p, int q) {
        if (q == 0)
            return 1;
        int smallpow = power(p, q - 1);
        if (q % 2 == 0)
            return smallpow * smallpow;// even
        return p * smallpow * smallpow;// odd
    }

    public static void main(String[] args) {
        System.out.println("Answer = " + power(2, 2));
    }
}
