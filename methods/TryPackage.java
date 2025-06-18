// Importing the AccessModifiers class from the package 'sourcepack.example'
import sourcepack.example.AccessModifiers;

// Defining a public class named TryPackage
public class TryPackage {
    public static void main(String[] args) {

        // Creating an object of the AccessModifiers class 
        // to access its public members (variables and methods)
        AccessModifiers ob = new AccessModifiers();

        // Accessing and printing the public variable from AccessModifiers class
        System.out.println("Outside Package, Non-child Class: " + ob.str);

        // Calling the public method from AccessModifiers class
        ob.printFromClass();

        // Creating an object of the child class Outsider2 to call its method
        Outsider2 ob2 = new Outsider2();
        ob2.printFromChildClass();
    }
}

// Defining a child class 'Outsider2' that extends (inherits) from AccessModifiers
class Outsider2 extends AccessModifiers {
    
    // This method demonstrates that the child class can access the parent's public members
    void printFromChildClass() {
        // Directly accessing the inherited public variable
        System.out.println("This is from Outsider2 (child class of AccessModifiers parent class): " + str);
    }
}
