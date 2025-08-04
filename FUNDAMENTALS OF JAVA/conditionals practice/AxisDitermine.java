import java.util.Scanner;

public class AxisDitermine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point coordinates:--");
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("The point is in the Origin");
        } else if (y == 0) {
            System.out.println("The point is on x Axis");
        } else if (x == 0) {
            System.out.println("The point is on y Axis");
        } else {
            System.out.println("The point is not on x axis or y axis or origin");
        }
    }
}
