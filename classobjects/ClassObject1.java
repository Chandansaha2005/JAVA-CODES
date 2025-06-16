class NewClass {
    int attribute1 = 10;
    int attribute2 = 20;
}

public class ClassObject1 {
    public static void main(String[] args) {
        NewClass object = new NewClass();
        System.out.println(object.attribute1);
        System.out.println(object.attribute2);
    }
}