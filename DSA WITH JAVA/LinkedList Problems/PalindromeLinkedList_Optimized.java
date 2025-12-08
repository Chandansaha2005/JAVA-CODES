public class PalindromeLinkedList_Optimized {
    public static boolean isPalindrome(Node head) {
        Node s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        Node curr = s, fwd = s, prev = null;
        while (fwd != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        while (prev != null && head != null) {
            if (prev.data != head.data)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);

        System.out.println("Original list:");
        printList(head);

        boolean result = isPalindrome(head);

        System.out.println("Is palindrome? " + result);
    }

}
