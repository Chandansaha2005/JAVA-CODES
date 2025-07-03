public class Array_PassByReference {

    static int[] Refer(int a[]) {
        a[0] = 1;
        a[1] = 1;
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 8, 9, 6, 7 };
        Refer(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}