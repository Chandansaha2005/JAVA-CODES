
// Evil Number
// Definition: Number with even number of 1s in binary form.
// Example: 9 → Binary: 1001 → 2 ones → Evil
import java.util.Scanner;

public class Evil_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        int count = 0, binary = 0, place = 1;
        int decimal = num;

        while (decimal > 0) {
            int rem = decimal % 2;
            if (rem == 1)
                count++;
            binary = binary + (rem * place);
            place = place * 10;
            decimal = decimal / 2;
        }
        System.out.println(binary);

        if (count % 2 == 0)
            System.out.println(num + " is an Evil Number");
        else
            System.out.println(num + " is Not an Evil Number");
        sc.close();
    }

}
