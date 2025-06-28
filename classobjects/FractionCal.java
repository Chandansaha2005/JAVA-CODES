import java.util.Scanner;

public class FractionCal {
    static int a1, a2, b1, b2, ans_n, ans_d;

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Fraction :-\nNumerator = ");
        a1 = sc.nextInt();
        System.out.print("Denominator = ");
        b1 = sc.nextInt();
        System.out.print("\nEnter the 2nd Fraction :-\nNumerator = ");
        a2 = sc.nextInt();
        System.out.print("Denominator = ");
        b2 = sc.nextInt();
        sc.close();
        System.out.println("\nFractions: - \n" + a1 + "/" + b1 + " , " + a2 + "/" + b2);
    }

    static int LCM(int a, int b) {
        int res = 1, greater;
        if (a > b) {
            greater = a;
        } else {
            greater = b;
        }
        for (;;) {
            if (greater % a == 0 && greater % b == 0) {
                res = greater;
                break;
            }
            greater++;
        }
        return res;
    }

    static void Fraction_add(int a1, int b1, int a2, int b2) {
        ans_d = LCM(b1, b2);
        ans_n = (a1 * (ans_d / b1)) + (a2 * (ans_d / b2));
        System.out.println("Addition = " + ans_n + "/" + ans_d);
    }

    static void Fraction_sub(int a1, int b1, int a2, int b2) {
        ans_d = LCM(b1, b2);
        ans_n = (a1 * (ans_d / b1)) - (a2 * (ans_d / b2));
        System.out.println("Subtraction = " + ans_n + "/" + ans_d);
    }

    static void Fraction_mul(int a1, int b1, int a2, int b2) {
        ans_d = b1 * b2;
        ans_n = a1 * a2;
        double ans = (double) (ans_n / ans_d);
        System.out.println("Multiplecation = " + ans_n + "/" + ans_d + " = " + ans);
    }

    static void Fraction_div(int a1, int b1, int a2, int b2) {
        ans_d = b1 * a2;
        ans_n = a1 * b2;
        double ans = (double) (ans_n / ans_d);
        System.out.println("Multiplecation = " + ans_n + "/" + ans_d + " = " + ans);
    }

    public static void main(String[] args) {
        input();
        Fraction_add(a1, b1, a2, b2);
        Fraction_sub(a1, b1, a2, b2);
        // Fraction_mul(a1, b1, a2, b2);
        // Fraction_div(a1, b1, a2, b2);
    }
}
