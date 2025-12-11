public class CriticalPointsInList {
    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = { -1, -1 };
        int f = -1, l = -1, min = Integer.MAX_VALUE, idx = 1;
        ListNode a = head, b = head.next, c = head.next.next;
        if (c == null)
            return arr;
        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)) {
                if (f == -1)
                    f = idx;
                if (l != -1)
                    min = Math.min(min, idx - l);
                l = idx;
            }
            a = b;
            b = c;
            c = c.next;
            idx++;
        }
        int max = l - f;
        arr[0] = (min == Integer.MAX_VALUE) ? -1 : min;
        arr[1] = (max == 0) ? -1 : max;
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
