import java.util.Scanner;
public class DayToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days = ");
        int Day= sc.nextInt();
        System.out.println("year = "+(Day/365)+" month = "+((Day%365)/30)+" days = "+((Day%365)%30));
    }
}
