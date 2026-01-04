import java.util.LinkedList;
import java.util.Queue;

class FindTheWinner {
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            q.add(i + 1);
        System.out.println(q);
        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++)
                q.add(q.remove());
            q.remove();
        }
        return q.remove();
    }

    public static void main(String[] args) {
        // Sample test case 1
        int n1 = 5, k1 = 2;
        System.out.println("Test1 Output: " + findTheWinner(n1, k1));

        // Sample test case 2
        int n2 = 6, k2 = 5;
        System.out.println("Test2 Output: " + findTheWinner(n2, k2));

        // Sample test case 3 (edge case)
        int n3 = 1, k3 = 1;
        System.out.println("Test3 Output: " + findTheWinner(n3, k3));
    }
}
