import java.util.Scanner;

public class AddOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();
        System.out.println("Addition = " + Add(a, b));// Calling the Mathod,As we created the mathod with static we
                                                      // don't need to make any
                                                      // object to use
        sc.close();
    }

    static int Add(int a, int b) {
        return a + b;
    }
}
