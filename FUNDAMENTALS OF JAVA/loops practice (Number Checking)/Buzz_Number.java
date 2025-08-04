
//Buzz Number
// Definition: Ends with 7 or divisible by 7
// Example: 7 → ends with 7 , 49 → divisible by 7
import java.util.Scanner;

public class Buzz_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a Buzz Number");
        } else {
            System.out.println(num + " is Not a Buzz Number");
        }
        sc.close();
    }
}
