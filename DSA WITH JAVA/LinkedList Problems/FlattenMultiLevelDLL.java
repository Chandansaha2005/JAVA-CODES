class Mode {
    int data;
    Mode next;
    Mode prev;
    Mode child;

    Mode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
        this.child = null;
    }
}

public class FlattenMultiLevelDLL {

    public static Mode flatten(Mode head) {
        // solve here later
        return head;
    }

    public static void printList(Mode head) {
        Mode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Mode sample() {
        /*
         * Example:
         * 1 - 2 - 3 - 4
         * |
         * 7 - 8
         * |
         * 9
         */

        Mode n1 = new Mode(1);
        Mode n2 = new Mode(2);
        Mode n3 = new Mode(3);
        Mode n4 = new Mode(4);
        Mode n7 = new Mode(7);
        Mode n8 = new Mode(8);
        Mode n9 = new Mode(9);

        // main level
        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        // child level
        n2.child = n7;

        n7.next = n8;
        n8.prev = n7;

        n8.child = n9;

        return n1;
    }

    public static void main(String[] args) {

        Mode head = sample();

        System.out.println("Original (multilevel) list:");
        printList(head);
        // printing only top level, child list dekha jabe na - as expected

        Mode flat = flatten(head);

        System.out.println("Flattened list:");
        printList(flat);
    }
}
