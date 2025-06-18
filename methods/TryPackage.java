
// Importing the AccessModifiers class from the package sourcepack.example
import sourcepack.example.AccessModifiers;

// Defining a public class named TryPackage
public class TryPackage {
    public static void main(String[] args) {

        // Creating an object of the AccessModifiers class to access its public members
        AccessModifiers ob = new AccessModifiers();

        // Calling the public method from the AccessModifiers class
        ob.printFromClass();

        // The object 'ob' can now be used to call other public methods from the
        // AccessModifiers class if defined
    }
}
