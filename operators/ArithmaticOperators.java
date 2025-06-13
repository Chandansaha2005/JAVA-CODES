import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----ARITHMATIC OPERATORS-----");
        System.out.print("Enter the 1st no. = ");
        Float num1 = sc.nextFloat();
        System.out.print("Enter the 2nd no. = ");
        Float num2 = sc.nextFloat();
        System.out.println("ADDITION OPERATOR '+' " + (num1 + num2));
        System.out.println("SUBTRACTION OPERATOR '-' " + (num1 - num2));
        System.out.println("MULTIPLICATION OPERATOR '*' " + (num1 * num2));
        System.out.println("DIVITION OPERATOR '/' " + (num1 / num2));
        System.out.println("MODULUS OPERATOR '%' " + (num1 % num2));
        System.out.println("INCREMENT OPERATOR '++' OF " + num1 + " is " + (++num1));
        System.out.println("DECREMENT OPERATOR '--' OF " + num2 + " is " + (++num2));
    }
}
