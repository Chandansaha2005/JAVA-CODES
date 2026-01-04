import java.util.LinkedList;
import java.util.Queue;

public class OperationsMethods {
    private static void display(Queue<Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    private static int del(Queue<Integer> q, int idx) {
        int d = -1;
        for (int i = 0; i < q.size(); i++)
            if (i == idx)
                d = q.remove();
            else
                q.add(q.remove());
        return d;
    }

    private static int peekAtAny(Queue<Integer> q, int idx) {
        int d = -1;
        for (int i = 0; i < q.size(); i++)
            if (i == idx)
                d = q.peek();
            else
                q.add(q.remove());
        return d;
    }

    private static void insert(Queue<Integer> q, int idx, int val) {
        for (int i = 0; i < q.size(); i++)
            if (i == idx)
                q.add(val);
            else
                q.add(q.remove());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        display(q);
        System.out.println("Delete = " + del(q, 2) + " ");

        display(q);
        System.out.println("peeked = " + peekAtAny(q, 2) + " ");

        insert(q, 2, 50);
        display(q);
    }
}
