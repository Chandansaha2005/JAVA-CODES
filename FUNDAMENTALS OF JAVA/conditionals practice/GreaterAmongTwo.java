import java.util.Scanner;

public class GreaterAmongTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- GREATER NUMBER ----");
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();
        if (a > b) {
            System.err.println("1st number is Greater");
        } else if (a < b) {
            System.out.println("2nd number is Greater");
        } else {
            System.out.println("Both same ");
        }

        //TERNARY
        String res;
        res=(a>b)?"1st":(a<b)?"2nd":"Both same";
        System.out.println(res);
    }
}
