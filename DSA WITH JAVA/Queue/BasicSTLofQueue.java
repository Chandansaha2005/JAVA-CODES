import java.util.LinkedList;
import java.util.Queue;

public class BasicSTLofQueue {
    public static void main(String[] args) {
        // In this Java code snippet, `Queue<Integer> q = new LinkedList<>();` is
        // creating a queue
        // named `q` that can hold integer values. The `LinkedList<>` part is
        // initializing the queue
        // using a linked list implementation. This line is creating an instance of a
        // queue using the
        // LinkedList class, which allows you to add elements to the queue and
        // manipulate them in a
        // FIFO (First-In-First-Out) order.
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println("Removing " + q.remove());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println("Removing " + q.remove());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println("Removing " + q.remove());
        System.out.println(q);
        
        System.out.println(q.peek());
        System.out.println("Removing " + q.remove());
        System.out.println(q);
    }
}
