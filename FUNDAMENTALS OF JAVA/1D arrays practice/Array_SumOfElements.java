public class Array_SumOfElements {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3 }, s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.print("Sum of Elements = " + s);
    }
}
