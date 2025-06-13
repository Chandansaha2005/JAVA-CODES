import java.util.Scanner;

public class Rectangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- RECTANGLE CALCULATION ----");
        System.out.print("Enter the height =");
        float h = sc.nextFloat();
        System.out.print("Enter the width =");
        float w = sc.nextFloat();
        System.out.println("Area=" + (h * w));
        System.out.println("Perimeter=" + (2 * (h + w)));
    }
}
