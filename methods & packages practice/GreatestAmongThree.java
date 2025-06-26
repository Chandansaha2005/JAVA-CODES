import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers = ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(Math.max(Math.max(a, b), c) + " is Greatest");
        sc.close();
    }
}
