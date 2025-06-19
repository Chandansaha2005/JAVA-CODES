
// Importing the DefaultAccessModifiers class from the package 'sourcepack.example'
// This will compile, but trying to access the default variable 'str' will cause an error
import sourcepack.example.DefaultAccessModifiers;

// Defining a public class named TryPackage_Default
public class TryPackage_Default {
    public static void main(String[] args) {

        // Creating an object of the DefaultAccessModifiers class
        DefaultAccessModifiers ob = new DefaultAccessModifiers();

        // ERROR: Default-access variable 'str' is NOT accessible outside its package
        // This will cause a compile-time error because default access does not allow
        // cross-package usage.
        System.out.println("Outside Package, Non-child Class: " + ob.str);

        // Calling the public method from DefaultAccessModifiers class
        ob.printFromClass(); // This works because 'printFromClass()' is public

        // Creating an object of the child class Outsider2OfDefaultAccessModifier
        Outsider2OfDefaultAccessModifier ob2 = new Outsider2OfDefaultAccessModifier();
        ob2.printFromChildClass(); // ERROR: The inherited default-access variable is still not visible outside the
                                   // package
    }
}

// Defining a child class 'Outsider2OfDefaultAccessModifier' that extends
// DefaultAccessModifiers
class Outsider2OfDefaultAccessModifier extends DefaultAccessModifiers {

    // This method attempts to access the parent's default-access variable
    void printFromChildClass() {
        // ERROR: Even though this class extends DefaultAccessModifiers, it is in a
        // different package,
        // so it cannot access 'str' (which has package-private access)
        System.out.println(
                "This is from Outsider2OfDefaultAccessModifier (child class of DefaultAccessModifiers parent class): "
                        + str);
    }
}
