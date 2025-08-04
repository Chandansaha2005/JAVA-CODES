import java.util.Scanner;

public class PowerFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int n = num;

        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (num % i == 0) {
                num = num / i;
                count++;
            }
            if (count > 0) {
                System.out.println(i + "^" + count);
            }
        }
        sc.close();
    }
}