import java.util.ArrayList;
import java.util.Arrays;

public class overlappingIntervals {

    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] curr = intervals[i];
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                res.add(new int[]{curr[0], curr[1]});
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 4 }, { 5, 8 } };
        int[][] merged = merge(arr);
        for (int[] interval : merged) {
            for (int val : interval) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
