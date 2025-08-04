import java.util.Scanner;

public class AtoThePowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        int n = num;
        System.out.print("Enter the Power = ");
        int power = sc.nextInt();
        int p = power;
        for (; power > 1; power--) {
            num *= num;
        }
        System.out.println(n + " to the power " + p + " = " + num);
        sc.close();
    }
}
