public class PartitionLinkedList {
    public static ListNode partition(ListNode head, int x) {
        ListNode temp = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        ListNode i = head, k = temp ,j=temp2;
        while (i != null) {
            if (i.val < x) {
                k.next = i;
                i = i.next;
                k = k.next;
            }
            else{
                j.next=i;
                i=i.next;
                j=j.next;
            }
        }j.next=null;
        k.next=temp2.next;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        System.out.println("Original list:");
        printList(head);

        ListNode result = partition(head, 3);

        System.out.println("List after partition call:");
        printList(result);
    }
}
