import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int c = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Eter the number = ");
        int num = sc.nextInt();
        for (; num > 0; num /= 10) {
            c = num % 10;
            sum += c;
        }
        System.out.println("Sum of all digit it this number = " + sum);
    }
}
