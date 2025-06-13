import java.util.Scanner;

public class MonthToDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Month = ");
        int Month = sc.nextInt();
        System.out.println("Day = " + ((Month * 30) + (Month / 2) - 1));
    }
}
