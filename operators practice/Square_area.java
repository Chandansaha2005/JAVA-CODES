import java.util.Scanner;

public class Square_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- SQUARE CALCULATION ----");
        System.out.print("Enter the height = ");
        float h = sc.nextFloat();
        System.out.println("Area= " + (h * h));
        System.out.println("Perimeter = " + (4 * h));
    }
}
