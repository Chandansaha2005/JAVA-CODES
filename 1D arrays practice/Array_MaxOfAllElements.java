public class Array_MaxOfAllElements {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 9, 6, }, p = 0;
        int max = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
                p = index;
            }
        }
        System.out.print("Maximum of All Elements = " + max + " At Index = " + p);
    }
}
