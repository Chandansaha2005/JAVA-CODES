package SourcePack.example;
class Modifiers {
    public String str = "This is the public string";

    public void PrintFromClass() {
        System.out.println("With in the Class in Public Access");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Modifiers ob = new Modifiers();
        ob.PrintFromClass();
        System.out.println(ob.str);
        
        outsider ob1 = new outsider();
        ob1.PrintFromOutsideClass();

    }
}

class outsider {
    void PrintFromOutsideClass() {
        Modifiers ob = new Modifiers();
        System.out.println("With in Same code but from a outside class " + ob.str);
    }
}