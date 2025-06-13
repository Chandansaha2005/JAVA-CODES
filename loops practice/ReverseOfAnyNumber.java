import java.util.Scanner;

public class ReverseOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem = 0, rev = 0;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (; num > 0; num /= 10) {
            rem = num % 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
