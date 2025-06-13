import java.util.Scanner;

public class MonthToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month = ");
        int Month = sc.nextInt();
        System.out.println("Year = " + (Month / 12) + " and Month = " + (Month % 12));
    }
}
