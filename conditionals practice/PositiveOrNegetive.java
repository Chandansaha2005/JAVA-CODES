import java.util.Scanner;

public class PositiveOrNegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if (num > 0) {
            System.err.println("Positive");
        } else if (num == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negetive");
        }
        //TERNARY
        String res;
        res=(num>0)?"Positive":(num==0)?"Neutral":"Negetive";
        System.out.println(res);
    }
}
