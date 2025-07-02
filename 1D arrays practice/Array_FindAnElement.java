public class Array_FindAnElement {
    static int Find(int a[], int f) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 9, 8, 2 };
        int x = 9;
        if (Find(arr, x) > -1) {
            System.out.print(x + " Found At index " + Find(arr, x));
        } else
            System.out.print("Not Found");
    }
}
