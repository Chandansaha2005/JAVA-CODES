import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.err.println("It's an Even no.");
        } else {
            System.out.println("It's a Odd no. ");
        }

        //TERNARY
        String res;
        res=(num%2==0)?"Even":"Odd";
        System.out.println("It is "+res);
    }
}