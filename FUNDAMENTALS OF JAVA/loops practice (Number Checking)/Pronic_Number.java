
// Pronic Number
// Definition: Product of two consecutive numbers.
// Example: 6 = 2×3 → Pronic
import java.util.Scanner;

public class Pronic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        boolean pronic = false;
        for (int i = 1; i <= num; i++) {
            if (i * (i + 1) == num) {
                pronic = true;
            }
        }
        if (pronic) {
            System.out.println(num + " is a Pronic Number ");
        } else {
            System.out.println(num + " is Not a Pronic Number ");
        }
        sc.close();
    }
}
