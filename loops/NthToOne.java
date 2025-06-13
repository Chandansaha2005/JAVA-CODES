import java.util.Scanner;

public class NthToOne {
    public static void main(String[] args) {
        int i = 1, K = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range = ");
        int n = sc.nextInt();
        int a = n;
        int b = n;
        while (i <= a) {
            System.err.print(a + " ");
            a--;
        }
        System.out.println("");
        for (int j = 1; j <= b; b--) {
            System.err.print(b + " ");
        }
        System.out.println("");
        do {
            System.err.print(n + " ");
            n--;
        } while (K <= n);
    }

}