import java.util.ArrayList;
import java.util.Scanner;

public class FindPatterninString {
    static ArrayList<Integer> patternFind(String pat, String txt) {
        ArrayList<Integer> res = new ArrayList<>();
        int l = txt.length();
        for (int i = 0; i <= pat.length() - l; i++) {
            if (txt.equals(pat.substring(i, i + l))) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(patternFind(sc.next(), sc.next()));
        sc.close();
    }
}