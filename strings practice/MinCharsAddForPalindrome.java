import java.util.Scanner;

public class MinCharsAddForPalindrome {
    static int minChar(String s) {
        int res = 0;
        StringBuilder sn = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sn.append(s.charAt(i));
        }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(minChar(sc.next()));
        sc.close();
    }
}
