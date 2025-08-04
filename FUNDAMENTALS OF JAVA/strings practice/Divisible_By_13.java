import java.util.Scanner;

public class Divisible_By_13 {
    static boolean Solution(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            temp = (temp * 10 + (s.charAt(i) - '0')) % 13;
        }
        return temp == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        System.out.println(Solution(sc.next()));
        sc.close();
    }
}