
// Why multiple inheritance is not allowed in Java with classes:
/*  Java does not support multiple inheritance with classes to avoid the "Diamond Problem." 
    This occurs when two parent classes have a method with the same signature, 
    and the child class inherits from both. The compiler would then be unable to decide 
    which version of the method to use, leading to ambiguity. To resolve this, 
    Java allows multiple inheritance through interfaces, which don’t carry implementation (until Java 8, 
    which added default methods—but those too have clear resolution rules).
*/
// Example of Multiple Inheritance Attempt Using Classes
import java.util.Scanner;

class A1 {
    public void display() {
        System.out.println("Hello I'm 1st Parent");
    }
}

class B1 {
    public void display1() {
        System.out.println("Hello I'm 2nd Parent");
    }
}

//  This line will cause a compilation error
// Java does not support multiple inheritance with classes
// Because it can lead to ambiguity if both parent classes contain the same method signature
// Solution: Use interfaces instead when multiple inheritance is needed
class MultipleLevel_inheritence extends A1, B1 { //  Compilation Error
    public static void main(String[] args) {

    }
}
