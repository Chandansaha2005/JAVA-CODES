public class Array_Traversing_Printing {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 14;
        arr[1] = 8;
        arr[2] = 15;
        arr[3] = 31;
        arr[4] = 24;
        for (int i = 0; i < arr.length; i++) {// With for loop
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int a : arr) {// With for each loop
            System.out.print(a + " ");
        }
    }
}
