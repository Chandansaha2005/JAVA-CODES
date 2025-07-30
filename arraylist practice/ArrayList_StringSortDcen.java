import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_StringSortDcen {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("my");
        s.add("name");
        s.add("is");
        s.add("chandan");
        System.out.println(s);
        Collections.sort(s);
        Collections.reverse(s);
        System.out.println(s);
    }
}

