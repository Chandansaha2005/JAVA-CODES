import java.util.ArrayList;

public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // placeholder
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        StockSpanProblem calc = new StockSpanProblem();

        int[][] tests = {
            {100, 80, 60, 70, 60, 75, 85},
            {10, 4, 5, 90, 120, 80},
            {31, 27, 14, 21, 30, 22}
        };

        for (int[] test : tests) {
            ArrayList<Integer> result = calc.calculateSpan(test);
            System.out.print("Input: ");
            for (int x : test) System.out.print(x + " ");
            System.out.print("-> Output: ");
            System.out.println(result);
        }
    }
}
