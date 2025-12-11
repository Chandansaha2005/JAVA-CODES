public class CopyRandomListRunner {
    public static Rode copyRandomList(Rode head) {
        if (head == null)
            return head;
        Rode copy = new Rode(-1);
        Rode t1 = head, t2 = copy;

        // copy without rands
        while (t1 != null) {
            Rode n = new Rode(t1.val);
            t2.next = n;
            t1 = t1.next;
            t2 = t2.next;
        }

        // merge in one
        Rode merge = new Rode(-1);
        Rode t = merge;
        t1 = head;
        t2 = copy.next;
        while (t1 != null && t2 != null) {
            t.next = t1;
            t1 = t1.next;
            t = t.next;
            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }

        // Now Assign Rands

        t1 = merge.next;
        t2 = t1.next;

        while (t1 != null && t2 != null) {
            if (t1.random != null)
                t2.random = t1.random.next;
            else
                t2.random = t1.random;
            t1 = t1.next.next;
            if (t2.next != null)
                t2 = t2.next.next;
        }

        // extracting deepcopy
        Rode deepcopy = new Rode(0);
        Rode orignal = new Rode(0);
        t1 = orignal;
        t2 = deepcopy;
        t = merge.next;
        while (t != null) {
            t1.next = t;
            t1 = t1.next;
            t = t.next;

            t2.next = t;
            t2 = t2.next;
            t = t.next;
        }
        t1.next = null;
        t2.next = null;

        return deepcopy.next;
    }

    public static void main(String[] args) {
        Rode a = new Rode(7);
        Rode b = new Rode(13);
        Rode c = new Rode(11);
        Rode d = new Rode(10);
        Rode e = new Rode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        Rode copy = copyRandomList(a);

        Rode p = a;
        while (p != null) {
            System.out.print("(" + p.val + "," + (p.random != null ? p.random.val : -1) + ") ");
            p = p.next;
        }
        System.out.println();

        Rode q = copy;
        while (q != null) {
            System.out.print("(" + q.val + "," + (q.random != null ? q.random.val : -1) + ") ");
            q = q.next;
        }
    }
}

class Rode {
    int val;
    Rode next;
    Rode random;

    Rode(int val) {
        this.val = val;
    }
}
