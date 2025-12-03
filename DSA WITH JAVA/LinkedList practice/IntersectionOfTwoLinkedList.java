public class IntersectionOfTwoLinkedList {
    public static ListNode intersectPoint(ListNode headA, ListNode headB) {
        int h1 = 0, h2 = 0;
        for (ListNode temp = headA; temp != null; temp = temp.next)
            h1++;
        for (ListNode temp = headB; temp != null; temp = temp.next)
            h2++;
        ListNode start1 = headA, start2 = headB;
        if (h1 > h2)
            for (int i = 0; i < h1 - h2; i++)
                start1 = start1.next;
        else if (h1 < h2)
            for (int i = 0; i < h2 - h1; i++)
                start2 = start2.next;
        for (; start1 != null; start1 = start1.next, start2 = start2.next)
            if (start1 == start2)
                return start1;
        return null;
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
        ListNode common = new ListNode(15);
        common.next = new ListNode(30);

        // First list: 10 -> 15 -> 30
        ListNode headA = new ListNode(10);
        headA.next = common;

        // Second list: 3 -> 6 -> 9 -> 15 -> 30
        ListNode headB = new ListNode(3);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(9);
        headB.next.next.next = common; // creating an intersection at Listnode with value 3

        System.out.println("List 1:");
        printList(headA);

        System.out.println("List 2:");
        printList(headB);

        ListNode intersection = intersectPoint(headA, headB);
        System.out.println("Intersection point: " + (intersection != null ? intersection.val : "None"));
    }
}
