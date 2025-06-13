import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of ram = ");
        int ram = sc.nextInt();
        System.out.print("Enter the age of shyam = ");
        int shyam = sc.nextInt();
        System.out.print("Enter the age of ajay = ");
        int ajay = sc.nextInt();

        if (ram > shyam && shyam > ajay) {
            System.out.println("Ajay is youngest");
        } else if (shyam > ram && ajay > ram) {
            System.out.println("Ram is youngest");
        } else {
            System.out.println("Shyam is youngest");
        }
    }
}
