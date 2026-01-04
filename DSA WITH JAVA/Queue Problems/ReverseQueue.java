import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q) {
        
    }

    public static void main(String[] args) {
        // Sample test case 1
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        System.out.println("Original Queue (q1): " + q1);
        reverseQueue(q1);
        System.out.println("After reverseQueue (q1): " + q1);

        // Sample test case 2 (single element)
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(10);
        System.out.println("Original Queue (q2): " + q2);
        reverseQueue(q2);
        System.out.println("After reverseQueue (q2): " + q2);

        // Sample test case 3 (empty queue)
        Queue<Integer> q3 = new LinkedList<>();
        System.out.println("Original Queue (q3): " + q3);
        reverseQueue(q3);
        System.out.println("After reverseQueue (q3): " + q3);
    }
}
