// Defining a package named sourcepack.example
package sourcepack.example;

// A public class named DefaultAccessModifiers with the main method
public class DefaultAccessModifiers {

    // A default (package-private) string variable
    // Default members are accessible only within the same package.
    String str = "This is a default-access string";

    // A public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class using Public Access");
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an object of DefaultAccessModifiers to access its members
        DefaultAccessModifiers ob = new DefaultAccessModifiers();

        // Calling the public method of DefaultAccessModifiers
        ob.printFromClass();

        // Accessing and printing the default variable within the same class
        System.out.println("Accessing default variable from the same class: " + ob.str);

        // Creating an object of OutsiderOfDefault to demonstrate package-private access
        OutsiderOfDefault ob1 = new OutsiderOfDefault();

        // Calling the method from OutsiderOfDefault to demonstrate access within the package
        ob1.printFromOutsideClass();
    }
}

// A class named OutsiderOfDefault, which is package-private (not public)
class OutsiderOfDefault {

    // Default (package-private) access method; accessible only within the same package
    void printFromOutsideClass() {
        // Creating an object of DefaultAccessModifiers to access its members
        DefaultAccessModifiers ob = new DefaultAccessModifiers();

        // Accessing the default variable within the same package
        System.out.println("Accessing default variable from another class within the same package: " + ob.str);
    }
}
