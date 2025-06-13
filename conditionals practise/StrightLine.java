import java.util.Scanner;

public class StrightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates:-");
        System.out.print("(x1)= ");
        int x1 = sc.nextInt();
        System.out.print("(y1)= ");
        int y1 = sc.nextInt();
        System.out.print("(x2)= ");
        int x2 = sc.nextInt();
        System.out.print("(y2)= ");
        int y2 = sc.nextInt();
        System.out.print("(x3)= ");
        int x3 = sc.nextInt();
        System.out.print("(y3)= ");
        int y3 = sc.nextInt();

        if (((y2 - y1) / (x2 - x1)) == ((y3 - y2) / (x3 - x2))) {
            System.out.println("All points fall on same line");
        } else {
            System.out.println("All points not  fall on same line");
        }
    }
}
