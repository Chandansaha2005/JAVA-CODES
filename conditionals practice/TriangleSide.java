import java.util.Scanner;

public class TriangleSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides lenght :-");
        System.out.print("1st side = ");
        int a=sc.nextInt();
        System.out.print("2nd side = ");
        int b=sc.nextInt();
        System.out.print("3rd side = ");
        int c=sc.nextInt();

        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println("This sides can make a TRIANGLE");
        }else{
            System.out.println("This sides can not make a TRIANGLE");
        }

      }
}
