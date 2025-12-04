import java.util.ArrayList;

public class arrayDublicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> dub = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            int idx = arr[i] - 1;
            if (arr[i] == arr[idx] || arr[i] == i + 1)
                i++;
            else {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                dub.add(arr[i]);
        }
        return dub;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2, 3 };
        ArrayList<Integer> ans = findDuplicates(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
