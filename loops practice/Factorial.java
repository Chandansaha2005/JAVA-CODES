import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (; num > 0; num--) {
            f *= num;
        }
        System.out.print("Factorial of = " + f);
        sc.close();
    }
}
