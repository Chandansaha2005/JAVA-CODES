// Disarium Number
// Definition: Sum of digits powered with their positions = number.
// Example: 135 → 1¹ + 3² + 5³ = 135 → Disarium

import java.util.Scanner;

public class Disarium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, sum = 0;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i /= 10) {
            c++;
        }
        for (int j = num; j > 0; j /= 10) {
            sum += Math.pow(j % 10, c);
            System.out.print(" + " + (j % 10) + "^" + c);
            c--;
        }
        System.out.println(" = " + sum);
        if (sum == num) {
            System.out.println(sum + "=" + num + " It's a Disarium number");
        } else {
            System.out.println(sum + "!=" + num + " It's not a Disarium number");
        }
        sc.close();
    }
}
