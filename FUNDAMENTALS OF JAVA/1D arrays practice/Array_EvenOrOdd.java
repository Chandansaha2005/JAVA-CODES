import java.util.Scanner;

public class Array_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = { "Even", "Odd" };
        System.out.println(arr[(n % 2)]);
        sc.close();
    }
}
