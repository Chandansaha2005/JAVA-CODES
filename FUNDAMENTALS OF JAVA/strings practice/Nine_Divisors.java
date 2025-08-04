import java.util.Scanner;

public class Nine_Divisors {
    static int divisorByNine(int n) {
        int[] Utpadok = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                Utpadok[j]++;
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (Utpadok[i] == 9)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        System.out.println(divisorByNine(sc.nextInt()));
        sc.close();
    }
}
