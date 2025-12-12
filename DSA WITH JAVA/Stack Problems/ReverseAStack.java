import java.util.Stack;

public class ReverseAStack {
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (st.size() != 0)
            s1.push(st.pop());
        while (s1.size() != 0)
            s2.push(s1.pop());
        while (s2.size() != 0)
            st.push(s2.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        System.out.println("Original stack: " + st);

        reverseStack(st);

        System.out.println("After reverseStack: " + st);
    }
}
