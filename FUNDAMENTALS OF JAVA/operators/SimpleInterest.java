import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------SIMPLE INTEREST CALCULATOR-------");
        System.out.print("Enter the Principle Amount = ");
        float p = sc.nextFloat();

        System.out.print("Enter the Rate of Interest = ");
        float i = sc.nextFloat();
        
        System.out.print("Enter the Time = ");
        float t = sc.nextFloat();

        float si = (p * i * t) / 100;

        System.out.println("Principle Amonut = " + p);
        System.out.println("Time = " + t);
        System.out.println("Rate of Interest = " + i);
        System.out.println("The Simple Interest = " + si);

    }
}