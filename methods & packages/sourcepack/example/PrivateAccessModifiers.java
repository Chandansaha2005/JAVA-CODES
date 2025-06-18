// Defining a package named sourcepack.example
package sourcepack.example;

// A public class named PrivateAccessModifiers with the main method
public class PrivateAccessModifiers {

    // A private string variable - can only be accessed within this class
    private String str = "This is a private-access string"; 

    // A public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class using Public Access");
    }

    // A public method that allows controlled access to the private variable
    public void printPrivateVariable() {
        System.out.println("Accessing private variable within the same class: " + str);
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an object of PrivateAccessModifiers to access its members
        PrivateAccessModifiers ob = new PrivateAccessModifiers();

        // Calling the public method of PrivateAccessModifiers
        ob.printFromClass();

        // Accessing the private variable using a public method (allowed)
        ob.printPrivateVariable();

        // Creating an object of OutsiderOfPrivate to demonstrate private access restriction
        OutsiderOfPrivate ob1 = new OutsiderOfPrivate();

        // Calling the method from OutsiderOfPrivate to demonstrate restricted access
        ob1.printFromOutsideClass();
    }
}

// A class named OutsiderOfPrivate, which is package-private (not public)
class OutsiderOfPrivate {

    // Default (package-private) access method; accessible only within the same package
    void printFromOutsideClass() {
        // Creating an object of PrivateAccessModifiers to access its members
        PrivateAccessModifiers ob = new PrivateAccessModifiers();

        // ERROR: Private variable 'str' is NOT accessible outside its class
        // This will cause a compile-time error because private members are strictly limited to the defining class.
        // System.out.println("Trying to access private variable from another class: " + ob.str);
        
        System.out.println("Cannot access private variable directly. Only accessible via public method."+ ob.str);
    }
}
