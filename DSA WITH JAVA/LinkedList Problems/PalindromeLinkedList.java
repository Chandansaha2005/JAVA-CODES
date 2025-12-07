public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode rev = new ListNode(0);
        ListNode c = head, f = head;
        while (f != null) {
            f = c.next;
            ListNode n = new ListNode(c.val);
            n.next = rev;
            rev = n;
            c = f;
        }
        ListNode i = rev, j = head;
        while (i.next != null && j != null) {
            if (i.val != j.val)
                return false;
            i = i.next;
            j = j.next;
        }
        return true;
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
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Original list:");
        printList(head);

        boolean result = isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }
}
