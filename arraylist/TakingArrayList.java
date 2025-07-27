import java.util.ArrayList;

public class TakingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
    }
}
