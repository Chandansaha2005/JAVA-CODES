import java.util.Scanner;

public class Combination {
    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static int Com(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n = ");
        int num = sc.nextInt();
        System.out.print("Enter the r = ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("Combination = " + Com(num, r));
    }
}
