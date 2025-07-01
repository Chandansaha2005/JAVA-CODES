public class Multi_Array_Travering {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        // With for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // With for each loop
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
        // With while loop
        int c = 0, d = 0;
        while (c < arr.length) {
            d = 0;
            while (d < arr[c].length) {
                System.out.print(arr[c][d] + " ");
                d++;
            }
            c++;
            System.out.println();
        }
    }
}
