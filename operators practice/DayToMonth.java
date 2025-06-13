import java.util.Scanner;

public class DayToMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day = ");
        int Day = sc.nextInt();
        System.out.println("Month = " + (Day / 30) + " and Day = " + (Day % 30));
    }
}
