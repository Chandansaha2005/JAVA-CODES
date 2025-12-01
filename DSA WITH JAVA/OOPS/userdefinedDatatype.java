import java.util.Scanner;

public class userdefinedDatatype {
    public static class Student {
        String name;
        int rollNo;
        double CGPA;
        void printInfo(){
            System.out.println("NAME: " + name + "\nRoll No.: " + rollNo + "\nCGPA: " + CGPA + "\n");
        }
    }
    static void printStudent(Student s){
        System.out.println("NAME: " + s.name + "\nRoll No.: " + s.rollNo + "\nCGPA: " + s.CGPA + "\n");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student chandan = new Student();
        chandan.name = "Chandan Saha";
        chandan.rollNo = 48;
        chandan.CGPA = 8.9;

        Student snahashis = new Student();
        snahashis.name = "Snahasish Das";
        snahashis.rollNo = 24;
        snahashis.CGPA = 9.5;
        
        Student random = new Student();
        System.out.print("Enter Student name :");
        random.name=sc.nextLine();
        System.out.print("Enter Student Roll no. :");
        random.rollNo=sc.nextInt();
        System.out.print("Enter Student CGPA :");
        random.CGPA=sc.nextDouble();

        //print manually
        System.out.println("NAME: " + random.name + "\nRoll No.: " + random.rollNo + "\nCGPA: " + random.CGPA + "\n");
        System.out.println("NAME: " + chandan.name + "\nRoll No.: " + chandan.rollNo + "\nCGPA: " + chandan.CGPA + "\n");
        System.out.println("NAME: " + snahashis.name + "\nRoll No.: " + snahashis.rollNo + "\nCGPA: " + snahashis.CGPA + "\n");
        //print with functions
        printStudent(chandan);
        printStudent(snahashis);
        //print with class method
        chandan.printInfo();
        snahashis.printInfo();

        sc.close();
    }
}