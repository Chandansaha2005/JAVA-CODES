import java.util.Stack;

public class ReverseAStack_Recursive {
    public static void reverseStack(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        reverseStack(st);
        PushAtEnd(st, top);
    }

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

        reverseStack(st);

        System.out.println("After reverseStack: " + st);
    }
}
