import java.util.Scanner;

class MIT_Parent {
    int len, br, ar, pr;

    public void input(Scanner sc) {
        System.out.println("Enter the Length of the Rectangle = ");
        len = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle = ");
        br = sc.nextInt();
    }

    public void rectangle_area_perimeter() {
        ar = len * br;
        pr = 2 * (len + br);
    }
}

interface Circle {
    double pi = 3.14;

    void circle_cal(double r);
}

interface Str_concat {
    void concat(Scanner sc);
}

public class MultipleLevel_Inheritance_TwoInterface extends MIT_Parent implements Circle, Str_concat {
    double c_ar, c_pr;
    String x, y, z;

    public void circle_cal(double r) {
        c_ar = pi * r * r;
        c_pr = 2 * pi * r;
    }

    public void concat(Scanner sc) {
        sc.nextLine(); // Clear newline from previous input
        System.out.println("Enter the first string = ");
        x = sc.nextLine();
        System.out.println("Enter the second string = ");
        y = sc.nextLine();
        z = x + " " + y;
    }

    public void show() {
        System.out.println("Rectangle Area = " + ar);
        System.out.println("Rectangle Perimeter = " + pr);
        System.out.println("Circle Area = " + c_ar);
        System.out.println("Circle Perimeter = " + c_pr);
        System.out.println("Concatenated String = " + z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultipleLevel_Inheritance_TwoInterface ob = new MultipleLevel_Inheritance_TwoInterface();

        ob.input(sc);
        ob.rectangle_area_perimeter();
        System.out.println("Enter the radius of the circle = ");
        double r = sc.nextDouble();
        ob.circle_cal(r);
        ob.concat(sc);
        ob.show();

        sc.close();
    }
}
