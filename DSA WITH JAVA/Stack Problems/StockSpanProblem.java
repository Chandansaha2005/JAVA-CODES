import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<int[]> st = new Stack<>();
        int[] f = { arr[0], 0 };
        st.push(f);
        res.add(1);
        for (int i = 1; i < arr.length; i++) {
            int[] ele = { arr[i], i };
            while (!st.isEmpty() && arr[i] >= st.peek()[0])
                st.pop();
            if (st.isEmpty() == true)
                res.add(i - (-1));
            else
                res.add(i - st.peek()[1]);
            st.push(ele);
        }
        return res;
    }

    public static void main(String[] args) {
        StockSpanProblem calc = new StockSpanProblem();

        int[][] tests = {
                { 100, 80, 60, 70, 60, 75, 85 },
                { 10, 4, 5, 90, 120, 80 },
                { 31, 27, 14, 21, 30, 22 },
                { 100, 80, 60, 70, 60, 75, 85 },
                { 3, 7, 7, 6, 1, 2, 6, 3, 7, 5 }
        };

        for (int[] test : tests) {
            ArrayList<Integer> result = calc.calculateSpan(test);
            System.out.print("Input: ");
            for (int x : test)
                System.out.print(x + " ");
            System.out.print("-> Output: ");
            System.out.println(result);
        }
    }
}
