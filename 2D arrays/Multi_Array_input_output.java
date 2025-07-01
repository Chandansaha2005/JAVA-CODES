public class Multi_Array_input_output {
    public static void main(String[] args) {
        int arr[][] = new int[2][4];
        int arr3[][][] = new int[2][2][2];
        arr[0][0] = 2;
        arr[0][1] = 5;
        arr[0][2] = 6;
        arr[0][3] = 7;
        arr[1][0] = 4;
        arr[1][1] = 3;
        arr[1][2] = 5;
        arr[1][3] = 9;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[0][3]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[1][3]);

        System.out.println();

        arr3[0][0][0] = 1;
        arr3[0][0][1] = 2;
        arr3[0][1][0] = 3;
        arr3[0][1][1] = 4;
        arr3[1][0][0] = 5;
        arr3[1][0][1] = 6;
        arr3[1][1][0] = 7;
        arr3[1][1][1] = 8;

        System.out.println(arr3[0][0][0]);
        System.out.println(arr3[0][0][1]);
        System.out.println(arr3[0][1][0]);
        System.out.println(arr3[0][1][1]);
        System.out.println(arr3[1][0][0]);
        System.out.println(arr3[1][0][1]);
        System.out.println(arr3[1][1][0]);
        System.out.println(arr3[1][1][1]);

    }
}