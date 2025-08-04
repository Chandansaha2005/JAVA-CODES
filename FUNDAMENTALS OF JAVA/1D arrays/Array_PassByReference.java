public class Array_PassByReference {

    // This method modifies the first two elements of the array
    static int[] Refer(int a[]) {
        a[0] = 1; // Set the first element to 1
        a[1] = 1; // Set the second element to 1
        return a; // Return the modified array
    }

    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] arr = { 2, 5, 4, 8, 9, 6, 7 };

        // Pass the array to the Refer method (pass by reference)
        Refer(arr);

        // Print each element of the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Output: 1 1 4 8 9 6 7
        }
    }
}
