import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNodesFromList {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        for (ListNode temp = head; temp != null; temp = temp.next) {
            if (temp == head)
                st.push(temp);
            else if (st.peek().val < temp.val) {
                while (!st.isEmpty() && st.peek().val < temp.val)
                    st.pop();
                st.push(temp);
            } else
                st.push(temp);
        }
        ListNode newhead = new ListNode(0);
        ListNode temp = newhead;
        while (!st.isEmpty()) {
            temp.next = st.pop();
            temp = temp.next;
        }
        temp.next = null;
        head = reverse(newhead.next);
        return head;
    }

    public static ListNode reverse(ListNode head) {
        ListNode c = head, f = head, p = null;
        while (f != null) {
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }

    // utility to print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1: [5,2,13,3,8]
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        System.out.println("Original list:");
        printList(head);

        RemoveNodesFromList sol = new RemoveNodesFromList();
        ListNode result = sol.removeNodes(head);

        System.out.println("Modified list:");
        printList(result);
    }
}
