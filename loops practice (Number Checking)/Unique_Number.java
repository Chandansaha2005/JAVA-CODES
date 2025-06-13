
// Unique Number
// Definition: No digit repeats.
// Example: 1234 → All digits different → Unique
import java.util.Scanner;

public class Unique_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt(), rem = 0, c = 0, digit = 0;
        for (int i = num; i > 0; i /= 10) {
            rem = i % 10;
            for (int j = num; j > 0; j /= 10) {
                if ((j % 10) == rem) {
                    c++;
                }
            }
            digit++;
        }
        if (digit == c) {
            System.out.print("It's a Unique Number ");
        } else {
            System.out.print("It's Not a Unique Number ");
        }
    }
}
