import java.util.Scanner;

public class GradeCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- GRADE CARD -----");
        System.out.println("Enter the marks for each subject out of 100 :--");
        System.out.print("Bengali = ");
        int ben = sc.nextInt();
        System.out.print("English = ");
        int eng = sc.nextInt();
        System.out.print("Math = ");
        int math = sc.nextInt();
        System.out.print("Geography = ");
        int geo = sc.nextInt();
        System.out.print("History = ");
        int his = sc.nextInt();
        System.out.print("Science = ");
        int sci = sc.nextInt();
        int total = ben + eng + math + geo + his + sci;
        int grade = total / 6;
        System.out.println("TOTAL MARKS = " + total + "/600\nPERCENTAGE = " + grade + "%");

        // GRADE
        if (grade >= 90 && grade <= 100) {
            System.out.println("OVERALL GRADE = EXCELLENT");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("OVERALL GRADE = VERY GOOD");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("OVERALL GRADE = GOOD");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("OVERALL GRADE = CAN DO BETTER");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("OVERALL GRADE = AVERAGE");
        } else if (grade >= 40 && grade < 50) {
            System.out.println("OVERALL GRADE = BELOW AVARAGE");
        } else if (grade < 40) {
            System.out.println("OVERALL GRADE = FAIL");
        } else {
            System.out.println("WRONG INPUT");
        }
    }
}
