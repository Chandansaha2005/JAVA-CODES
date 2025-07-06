public class Array_FindIndexOfElement {

    static int[] searchRange(int[] a, int target) {
        int ans[] = { -1, -1 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                ans[0] = i;
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 9, 9, 2 };
        int x = 90;
        printArray(searchRange(arr, x));

    }
}
