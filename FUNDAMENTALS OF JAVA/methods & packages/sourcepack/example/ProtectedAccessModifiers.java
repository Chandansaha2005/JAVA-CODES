// Defining a package named sourcepack.example
package sourcepack.example;

// A public class named ProtectedAccessModifiers with the main method
public class ProtectedAccessModifiers {

    // A protected string variable, accessible within the same package and by subclasses outside the package
    protected String str = "This is the protected string";

    // A public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class using Public Access");
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an object of the ProtectedAccessModifiers class to access its members
        ProtectedAccessModifiers ob = new ProtectedAccessModifiers();

        // Calling the public method of ProtectedAccessModifiers class
        ob.printFromClass();

        // Accessing and printing the protected variable from ProtectedAccessModifiers class
        System.out.println("Accessing protected variable from the same class: " + ob.str);

        // Creating an object of the OutsiderOfProtected class to demonstrate package-private access
        OutsiderOfProtected ob1 = new OutsiderOfProtected();

        // Calling the method from OutsiderOfProtected class to demonstrate access within the package
        ob1.printFromOutsideClass();
    }
}

// A class named OutsiderOfProtected, which is package-private (not public)
class OutsiderOfProtected {

    // Default (package-private) access method; accessible only within the same package
    void printFromOutsideClass() {
        // Creating an object of the ProtectedAccessModifiers class to access its members
        ProtectedAccessModifiers ob = new ProtectedAccessModifiers();

        // Accessing the protected variable within the same package
        System.out.println("Accessing protected variable from another class within the same package: " + ob.str);
    }
}
