import java.util.Scanner;

public class StringToInteger {
    static int myAtoi(String s) {
        int res = 0, sign = 1, index = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index++) == '-')
                sign = -1;
        }
        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || (res > Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res + (s.charAt(index++) - '0');
        }
        return res * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(myAtoi(sc.next()));
        sc.close();
    }
}