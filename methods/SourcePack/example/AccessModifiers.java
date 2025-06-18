// Defining a package named sourcepack.example
package sourcepack.example;

// A public class named AccessModifiers with the main method
public class AccessModifiers {
    // Public string variable, accessible from any class within or outside the
    // package
    public String str = "This is the public string";

    // Public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class in Public Access");
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an object of the AccessModifiers class to access its members
        AccessModifiers ob = new AccessModifiers();

        // Calling the public method of the AccessModifiers class
        ob.printFromClass();

        // Accessing and printing the public variable from the AccessModifiers class
        System.out.println(ob.str);

        // Creating an object of the Outsider class to call its method
        Outsider ob1 = new Outsider();

        // Calling the method from the Outsider class to demonstrate access
        ob1.printFromOutsideClass();
    }
}

// A class named Outsider (not public, meaning it has package-private access)
class Outsider {
    // Default (package-private) access method; accessible only within the same
    // package
    void printFromOutsideClass() {
        // Creating an object of the AccessModifiers class to access its members
        AccessModifiers ob = new AccessModifiers();

        // Accessing the public variable from the AccessModifiers class within the same
        // package
        System.out.println("Within the same code but from an outside class: " + ob.str);
    }
}
