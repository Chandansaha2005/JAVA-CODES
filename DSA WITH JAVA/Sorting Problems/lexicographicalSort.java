public class lexicographicalSort {
    static void lexicographical(String arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int s_min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[s_min]) < 0)
                    s_min = j;
            String temp = arr[s_min];
            arr[s_min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = { "papaya", "lime", "watermalon", "apple", "mango", "kiwi" };
        lexicographical(arr);
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}