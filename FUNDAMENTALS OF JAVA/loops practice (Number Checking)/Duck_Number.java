
// Duck Number
// Definition: A number that contains zero, but not at the beginning.
// Example: 102 → contains 0 → Duck Number
// (010 is not duck, starts with 0)
import java.util.Scanner;

public class Duck_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        String num = sc.next();
        boolean flag = true;
        if (num.charAt(0) == '0') {
            flag = false;
        } else {
            for (int i = 1; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(num + " is a duck number");
        } else {
            System.out.println(num + " is Not a duck number");
        }
        sc.close();
    }
}