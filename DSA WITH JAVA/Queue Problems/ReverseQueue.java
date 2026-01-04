import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty())
            s.push(q.remove());
        while (!s.isEmpty())
            q.add(s.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println("Original Queue (q1): " + q1);
        reverseQueue(q1);
        System.out.println("After reverseQueue (q1): " + q1);

        
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        System.out.println("Original Queue (q2): " + q2);
        reverseQueue(q2);
        System.out.println("After reverseQueue (q2): " + q2);

        
        Queue<Integer> q3 = new LinkedList<>();
        System.out.println("Original Queue (q3): " + q3);
        reverseQueue(q3);
        System.out.println("After reverseQueue (q3): " + q3);
    }
}
