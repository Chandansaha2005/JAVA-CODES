import java.util.ArrayList;

public class Arraylist_Reverse {
    static void rev(ArrayList<Integer> all) {
        int i = 0, j = all.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(all.get(i));
            all.set(i, all.get(j));
            all.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        for (int i = 0; i < 10; i++, all.add(i)) {
        }
        System.out.println(all);
        // System.out.println(all.reversed());
        rev(all);
        System.out.println(all);
    }
}
