import java.util.Arrays;

public class removeIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0, last = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < last)
                count++;
            else
                last = intervals[i][1];
        }
        return count;
    }

    public void display(int result) {
        System.out.println("Number of intervals to remove: " + result);
    }

    public static void main(String[] args) {
        removeIntervals eraser = new removeIntervals();
        int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        int result = eraser.eraseOverlapIntervals(intervals);
        eraser.display(result);
    }
}
