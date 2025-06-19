
// Demonstration of Multiple Inheritance in Java using class and interface
import java.util.Scanner;

// Base class containing rectangle-related logic
class A2 {
    int len, br, ar, pr; // len: length, br: breadth, ar: area, pr: perimeter

    // Method to take rectangle dimensions from user
    public void input() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Length = ");
        len = ob.nextInt();
        System.out.print("Enter the Breadth = ");
        br = ob.nextInt();
        ob.close(); // Closing Scanner object
    }

    // Method to calculate rectangle area and perimeter
    public void rect_calc() {
        ar = len * br;
        pr = 2 * (len + br);
    }
}

// Interface containing circle-related calculation signature
interface Cir {
    public final double pi = 3.14; // Constant value for π

    public void cir_calc(double r); // Method to be implemented by class
}

// Subclass that inherits from A2 and implements Cir
class MultipleLevel_Inheritence_correct extends A2 implements Cir {
    double c_ar, c_pr; // c_ar: circle area, c_pr: circle perimeter

    // Implementation of cir_calc() from interface Cir
    public void cir_calc(double r) {
        c_ar = pi * r * r;
        c_pr = 2 * pi * r;
    }

    // Method to display the results
    public void show() {
        System.out.println("Rect. Area = " + ar + " Rect Perimeter = " + pr);
        System.out.println("Circ. Area = " + c_ar + " Circ. Perimeter = " + c_pr);
    }

    // Main method to run the program
    public static void main(String[] args) {
        MultipleLevel_Inheritence_correct ob = new MultipleLevel_Inheritence_correct();

        ob.input(); // Get rectangle dimensions from user
        ob.rect_calc(); // Calculate rectangle properties

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Radius = ");
        double r = obj.nextDouble(); // Input radius for circle
        ob.cir_calc(r); // Calculate circle properties
        ob.show(); // Display both rectangle and circle details
        obj.close(); // Close Scanner
    }
}
