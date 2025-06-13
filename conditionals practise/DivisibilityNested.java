import java.util.Scanner;

public class DivisibilityNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int num = sc.nextInt();
        if (num % 5 == 0 || num % 3 == 0) {
            System.out.print("The number is divisible by 5 or 3");
            if(num%15==0){
                System.out.print(" And it is divisible by 15  ");
            }else{
                System.out.print(" but it is not divisible by 15");
            }
        }
    }
}
