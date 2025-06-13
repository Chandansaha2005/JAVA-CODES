import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. = ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("The number is divisible by 5 & 3");
            if(num%15==0){
                System.out.print(" And it is divisible by 15 also ");
            }else{
                System.out.print(" but it is not divisible by 15");
            }
        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("The number is divisible by 5 but not by 3");
        } else if (num % 5 != 0 && num % 3 == 0) {
            System.out.println("The number is divisible by 3 but not by 5");
        } else {
            System.out.println("The number is not divisible by 5 & 3 ");
        }
    }
}
