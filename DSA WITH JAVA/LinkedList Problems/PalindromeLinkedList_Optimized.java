public class PalindromeLinkedList_Optimized {
    public static boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        ListNode curr = s, fwd = s, prev = null;
        while (fwd != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        while (prev != null && head != null) {
            if (prev.val != head.val)
                return false;
            prev = prev.next;
            head = head.next;
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
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);

        System.out.println("Original list:");
        printList(head);

        boolean result = isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }

}
