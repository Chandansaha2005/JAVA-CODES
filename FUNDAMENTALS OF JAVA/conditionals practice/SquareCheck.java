import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- AREA & PERIMETER OF RECTANGLE -----");
        System.out.print("Enter the length = ");
        int l = sc.nextInt();
        System.out.print("Enter the width = ");
        int w = sc.nextInt();

        int area = l * w;
        int peri = 2 * (l + w);
        System.out.println("Area = " + area + "\nPerimeter = " + peri);

        if (l == w) {
            System.err.println("It's a Square");
        } else {
            System.out.println("It's a Rectangle");
        }

    }
}
