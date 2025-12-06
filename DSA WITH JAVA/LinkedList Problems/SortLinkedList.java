public class SortLinkedList {
    public static ListNode temp = new ListNode(0);

    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode k = temp, i = head1, j = head2;
        while (i != null && j != null) {
            if (i.val <= j.val) {
                k.next = i;
                i = i.next;
                k = k.next;
            } else {
                k.next = j;
                j = j.next;
                k = k.next;
            }
        }
        while (i != null) {
            k.next = i;
            i = i.next;
            k = k.next;
        }
        while (j != null) {
            k.next = j;
            j = j.next;
            k = k.next;
        }
        return temp.next;
    }

    public static ListNode mergeSort(ListNode head) {
        if (head.next == null)
            return head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head, head2);
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original list:");
        printList(head);
        ListNode result = mergeSort(head);

        System.out.println("List after mergeSort call:");
        printList(result);
    }
}
