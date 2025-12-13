import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else if (st.isEmpty())
                return false;
            else if (st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']')
                st.pop();
            else
                return false;
            i++;
        }
        return (st.isEmpty());
    }

    // quick harness
    public static void main(String[] args) {
        String[] tests = {
                "()", "()[]{}", "(]", "([)]", "{[]}", "(((((())))))", "{[()()]}", "])", "[", "[]{}()"
        };
        System.out.println(tests[0]);
        for (String t : tests) {
            boolean ans = isValid(t);
            System.out.println("s = \"" + t + "\" -> " + ans);
        }
    }
}
