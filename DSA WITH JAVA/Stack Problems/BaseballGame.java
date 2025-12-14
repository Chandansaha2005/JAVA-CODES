import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < op.length; i++) {
            String ch = op[i];
            if (ch.equals("C"))
                st.pop();
            else if (ch.equals("D"))
                st.push(st.peek() * 2);
            else if (ch.equals("+")) {
                int v1 = st.pop();
                int n = v1 + st.peek();
                st.push(v1);
                st.push(n);
            } else
                st.push(Integer.parseInt(ch));
        }
        int sum = 0;
        while (!st.isEmpty()) 
            sum += st.pop();
        return sum;
    }

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();

        String[][] tests = {
                { "5", "2", "C", "D", "+" },
                { "5", "-2", "4", "C", "D", "9", "+", "+" },
                { "1", "C" },
                { "10", "20", "30", "+", "D", "C" }
        };

        for (String[] ops : tests) {
            int result = game.calPoints(ops);
            System.out.print("Operations: ");
            for (String op : ops)
                System.out.print(op + " ");
            System.out.println("-> Result: " + result);
        }
    }
}
