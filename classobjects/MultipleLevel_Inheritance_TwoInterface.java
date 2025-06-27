import java.util.Scanner;

class MIT_Parent {
    int len, br, ar, pr;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lenght of the Rectangle  = ");
        len = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle  = ");
        br = sc.nextInt();
        sc.close();
    }

    public void rectangle_area_perimeter() {
        ar = len * br;
        pr = 2 * (len + br);
    }
}

interface Circle {
    public final double pi = 3.14;

    public void circle_cal(double r);
}

interface Str_concat {
    public void concat();
}

public class MultipleLevel_Inheritance_TwoInterface extends MIT_Parent implements Circle, Str_concat {
    double c_ar, c_pr;
    String x, y, z;

    public void circle_cal(double r) {
        c_ar = pi * r * r;
        c_pr = 2 * pi * r;
    }

    public void Str_concat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string = ");
        x = sc.nextLine();
        System.out.println("Enter the second string = ");
        y = sc.nextLine();
        z = x + " " + y;
        sc.close();
    }

    public void show() {
        System.out.println("Rectangle Area = " + ar + "\nRectangle Perimeter = " + pr);
        System.out.println("Circle Area = " + c_ar + "\nCircle Perimeter = " + c_pr);
        System.out.println("Concat String = " + z);
    }

    public static void main(String[] args) {
        MultipleLevel_Inheritance_TwoInterface ob  = new MultipleLevel_Inheritance_TwoInterface();
        
    }
}
