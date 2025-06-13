import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- GREATEST NUMBER & SMALLEST NUMBER -----");
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number = ");
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.err.println("1st number is Greatest & 3rd is smallest");
        } else if (b > a && a > c) {
            System.err.println("2nd number is Greatest & 3rd is smallest");
        } else if (c > b && b > a) {
            System.err.println("3rd number is Greatest & 1st is smallest");
        } else if (b > c && c > a) {
            System.err.println("2nd number is Greatest & 1st is smallest");
        } else if (a > c && c > b) {
            System.err.println("1st number is Greatest & 2nd is smallest");
        } else if (c > a && a > b) {
            System.err.println("2nd number is Greatest & 2nd is smallest");
        } else if (a == b && a > c) {
            System.out.println("1st & 2nd number is same & Greatest & 3rd number is smallest");
        } else if (c == b && b > a) {
            System.out.println("2nd & 3rd number is same & Greatest & 1st number is smallest");
        } else if (a == c && c > b) {
            System.out.println("1st & 3rd number is same & Greatest & 2nd number is smallest");
        } else if (a == b && a < c) {
            System.out.println("3rd number is Greatest & 1st & 2nd number is same & smallest");
        } else if (c == b && b < a) {
            System.out.println("1st number is Greatest & 2nd & 3rd number is same & smallest");
        } else if (a == c && c < b) {
            System.out.println("2nd number is Greatest & 1st & 3rd number is same & smallest");
        } else {
            System.out.println("All are same");
        }

    }
}
