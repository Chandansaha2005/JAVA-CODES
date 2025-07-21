import java.util.Scanner;

public class Divisible_By_13 {
    static boolean Solution(String s) {
        int n = Integer.parseInt(s);
        return (n % 13 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        System.out.println(Solution(sc.next()));
        sc.close();
    }
}