// Defining a package named SourcePack.example
package SourcePack.example;  

// A public class named AccessModifiers with the main method
public class AccessModifiers {  
    // Public string variable, accessible from any class
    public String str = "This is the public string";  

    // Public method, accessible from anywhere within the package and outside
    public void printFromClass() {  
        System.out.println("Within the Class in Public Access");  
    }  

    public static void main(String[] args) {  
        // Creating an object of AccessModifiers class and accessing its members
        AccessModifiers ob = new AccessModifiers();  
        ob.printFromClass();  // Calling the public method  
        System.out.println(ob.str);  // Accessing the public variable  

        // Creating an object of Outsider class and calling its method
        Outsider ob1 = new Outsider();  
        ob1.printFromOutsideClass();  
    }  
}  

// A class named Outsider (proper capitalization according to Java conventions)
class Outsider {  
    // Default (package-private) access method
    void printFromOutsideClass() {  
        // Creating an object of AccessModifiers class
        AccessModifiers ob = new AccessModifiers();  
        // Accessing the public variable from another class in the same package
        System.out.println("Within the same code but from an outside class: " + ob.str);  
    }  
}
