import java.util.ArrayList;

public class MergeKSortedLists_Optimized {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ArrayList<ListNode> arr1 = new ArrayList<>();
        ArrayList<ListNode> arr2 = new ArrayList<>();
        for (ListNode l : lists)
            arr1.add(l);
        while (arr1.size() + arr2.size() > 1) {
            // arr1 → arr2
            while (!arr1.isEmpty()) {
                if (arr1.size() == 1) {
                    arr2.add(arr1.get(0));
                    arr1.clear();
                    break;
                }
                ListNode a = arr1.remove(arr1.size() - 1);
                ListNode b = arr1.remove(arr1.size() - 1);
                arr2.add(mergeTwoLists(a, b));
            }
            // arr2 → arr1
            while (!arr2.isEmpty()) {
                if (arr2.size() == 1) {
                    arr1.add(arr2.get(0));
                    arr2.clear();
                    break;
                }
                ListNode a = arr2.remove(arr2.size() - 1);
                ListNode b = arr2.remove(arr2.size() - 1);
                arr1.add(mergeTwoLists(a, b));
            }
        }
        return arr1.size() == 1 ? arr1.get(0) : arr2.get(0);
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode temp = new ListNode(-1);
        ListNode t = temp;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        t.next = (a != null) ? a : b;
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
        // Example: three sorted linked lists
        ListNode head1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode l4 = new ListNode(2, new ListNode(6));

        ListNode[] lists = { head1, head2, l3, l4 };

        System.out.println("Original lists:");
        printList(head1);
        printList(head2);
        printList(l3);
        printList(l4);

        ListNode head = mergeKLists(lists);

        System.out.println("Merged list:");
        printList(head);
    }
}
