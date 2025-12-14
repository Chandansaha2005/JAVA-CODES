import java.util.Stack;

public class PrefixEvaluation {

    static int floorDiv(int a, int b) {
        if (a * b < 0 && a % b != 0)
            return (a / b) - 1;
        return a / b;
    }

    public static int evaluatePrefix(String[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            
            String token = arr[i];
            if (Character.isDigit(token.charAt(0)) ||
                    (token.length() > 1 && token.charAt(0) == '-')) {
                st.push(Integer.parseInt(token));
            }

            else {
                int val1 = st.pop();
                int val2 = st.pop();

                if (token.equals("+")) {
                    st.push(val1 + val2);
                } else if (token.equals("-")) {
                    st.push(val1 - val2);
                } else if (token.equals("*")) {
                    st.push(val1 * val2);
                } else if (token.equals("/")) {
                    st.push(floorDiv(val1, val2));
                } else if (token.equals("^")) {
                    st.push((int) Math.pow(val1, val2));
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] arr = { "+", "*", "/", "+", "100", "200", "2", "5", "7" };
        System.out.println(evaluatePrefix(arr));
    }
}