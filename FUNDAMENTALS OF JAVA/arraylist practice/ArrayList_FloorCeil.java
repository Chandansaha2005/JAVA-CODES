import java.util.ArrayList;

public class ArrayList_FloorCeil {
    static ArrayList<Integer> divFloorCeil(int a, int b) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add((int) Math.floor((double)a / b));
        res.add((int) Math.ceil((double)a / b));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(divFloorCeil(-7, 2));
    }
}
