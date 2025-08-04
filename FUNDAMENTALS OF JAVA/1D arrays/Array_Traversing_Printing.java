public class Array_Traversing_Printing {
    public static void main(String[] args) {
        // Declare and initialize an array with 5 integers
        int arr[] = new int[5];
        arr[0] = 14;
        arr[1] = 8;
        arr[2] = 15;
        arr[3] = 31;
        arr[4] = 24;

        // Traversing using a traditional for loop
        // Best for indexed access and modifying elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Traversing using for-each loop (enhanced for loop)
        // Best for read-only access to each element
        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        // Traversing using a while loop
        // Useful when you want more control over loop conditions
        int j = 0;
        while (j < arr.length) {
            System.out.print(arr[j] + " ");
            j++;
        }
    }
}
