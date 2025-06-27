import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String as[]) {
        try {
            int a, b, c;
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter the 1st No. = ");
            a = ob.nextInt();
            System.out.print("Enter the 2nd No. = ");
            b = ob.nextInt();
            c = a / b;
            ob.close();
            System.out.print("Division = " + c);
        } catch (InputMismatchException e) {
            System.out.println("\nInput Mismatch Exception !!");
        } catch (Exception e) {
            System.out.print("Arithmetic division problem / by 0 can't be possible \n" + e);
        }

    }
}
