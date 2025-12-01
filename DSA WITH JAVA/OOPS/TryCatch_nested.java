import java.util.Scanner;

public class TryCatch_nested {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        try {
            int a, b, c, i, n;
            System.out.print("Enter the 1st No. = ");
            a = ob.nextInt();
            System.out.print("Enter the 2nd No. = ");
            b = ob.nextInt();
            c = a / b;
            System.out.println("Division = " + c);
            try {
                System.out.println("Enter the Range = ");
                n = ob.nextInt();
                int arr[] = new int[n];
                for (i = 0; i < n; i++) {
                    System.out.println("Enter the No. = ");
                    arr[i] = ob.nextInt();
                }
                for (i = 0; i < n; i++)
                    System.out.print(" " + arr[i]);
                System.out.println();
                arr[i] = 75;
                System.out.println(" " + arr[i]);
            } catch (ArithmeticException e) {
                System.out.println("division by 0 can't be possible");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of range");
        } catch (Exception e) {
            System.out.println("problem Occurs!!!");
        }
        ob.close();
    }

}
