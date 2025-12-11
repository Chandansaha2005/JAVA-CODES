public class CriticalPointsInList {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = { -1, -1 };
        int f = -1, l = -1, p = -1, idx = 1;
        if (head == null || head.next == null || head.next.next == null)
            return arr;
        ListNode a = head, b = head.next, c = head.next.next;
        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val))
                if (f == -1)
                    f = idx;
                else {
                    p = l;
                    l = idx;
                }
            a = b;
            b = c;
            c = c.next;
            idx++;
        }
        arr[0] = l - p;
        arr[1] = l - f;
        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(1,
                                                        new ListNode(2)))))));

        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();

        int[] res = nodesBetweenCriticalPoints(head);
        for (int x : res)
            System.out.print(x + " ");
    }
}
