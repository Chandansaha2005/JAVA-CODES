import java.util.Scanner;

public class Sphere_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        float r = sc.nextFloat();
        System.out.println("Area = " + (4 * 3.14 * r * r));
        System.out.println("Volume = " + ((4.0 / 3) * 3.14 * (r * r * r)));
    }
}
