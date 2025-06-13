import java.util.Scanner;

public class DoWhileloop {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range = ");
        int n = sc.nextInt();
        do {
            System.err.print(i + " ");
            i++;
        } while (i <= n);
    }
}
