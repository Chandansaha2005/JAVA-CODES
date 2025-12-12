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
            int p = len / k, e = 0, idx = 0;
            for (ListNode i = head; i != null; i = i.next) {
                ListNode a = i;
                while (e != p) {
                    a = a.next;
                    e++;
                }
                ListNode b = a.next;
                a.next = null;
                arr[idx] = i;
                idx++;
                i = b;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6,
                                                        new ListNode(7)))))));

        int k = 5;

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
