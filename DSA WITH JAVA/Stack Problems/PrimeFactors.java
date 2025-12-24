import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter A Number = ");
        int n = sc.nextInt();
        for (int i = 2; n > 1;) {
            if (n % i == 0) {
                n /= i;
                st.push(i);
            } else
                i++;
        }
        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
        sc.close();
    }
}
