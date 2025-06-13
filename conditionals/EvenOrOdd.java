import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.err.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }
    }
}