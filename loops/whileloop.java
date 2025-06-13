import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range = ");
        int n = sc.nextInt();
        while (i <= n) {
            System.err.print(i + " ");
            i++;
        }
    }

}