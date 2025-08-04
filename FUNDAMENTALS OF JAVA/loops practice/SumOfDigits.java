import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0, sum = 0;
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        for (; num > 0; num /= 10) {
            c = num % 10;
            sum += c;
        }
        System.out.println("Sum of all digits in this number = " + sum); 
        sc.close(); 
    }
}
