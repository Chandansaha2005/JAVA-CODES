
// Hardy-Ramanujan Number
// Definition: Can be expressed as sum of cubes of two numbers in two different ways.
// Example: 1729 → 1³ + 12³ = 9³ + 10³ → Hardy-Ramanujan
import java.util.Scanner;

public class Hardy_Ramanujan_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i <= (int) Math.cbrt(num); i++) {
            for (int j = i + 1; j <= (int) Math.cbrt(num); j++) {
                if ((int) Math.pow(i, 3) + (int) Math.pow(j, 3) == num) {
                    System.out.println(i + "^3 + " + j + "^3" + " = " + ((int) Math.pow(i, 3) + (int) Math.pow(j, 3)));
                    flag = true;
                }
            }
        }
        if (flag) {
            System.err.print(num + " is The Hardy-Ramanujan Number");
        } else {
            System.err.print(num + " is Not The Hardy-Ramanujan Number");
        }
        sc.close();
    }
}
