// Defining a package named sourcepack.example
package sourcepack.example;

// Public class named App with a main method
public class App {
    // Public string variable, accessible from any class
    public String str = "This is the public string";

    // Public method that prints a message when called
    public void printFromClass() {
        System.out.println("Within the Class in Public Access");
    }

    public static void main(String[] args) {
        // Creating an object of the App class to access its members
        App ob = new App();

        // Calling the public method of the App class
        ob.printFromClass();

        // Accessing and printing the public variable from the App class
        System.out.println(ob.str);

        // Creating an object of the App2 class to call its method
        App2 ob1 = new App2();

        // Calling the method from the App2 class
        ob1.printFromOutsideClass();
    }
}

// A class named App2 (not public, meaning it has package-private access)
class App2 {
    // Method that prints a message and accesses a variable from the App class
    void printFromOutsideClass() {
        // Creating an object of the App class to access its members
        App ob = new App();

        // Printing a message while accessing the public variable from the App class
        System.out.println("Within the same code but from an outside class: " + ob.str);
    }
}
