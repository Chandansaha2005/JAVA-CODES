import java.util.Scanner;

public class AgeGroup_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Age = ");
        int age = sc.nextInt();
        String group;
        group = (age <= 12) ? "Child" : (age > 12 && age < 18) ? "Teenager" : "Adult";
        System.out.println(group);
    }
}
