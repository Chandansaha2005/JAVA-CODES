class Student { // creating a new class named Student
    int RollNo = 10; // giving an attribute
    String name;

    String MargeNameRoll(int n, String nm) {
        RollNo = n;
        name = nm;
        return "Roll No: " + RollNo + ", Name: " + name;
    }
}

public class School { // this public class must have the same name as the file
    public static void main(String[] args) {
        Student ob = new Student(); // creating an object of Student class
        System.out.println(ob.RollNo);// using the object to access the attribute
        ob.name = "Anis";
        System.out.println(ob.name); // using the object to access the attribute
        String merged = ob.MargeNameRoll(25, "Chandan"); // using the object we can also call a method/fucntion of an another class
        System.out.println(merged); // outputs the combined info
    }
}
