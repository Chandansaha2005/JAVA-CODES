public class MiddleOfList{
    public static ListNode middleNode(ListNode head) {
        int size = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) size++;
        ListNode temp = head;
        for (int i = 0; i < size / 2; i++) temp = temp.next;
        return temp;
    }

    public static void printList(ListNode head) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(head);
        ListNode mid = middleNode(head);
        System.out.println("Middle node value: " + mid.val);
    }
}
