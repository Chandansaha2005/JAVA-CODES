import java.util.Scanner;

public class cube_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- CUBE CALCULATION ----");
        System.out.print("Enter height =");
        float h = sc.nextFloat();
        System.out.println("Area = " + (6 * (h * h)));
        System.out.println("Volume = " + (h * h * h));
        System.out.println("Perimeter = " + (12 * h));
    }
}
