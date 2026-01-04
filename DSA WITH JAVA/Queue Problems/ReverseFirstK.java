import java.util.*;

public class ReverseFirstK {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if (k > n)
            return q;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++)
            s.push(q.remove());
        for (int i = 0; i < n; i++)
            if (i < k)
                q.add(s.pop());
            else
                q.add(q.remove());
        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println("Original Queue (q1): " + q1);
        Queue<Integer> result1 = reverseFirstK(q1, 3);
        System.out.println("After reverseFirstK(q1, 3): " + result1);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        System.out.println("Original Queue (q2): " + q2);
        Queue<Integer> result2 = reverseFirstK(q2, 1);
        System.out.println("After reverseFirstK(q2, 1): " + result2);

    }
}
