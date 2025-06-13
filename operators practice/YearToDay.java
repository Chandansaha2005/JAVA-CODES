import java.util.Scanner;
public class YearToDay {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Year = ");
       int Year = sc.nextInt();
       System.out.println("Day = "+(Year*365));
    }
}
