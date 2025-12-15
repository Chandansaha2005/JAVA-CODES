import java.util.ArrayList;
import java.util.Stack;

public class NextLargerElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i : arr) {
            if (!st.isEmpty() && st.peek() < i) {
                st.pop();
                st.push(i);
            } else if (st.peek() > i){
                st.pop();
                st.push(-1);
            }
        }
        while (!st.isEmpty())
            a.add(st.pop());
        return a;
    }

    public static void main(String[] args) {
        int[][] tests = {
                { 4, 5, 2, 25 },
                { 13, 7, 6, 12 },
                { 1, 3, 2, 4 },
                { 6, 8, 0, 1, 3 }
        };

        for (int[] test : tests) {
            ArrayList<Integer> result = nextLargerElement(test);
            System.out.print("Input: ");
            for (int x : test)
                System.out.print(x + " ");
            System.out.print("-> Output: ");
            System.out.println(result);
        }
    }
}
