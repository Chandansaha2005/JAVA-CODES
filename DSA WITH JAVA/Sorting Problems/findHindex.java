import java.util.Arrays;

public class findHindex {
    static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;
        while (idx < n && citations[n - 1 - idx] > idx)
            idx++;
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 5, 3, 0 };
        System.out.println(hIndex(arr));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
