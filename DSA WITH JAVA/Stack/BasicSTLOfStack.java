import java.util.Stack;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st);
        st.push(20);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.size());

        System.out.println(st);
    }
}
