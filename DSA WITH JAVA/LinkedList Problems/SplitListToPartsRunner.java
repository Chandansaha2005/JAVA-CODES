public class SplitListToPartsRunner {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        int len = 0;
        for (ListNode i = head; i != null; i = i.next)
            len++;
        if (len < k) {
            int e = 0;
            ListNode temp = head;
            while (temp != null) {
                ListNode a = temp;
                temp = temp.next;
                a.next = null;
                arr[e] = a;
                e++;
            }
        } else {
            int p = len / k, rem = len % k, idx = 0;
            for (ListNode i = head; i != null;) {
                ListNode a = i, d = i;
                int e = 1;
                if (rem != 0) {
                    while (e < p + 1 && a != null) {
                        a = a.next;
                        e++;
                    }
                    rem--;
                } else {
                    while (e < p && a != null) {
                        a = a.next;
                        e++;
                    }
                }
                ListNode b = null;
                if (a.next != null)
                    b = a.next;
                a.next = null;
                arr[idx] = d;
                idx++;
                i = b;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(5,
                                        new ListNode(6)))));

        int k = 3;

        ListNode[] parts = splitListToParts(head, k);

        for (int i = 0; i < parts.length; i++) {
            ListNode p = parts[i];
            while (p != null) {
                System.out.print(p.val + " ");
                p = p.next;
            }
            System.out.println();
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
