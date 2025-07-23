import java.util.*;

public class ArrayList_PowerOfKinFact {
    static ArrayList<int[]> pfact(int n) {
        ArrayList<int[]> f = new ArrayList<>();
        int c = 0;
        while (n % 2 == 0) {
            n /= 2;
            c++;
        }
        return f;
    }

    static int maxPower(int k, int n) {
        ArrayList<int[]> f = pfact(k);
        int p = 0;
        while (n % k == 0) {
            p++;
            n /= k;
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println(maxPower(2, 150));
    }
}
