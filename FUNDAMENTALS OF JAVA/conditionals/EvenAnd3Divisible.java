import java.util.Scanner;

public class EvenAnd3Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        //Using if-else 
        if (num % 2 == 0) {
            System.out.println("It's a Even number ");
            if (num % 3 == 0) {
                System.err.println("And It is Divisiable by 3");
            } else {
                System.out.println("but It is NOT Divisiable by 3");
            }
        } else {
            System.out.println("It's NOT a even number ");
        }
        //Using Ternary 
        String res;
        res=(num%2==0)?((num % 3 == 0)?"Even and Divisible by 3":"Even but not divisible by 3 "):"Odd";
        System.err.println("The number is "+ res);
    }
}
