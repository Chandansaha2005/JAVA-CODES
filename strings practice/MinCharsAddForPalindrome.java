import java.util.Scanner;

public class MinCharsAddForPalindrome {
    static boolean palinCheck(String s, int res) {
        int i = 0, j = (s.length() - 1) - res;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int minChar(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (palinCheck(s, res)) {
                return res;
            } else
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minChar(sc.next()));
        sc.close();
    }
}
