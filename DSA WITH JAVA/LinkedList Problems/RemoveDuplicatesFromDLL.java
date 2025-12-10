public class RemoveDuplicatesFromDLL {
    static Dnode removeDuplicates(Dnode head) {
        if (head.next == null)
            return head;
        Dnode i = head;
        while (i != null) {
            Dnode j = i.next;
            while (j != null && j.data == i.data)
                j = j.next;
            i.next = j;
            if (j != null)
                j.prev = i;
            i = j;
        }
        return head;
    }

    public static void main(String[] args) {

        // sample input: 1 2 2 3 3 4
        int[] arr = { 1, 1, 1, 2, 3, 4 };

        Dnode head = buildDLL(arr);
        printDLL(head);
        Dnode newHead = removeDuplicates(head);

        printDLL(newHead);
    }

    static Dnode buildDLL(int[] arr) {
        if (arr.length == 0)
            return null;

        Dnode head = new Dnode(arr[0]);
        Dnode curr = head;

        for (int i = 1; i < arr.length; i++) {
            Dnode temp = new Dnode(arr[i]);
            curr.next = temp;
            temp.prev = curr;
            curr = temp;
        }

        return head;
    }

    static void printDLL(Dnode head) {
        Dnode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
