import java.util.Stack;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray())
            if (!st.isEmpty() && st.peek() == ch)
                st.pop();
            else
                st.push(ch);
        StringBuilder res = new StringBuilder();
        for (char ch : st)
            res.append(ch);
        return res.toString();
    }
    public static void main(String[] args) {
        String[] tests = { "a", "aa", "abca", "azxxzy", "abbaca", "abcabc", "aabbcc"
        };

        for (String t : tests) {
            String result = removeDuplicates(t);
            System.out.println("Input: \"" + t + "\" -> Output: \"" + result + "\"");
        }
    }
}
