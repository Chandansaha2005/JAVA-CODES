import java.util.ArrayList;
import java.util.Stack;

public class NextLargerElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] array = new int[n];
        array[n - 1] = -1;

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            array[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        for (int i : array) {
            result.add(i);
        }
        return result;
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
