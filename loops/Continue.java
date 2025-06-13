public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0)
                continue; // For continue the multiples of 3 will not print but after each of them the
                          // rest of itaration will work
            System.err.print(i + " ");
        }
    }
}