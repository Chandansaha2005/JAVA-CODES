import java.util.Scanner;

class Algebra {
    int Add(int f, int s) {
        return f + s;
    }
}

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra ob = new Algebra();
        System.out.print("Enter the 1st number = ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number = ");
        int b = sc.nextInt();
        System.out.println("Addition = " + ob.Add(a, b));
        sc.close();
    }
}
