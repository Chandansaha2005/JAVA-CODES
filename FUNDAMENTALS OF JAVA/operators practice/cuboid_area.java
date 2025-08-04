import java.util.Scanner;

public class cuboid_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- CUBOID CALCULATION ----");
        System.out.print("Enter lenght =");
        float l = sc.nextFloat();
        System.out.print("Enter width =");
        float w = sc.nextFloat();
        System.out.print("Enter height =");
        float h = sc.nextFloat();
        System.out.println("Area = " + (2 * ((l * w) + (h * l) + (w * h))));
        System.out.println("Volume = " + (l * h * w));
        System.out.println("Perimeter = " + (4 * (l + w + h)));
    }
}
