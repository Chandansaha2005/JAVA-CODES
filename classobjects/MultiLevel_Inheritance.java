import java.util.Scanner;

public class MultiLevel_Inheritance {
    int a, b, sum;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number = ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number = ");
        b = sc.nextInt();
    }

    public void add() {
        sum = a + b;
    }
}
