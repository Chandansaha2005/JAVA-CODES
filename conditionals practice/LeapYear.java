import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- LEAP YEAR CALCULATOR -----");
        System.out.print("Enter the Year = ");
        int year = sc.nextInt();
        if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.err.println("It's a leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else if (year % 400 == 0) {
            System.err.println("It's a leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
