public class PowerOfTwo {
    static int powerTwo(int n) {
        if (n == 2)
            return 1;
        if (n == 1)
            return 0;
        return powerTwo(n / 2);
    }

    public static void main(String[] args) {
        int c = powerTwo(512);
        if (c == 1)
            System.out.print("It is a Power Of Two");
        else
            System.out.println("It is Not a Power Of Two");
    }
}
