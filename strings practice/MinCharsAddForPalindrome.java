import java.util.Scanner;

public class MinCharsAddForPalindrome {
    static int[] calcuLPS(String s) {
        int n = s.length(), i = 1;
        int[] lps = new int[n];
        lps[0] = 0;
        int len = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    static int minChar(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        s = s + "#" + rev;
        int[] lps = calcuLPS(s);
        return (n - lps[lps.length - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minChar(sc.next()));
        sc.close();
    }
}
