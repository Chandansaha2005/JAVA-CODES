import java.util.Scanner;

public class AddofTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no. = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second no. = ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + (num1 + num2));

    }
}