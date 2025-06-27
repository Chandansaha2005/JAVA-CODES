import java.util.Scanner;

public class TryCatch2 {
    public static void main(String as[]) {
        try {
            int a, b, c;
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter the 1st No. = ");
            a = ob.nextInt();
            System.out.print("Enter the 2nd No. = ");
            b = ob.nextInt();
            c = a / b;
            System.out.print("Division = " + c);
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic division problem / by 0 can't be possible \n" + e);
        } catch (Exception e) {
            System.out.print("Problem Occurs!!! \n" + e);
        }
    }

}
