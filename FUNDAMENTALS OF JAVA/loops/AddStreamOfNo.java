import java.util.Scanner;

public class AddStreamOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for (;;) {
            System.out.print("Type 0 to EXIT \nEnter the Numbers to add = ");
            int n = sc.nextInt();
            if (n != 0) {
                s += n;
                System.err.println("Current Sum = " + s);
            } else {
                System.err.println("Total Sum = " + s);
                break;
            }
        }
    }
}
