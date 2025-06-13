import java.util.Scanner;

public class CentigradeToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Centrigrade scale = ");
        float c = sc.nextFloat();
        System.out.println("Farenheit Scale =" + ((c * (9.0 / 5)) + 32));
    }
}
