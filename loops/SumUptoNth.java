import java.util.Scanner;

public class SumUptoNth {
    public static void main(String[] args) {
        int i = 1, j = 1, k = 1, s = 0, sum = 0, add = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range = ");
        int n = sc.nextInt();
        while (i <= n) {                                        //WHILE-LOOP
            System.err.print(i + " ");
            s += i;
            i++;
        }
        System.out.println("\nSum from 1 to " + n + " = " + s);
        for (/* As j is initialized 1st */; j <= n; j++) {      //FOR-LOOP
            System.err.print(j + " ");
            sum += j;
        }
        System.out.println("\nSum from 1 to " + n + " = " + sum);
        do {                                                    //DO-WHILE-LOOP
            System.err.print(k + " ");
            add += k;
            k++;
        } while (k <= n);
        System.out.println("\nSum from 1 to " + n + " = " + add);
    }

}