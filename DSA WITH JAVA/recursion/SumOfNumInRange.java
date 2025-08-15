public class SumOfNumInRange {
    static int sum(int start, int end) {
        if (start == end)
            return end;
        return start + sum(start + 1, end);
    }

    public static void main(String[] args) {
        System.out.print("Sum = " + sum(1, 5));
    }
}
