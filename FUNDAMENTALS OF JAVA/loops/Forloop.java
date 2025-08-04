import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.err.print(i+" ");
        }
    }
}
