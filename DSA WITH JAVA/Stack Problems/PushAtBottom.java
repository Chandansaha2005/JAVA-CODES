import java.util.Stack;

public class PushAtBottom {
    public static void PushAtEnd(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int val = st.pop();
        PushAtEnd(st, x);
        st.push(val);
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

        PushAtEnd(st, 7);

        System.out.println("After reverseStack: " + st);
    }
}
