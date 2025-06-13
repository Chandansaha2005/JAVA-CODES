import java.util.Scanner;

public class circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- CIRCLE CALCULATION ----");
        System.out.print("Enter the radius = ");
        float r = sc.nextFloat();
        System.out.println("Area = " + (3.14 * (r * r)));
        System.out.println("Circumference = " + (2 * 3.14 * r));
    }
}
