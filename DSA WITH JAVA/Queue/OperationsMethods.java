import java.util.LinkedList;
import java.util.Queue;

public class OperationsMethods {
    private static void display(Queue<Integer> q) {
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }

    private static int del(Queue<Integer> q) {
        System.out.print("Delete = " + q.peek() + " ");
        return q.remove();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        display(q);
        del(q);
    }
}
