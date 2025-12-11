import java.util.ArrayList;

public class CriticalPointsInList {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = { -1, -1 };
        ArrayList<ListNode> cp = new ArrayList<>();
        if (head == null || head.next == null || head.next.next == null)
            return arr;
        ListNode a = head, b = head.next, c = head.next.next;
        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < b.val))
                cp.add(b);
        }
        System.err.println(cp);
        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(5)))));

        int[] res = nodesBetweenCriticalPoints(head);
        for (int x : res)
            System.out.print(x + " ");
    }
}
