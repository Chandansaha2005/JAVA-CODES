/*Given an array of integers arr[]. You have to find the Inversion Count of the array. 
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count. */

public class countInversions {

    //using merge sort
    

    // Brute Force (n^2)
    // static int inversions(int[] arr) {
    // int count = 0;
    // for (int i = 0; i < arr.length - 1; i++)
    // for (int j = i; j < arr.length; j++)
    // if (arr[i] > arr[j]) count++;
    // return count;
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(inversions(arr));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
