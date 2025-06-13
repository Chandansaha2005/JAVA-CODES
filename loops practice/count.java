import java.util.Scanner;

public class count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        int n = num;
        for (; num > 0; num /= 10)
            c++;
        System.out.println("Total digit = " + c);
        c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        System.out.println("Total digit = " + c);
        sc.close();
    }
}