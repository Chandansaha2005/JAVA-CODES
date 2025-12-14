import java.util.Stack;

public class InfixToPrefix {
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        return -1;
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(String.valueOf(ch));
            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String newvalue = o + v2 + v1;
                    val.push(newvalue);
                }
                op.pop(); // remove '('
            } else { // operator
                while (!op.isEmpty() && precedence(ch) <= precedence(op.peek())) {
                    if (op.peek() == '(')
                        break;
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String newvalue = o + v2 + v1;
                    val.push(newvalue);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v1 = val.pop();
            String v2 = val.pop();
            char o = op.pop();
            String newvalue = o + v2 + v1;
            val.push(newvalue);
        }

        System.out.println(val.peek());
    }
}
