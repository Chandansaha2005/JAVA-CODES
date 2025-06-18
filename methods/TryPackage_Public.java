
// Importing the PublicAccessModifiers class from the package 'sourcepack.example'
import sourcepack.example.PublicAccessModifiers;

// Defining a public class named TryPackage
public class TryPackage_Public {
    public static void main(String[] args) {

        // Creating an object of the PublicAccessModifiers class
        // to access its public members (variables and methods)
        PublicAccessModifiers ob = new PublicAccessModifiers();

        // Accessing and printing the public variable from PublicAccessModifiers class
        System.out.println("Outside Package, Non-child Class: " + ob.str);

        // Calling the public method from PublicAccessModifiers class
        ob.printFromClass();

        // Creating an object of the child class Outsider2OfPublicAccessModifier to call
        // its method
        Outsider2OfPublicAccessModifier ob2 = new Outsider2OfPublicAccessModifier();
        ob2.printFromChildClass();
    }
}

// Defining a child class 'Outsider2OfPublicAccessModifier' that extends
// (inherits) from PublicAccessModifiers
class Outsider2OfPublicAccessModifier extends PublicAccessModifiers {

    // This method demonstrates that the child class can access the parent's public
    // members
    void printFromChildClass() {
        // Directly accessing the inherited public variable
        System.out.println(
                "This is from Outsider2OfPublicAccessModifier (child class of PublicAccessModifiers parent class): "
                        + str);
    }
}
