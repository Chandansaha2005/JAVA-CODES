public class Array_Declaration {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}