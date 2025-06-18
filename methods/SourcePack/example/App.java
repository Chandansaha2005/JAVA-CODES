package SourcePack.example;

public class App {
    public String str = "This is the public string";

    // Public method, accessible from anywhere within the package and outside
    public void printFromClass() {
        System.out.println("Within the Class in Public Access");
    }

    public static void main(String[] args) {
        // Creating an object of App class and accessing its members
        App ob = new App();
        ob.printFromClass(); // Calling the public method
        System.out.println(ob.str); // Accessing the public variable

        // Creating an object of App2 class and calling its method
        App2 ob1 = new App2();
        ob1.printFromOutsideClass();
    }
}

class App2 {
    void printFromOutsideClass() {
        // Creating an object of App class
        App ob = new App();
        // Accessing the public variable from another class in the same package
        System.out.println("Within the same code but from an outside class: " + ob.str);
    }
}
