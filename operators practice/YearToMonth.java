import java.util.Scanner;

public class YearToMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year = ");
        int Year = sc.nextInt();
        System.out.println("Month =" + (Year * 12));
    }
}
