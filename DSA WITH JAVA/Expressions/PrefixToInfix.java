import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(String.valueOf(ch));
            } else if (ch == '(') {
                op.push(ch);
            } else { // operator
                while (!op.isEmpty()) {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String newvalue = v1 + o + v2;
                    val.push(newvalue);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v1 = val.pop();
            String v2 = val.pop();
            char o = op.pop();
            String newvalue = v1 + o + v2;
            val.push(newvalue);
        }

        System.out.println(val.peek());
    }
}
