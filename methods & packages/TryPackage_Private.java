
// Importing the PrivateAccessModifiers class from the package 'sourcepack.example'
// Private members are NOT accessible outside their own class, even if imported.
import sourcepack.example.PrivateAccessModifiers;

// Defining a public class named TryPackage_Private to demonstrate access control
public class TryPackage_Private {
    public static void main(String[] args) {

        // Creating an object of the PrivateAccessModifiers class
        PrivateAccessModifiers ob = new PrivateAccessModifiers();

        // ERROR: Private variable 'str' is not accessible outside its class
        // System.out.println("Outside Package, Non-child Class: " + ob.str); // This
        // will cause a compile-time error

        // Calling the public method from PrivateAccessModifiers class
        ob.printFromClass(); // This works because 'printFromClass()' is public

        // Using a public method to access the private variable (allowed)
        System.out.println("Accessing private variable via getter method: " + ob.getStr());

        // Creating an object of the child class Outsider2OfPrivateAccessModifier
        Outsider2OfPrivateAccessModifier ob2 = new Outsider2OfPrivateAccessModifier();
        ob2.printFromChildClass(); // Using a getter method to access private data
    }
}

// Defining a child class 'Outsider2OfPrivateAccessModifier' that extends
// PrivateAccessModifiers
class Outsider2OfPrivateAccessModifier extends PrivateAccessModifiers {

    // This method demonstrates that even a child class cannot directly access
    // private members
    void printFromChildClass() {
        // ERROR: Private members are NOT inherited by child classes
        // System.out.println("This is from Outsider2OfPrivateAccessModifier: " + str);
        // // ❌ This will cause a compile-time error

        // Correct approach: Using a public method to access the private variable
        System.out.println("This is from Outsider2OfPrivateAccessModifier (accessing private via getter): " + getStr());
    }
}
