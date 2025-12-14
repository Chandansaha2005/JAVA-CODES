import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] op) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < op.length; i++) {
            c ch = op[i].charAt(0);
            if(ch.valueOf))
        }
        return 0;
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
