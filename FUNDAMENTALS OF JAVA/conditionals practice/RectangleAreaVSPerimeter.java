import java.util.Scanner;

public class RectangleAreaVSPerimeter {
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

        if (area > peri) {
            System.out.println("Area is larger than perimeter");
        } else if (area < peri) {
            System.out.println("Perimeter is larger than area");
        } else {
            System.out.println("Both Area and Perimeter is same");
        }

    }
}
