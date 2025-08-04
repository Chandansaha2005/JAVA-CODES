import java.util.Scanner;

public class DivisibleBy3or5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        //Using if-else 
        if (num % 3 == 0 || num%5==0) {
            System.err.println("It is Divisiable by 3 or 5");
        } else {
            System.out.println("It's NOT ");
        }
        //Using Ternary 
        String res;
        res=(num%2==0||num % 3 == 0)?"Divisible by 5 and 3":" not divisible by 3 or 5";
        System.err.println("The number is "+ res);
    }
}
