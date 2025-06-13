import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- DIGIT CHECK -----");
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            System.out.println("It's a three digit number");
        } else if (num >= 10 && num <= 99) {
            System.out.println("It's a two digit number");
        } else {
            System.out.println("It's not a two or three digit number ");
        }
    }
}
