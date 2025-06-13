import java.util.Scanner;
public class FarenheitToCentrigrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Farenheit scale = ");
        float f = sc.nextFloat();
        System.out.println("Centrigrade Scale ="+((f-32)*(5.0/9)));
    }
}
