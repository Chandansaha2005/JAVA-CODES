import java.util.Scanner;

public class AddTwoBinaryString {
    static String trimZero(String s) {
        int fzero = s.indexOf('1');
        return (fzero == -1) ? "0" : s.substring(fzero);
    }

    static String addTwoBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        s1 = trimZero(s1);
        s2 = trimZero(s2);
        int n = s1.length(), m = s2.length();
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        int j = m - 1;
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int bit1 = s1.charAt(i) - '0';
            int sum = bit1 + carry;
            if (j >= 0) {
                int bit2 = s2.charAt(j) - '0';
                sum += bit2;
                j--;
            }
            int bit = sum % 2;
            carry = sum / 2;

            result.append((char) (bit + '0'));
        }
        if (carry > 0)
            result.append('1');
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(addTwoBinary(sc.next(), sc.next()));
        sc.close();
    }
}
