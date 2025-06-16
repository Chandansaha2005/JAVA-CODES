class Student { // creating a new class named Student
    int RollNo = 10; // giving an attribute
    String name;
}

public class School { // this public class must have the same name as the file
    public static void main(String[] args) {
        Student ob = new Student(); // creating an object of Student class
        System.out.println(ob.RollNo); // using the object to access the attribute
        ob.name = "chandan";
        System.out.println(ob.name); // using the object to access the attribute
    }
}
