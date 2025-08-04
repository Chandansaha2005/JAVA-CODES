import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);// ........................ arraylist.add()

        System.out.println(li.get(1));// arraylist.get()

        for (int i = 0; i < li.size(); i++) {// arraylist.size()
            System.out.print(li.get(i) + " ");
        }
        System.out.println();

        System.out.println(li);// arraylist to direct print

        li.add(1, 4);
        System.out.println(li);

        li.set(0, 10);
        System.out.println(li);

        li.remove(0);
        System.out.println(li);

        li.remove(Integer.valueOf(4));
        System.out.println(li);

        boolean f = li.contains(Integer.valueOf(6));
        System.out.println(f);

        

    }
}
