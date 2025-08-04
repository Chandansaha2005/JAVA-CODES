
// Importing the ProtectedAccessModifiers class from the package 'sourcepack.example'
import sourcepack.example.ProtectedAccessModifiers;

// Defining a public class named TryPackage_Protected to demonstrate access modifiers across packages
public class TryPackage_Protected {
    public static void main(String[] args) {

        // Creating an object of the ProtectedAccessModifiers class
        // Since 'str' is protected, it can be accessed only within the same package or
        // through inheritance
        ProtectedAccessModifiers ob = new ProtectedAccessModifiers();

        // Accessing and printing the protected variable from ProtectedAccessModifiers
        // class
        // ERROR: This will cause a compile-time error because 'str' is protected and
        // 'TryPackage_Protected' is not a subclass of ProtectedAccessModifiers.
        System.out.println("Outside Package, Non-child Class: " + ob.str);

        // Calling the public method from ProtectedAccessModifiers class
        ob.printFromClass();

        // Creating an object of the child class Outsider2OfProtectedAccessModifier to
        // call its method
        Outsider2OfProtectedAccessModifier ob2 = new Outsider2OfProtectedAccessModifier();
        ob2.printFromChildClass();
    }
}

// Defining a child class 'Outsider2OfProtectedAccessModifier' that extends
// (inherits) from ProtectedAccessModifiers
class Outsider2OfProtectedAccessModifier extends ProtectedAccessModifiers {

    // This method demonstrates that the child class can access the parent's
    // protected members
    void printFromChildClass() {
        // Directly accessing the inherited protected variable
        System.out.println(
                "This is from Outsider2OfProtectedAccessModifier (child class of ProtectedAccessModifiers parent class): "
                        + str);
    }
}
