import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- ABSOLUTE VALUE -----");
        System.out.print("Enter the number ,(+ve or -ve)= ");
        int num = sc.nextInt();
        if(num<0){
            System.err.println("Absolute value = "+(num*(-1)));
        }else{
            System.out.println("Absolute value = "+num);
        }
    }
}
