// Defining a package named SourcePack.example
package SourcePack.example;  


// A public class named AccessModifiers with the main method
public class AccessModifiers {  
    public String str = "This is the public string";  

    // Public method, accessible from anywhere within the package and outside
    public void PrintFromClass() {  
        System.out.println("Within the Class in Public Access");  
    } 
    public static void main(String[] args) {  
        // Creating an object of AccessModifiers class and accessing its members
        AccessModifiers ob = new AccessModifiers();  
        ob.PrintFromClass();  // Calling the public method  
        System.out.println(ob.str);  // Accessing the public variable  

        // Creating an object of outsider class and calling its method
        outsider ob1 = new outsider();  
        ob1.PrintFromOutsideClass();  
    }  
}  

// A class named outsider (note: lowercase class name is unconventional, usually class names start with uppercase)
class outsider {  
    // Default (package-private) access method
    void PrintFromOutsideClass() {  
        // Creating an object of Modifiers class
        AccessModifiers ob = new AccessModifiers();  
        // Accessing the public variable from another class in the same package
        System.out.println("Within Same code but from an outside class " + ob.str);  
    }  
}
