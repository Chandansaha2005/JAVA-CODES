import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_StringSortDcen {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int[][] a = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        s.add("my");
        s.add("name");
        s.add("is");
        s.add("chandan");
        System.out.println(s);
        Collections.sort(s);
        Collections.reverse(s);
        System.out.println(s);
        for (int[] i : a) {
            for (int js : i) {
                arr.add(js);
            }
        }
    }
}
