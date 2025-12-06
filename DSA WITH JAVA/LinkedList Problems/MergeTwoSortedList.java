public class MergeTwoSortedList {
    public static ListNode sortedMerge(ListNode head1, ListNode head2) {
        ListNode temp = new ListNode(0);
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

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        ListNode result = sortedMerge(head1, head2);

        System.out.println("List after sortedMerge call:");
        printList(result);
    }
}
