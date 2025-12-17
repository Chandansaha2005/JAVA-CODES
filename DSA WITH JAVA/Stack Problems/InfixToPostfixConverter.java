import java.util.Stack;

public class InfixToPostfixConverter {
    public static String infixToPostfix(String s) {
        
        return "";
    }

    public static int precedence(char ch) {
        if (ch == '^')
            return 3;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        String[] tests = {
                "a+b*c",
                "(a+b)*c",
                "a+b*(c^d-e)^(f+g*h)-i"
        };

        for (String expr : tests) {
            String result = infixToPostfix(expr);
            System.out.println("Infix: " + expr + " -> Postfix: " + result);
        }
    }
}
