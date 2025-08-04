import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
        System.out.println(Recursion_fact(num));
        sc.close();
    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int Recursion_fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * Recursion_fact(n - 1);
    }
}
