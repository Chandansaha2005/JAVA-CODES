
// Duck Number
// Definition: A number that contains zero, but not at the beginning.
// Example: 102 → contains 0 → Duck Number
// (010 is not duck, starts with 0)
import java.util.Scanner;

public class Duck_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num=sc.nextInt();
        
        sc.close();
    }
}
