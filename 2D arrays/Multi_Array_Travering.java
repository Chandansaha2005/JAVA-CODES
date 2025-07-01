public class Multi_Array_Travering {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
        int c = 0, d;
        while (c < arr.length) {
            d = 0;
            while (d < arr[c].length) {
                System.out.print(arr[d]);
                d++;
            }
            c++;
            System.out.println();
        }
    }
}
