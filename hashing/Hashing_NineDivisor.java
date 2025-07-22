import java.util.Scanner;

public class Hashing_NineDivisor {
    public static int nineDivisors(int n) {
        int c = 0, len = (int) Math.sqrt(n);
        int[] hash = new int[len + 1];

        for (int i = 1; i <= len; i++) {
            hash[i] = i;
        }

        for (int i = 2; i * i <= len; i++) {
            if (hash[i] == i) {
                for (int j = i * i; j <= len; j += i) {
                    if (hash[j] == j) {
                        hash[j] = i;
                    }
                }
            }
        }

        for (int i = 2; i <= len; i++) {
            int a = hash[i];
            int b = hash[i / hash[i]];

            if (a * b == i && b != 1 && a != b) {
                c++;
            } else if (hash[i] == i && Math.pow(i, 8) <= n) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(nineDivisors(sc.nextInt()));
        sc.close();
    }
}