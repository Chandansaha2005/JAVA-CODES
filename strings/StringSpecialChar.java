import java.util.Scanner;

public class StringSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder ntr = new StringBuilder();
        System.out.println((int) str.charAt(0));
        for (int i = 0, j = 0; i < str.length() && j < str.length(); i++) {
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                ntr.setCharAt(j++, str.charAt(i));
            }
        }
        System.out.println(ntr);
        sc.close();
    }
}
