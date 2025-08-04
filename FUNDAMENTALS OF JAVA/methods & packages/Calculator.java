// Defining a class named Calculation
class Calculation {
    int a, b; // Declaring two integer variables

    // Constructor: Initializes the values of 'a' and 'b' when an object is created
    Calculation(int x, int y) {
        a = x;
        b = y;
    }

    // Method to perform addition
    int Addition() {
        return a + b;
    }

    // Method to perform subtraction
    int Subtraction() {
        return a - b;
    }

    // Method to perform multiplication
    int Multiplication() {
        return a * b;
    }

    // Method to perform division
    int Division() {
        return a / b;
    }
}

// Main class to test the Calculation class
public class Calculator {
    public static void main(String[] args) {

        // Creating an object 'num0' with values 12 and 6
        Calculation num0 = new Calculation(12, 6);

        // Performing operations and displaying results
        System.out.println(num0.Addition());
        System.out.println(num0.Subtraction());
        System.out.println(num0.Division());
        System.out.println(num0.Multiplication());

        System.out.println(" "); // Printing a blank line for better readability

        // Creating another object 'num1' with values 18 and 6
        Calculation num1 = new Calculation(18, 6);

        // Performing operations and displaying results
        System.out.println(num1.Addition());
        System.out.println(num1.Subtraction());
        System.out.println(num1.Division());
        System.out.println(num1.Multiplication());

        System.out.println(" "); // Printing a blank line for better readability

        // Creating another object 'num1' with values 52 and 4
        Calculation num2 = new Calculation(52, 4);

        // Performing operations and displaying results
        System.out.println(num2.Addition());
        System.out.println(num2.Subtraction());
        System.out.println(num2.Division());
        System.out.println(num2.Multiplication());
    }
}
