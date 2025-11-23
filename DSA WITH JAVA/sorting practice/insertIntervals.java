import java.util.ArrayList;
import java.util.Arrays;

public class insertIntervals {
    static int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[] { intervals[0][0], intervals[0][1] });
        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size() - 1);
            if (newInterval[0] <= last[1]) {
                last[1] = Math.max(last[1], newInterval[1]);
            } else {
                res.add(new int[] { newInterval[0], newInterval[1] });
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 5, 8 } };
        int[] newarr = { 2, 4 };
        int[][] insertd = insert(arr, newarr);
        for (int[] interval : insertd) {
            for (int val : interval) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
