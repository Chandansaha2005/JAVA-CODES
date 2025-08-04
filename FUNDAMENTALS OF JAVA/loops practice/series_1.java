import java.util.Scanner;

public class series_1 {
    public static void main(String[] args) {
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                s += i;
                System.err.print(" + " + i);
            } else {
                s -= i;
                System.out.print(" - " + i);
            }
        }
        System.out.print(" = " + s);
        sc.close();
    }
}