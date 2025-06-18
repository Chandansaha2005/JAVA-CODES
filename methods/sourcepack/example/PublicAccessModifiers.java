// Defining a package named sourcepack.example
package sourcepack.example;

// A public class named PublicAccessModifiers with the main method
public class PublicAccessModifiers {
    // Public string variable, accessible from any class within or outside the
    // package
    public String str = "This is the public string";

    // Public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class in Public Access");
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Creating an object of the PublicAccessModifiers class to access its members
        PublicAccessModifiers ob = new PublicAccessModifiers();

        // Calling the public method of the PublicAccessModifiers class
        ob.printFromClass();

        // Accessing and printing the public variable from the PublicAccessModifiers
        // class
        System.out.println(ob.str);

        // Creating an object of the Outsider class to call its method
        OutsiderOFPublic ob1 = new OutsiderOFPublic();

        // Calling the method from the Outsider class to demonstrate access
        ob1.printFromOutsideClass();
    }
}

// A class named Outsider (not public, meaning it has package-private access)
class OutsiderOFPublic {
    // Default (package-private) access method; accessible only within the same
    // package
    void printFromOutsideClass() {
        // Creating an object of the PublicAccessModifiers class to access its members
        PublicAccessModifiers ob = new PublicAccessModifiers();

        // Accessing the public variable from the PublicAccessModifiers class within the
        // same
        // package
        System.out.println("Within the same code but from an outside class: " + ob.str);
    }
}