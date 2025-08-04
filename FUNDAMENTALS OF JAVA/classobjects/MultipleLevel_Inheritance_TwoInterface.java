import java.util.Scanner;

// Parent class for Rectangle properties
class MIT_Parent {
    int len, br, ar, pr;

    // Takes input for length and breadth of a rectangle
    public void input(Scanner sc) {
        System.out.println("Enter the Length of the Rectangle = ");
        len = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle = ");
        br = sc.nextInt();
    }

    // Calculates area and perimeter of the rectangle
    public void rectangle_area_perimeter() {
        ar = len * br;
        pr = 2 * (len + br);
    }
}

// Circle interface with a constant and abstract method
interface Circle {
    double pi = 3.14;  // Constant value of π
    void circle_cal(double r);  // Method to calculate circle properties
}

// String concatenation interface
interface Str_concat {
    void concat(Scanner sc);  // Method to concatenate two strings
}

// Derived class implementing two interfaces and extending a parent class
public class MultipleLevel_Inheritance_TwoInterface extends MIT_Parent implements Circle, Str_concat {
    double c_ar, c_pr;      // Circle area and perimeter
    String x, y, z;         // Strings for concatenation

    // Implements method from Circle interface
    public void circle_cal(double r) {
        c_ar = pi * r * r;        // Area = π × r²
        c_pr = 2 * pi * r;        // Perimeter = 2πr
    }

    // Implements method from Str_concat interface
    public void concat(Scanner sc) {
        sc.nextLine(); // Clear leftover newline
        System.out.println("Enter the first string = ");
        x = sc.nextLine();

        System.out.println("Enter the second string = ");
        y = sc.nextLine();

        z = x + " " + y;  // Combine strings with a space
    }

    // Displays all calculated and combined values
    public void show() {
        System.out.println("\n--- Results ---");
        System.out.println("Rectangle Area = " + ar);
        System.out.println("Rectangle Perimeter = " + pr);
        System.out.println("Circle Area = " + c_ar);
        System.out.println("Circle Perimeter = " + c_pr);
        System.out.println("Concatenated String = " + z);
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MultipleLevel_Inheritance_TwoInterface ob = new MultipleLevel_Inheritance_TwoInterface();

        ob.input(sc);                              // Rectangle input
        ob.rectangle_area_perimeter();             // Rectangle calculations

        System.out.println("Enter the radius of the Circle = ");
        double r = sc.nextDouble();
        ob.circle_cal(r);                          // Circle calculations

        ob.concat(sc);                             // String input and concatenation
        ob.show();                                 // Display all results

        sc.close();                                // Cleanly close the scanner
    }
}
