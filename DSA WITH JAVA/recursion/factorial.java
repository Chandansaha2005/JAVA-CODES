public class factorial {
    static int fact(int f) {
        if (f < 2)
            return 1;
        return f * fact(f - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(0));
    }
}
