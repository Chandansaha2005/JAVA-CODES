class MaximalRectangleInMatrix{
    public static int maximalRectangle(char[][] matrix) {
        // TODO: implement logic
        return 0; // placeholder
    }

    public static void main(String[] args) {
        // Sample test case 1
        char[][] matrix1 = {
                { '1', '0', '1', '0', '0' },
                { '1', '0', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' }
        };
        System.out.println("Test1 Output: " + maximalRectangle(matrix1));

        // Sample test case 2 (empty matrix)
        char[][] matrix2 = {};
        System.out.println("Test2 Output: " + maximalRectangle(matrix2));

        // Sample test case 3 (single row)
        char[][] matrix3 = {
                { '1', '1', '1', '1' }
        };
        System.out.println("Test3 Output: " + maximalRectangle(matrix3));
    }
}
