class Calculation {
    int a, b;

    Calculation(int x, int y) {
        a = x;
        b = y;
    }

    int Addition() {
        return a + b;
    }

    int Subtraction() {
        return a - b;
    }

    int Multiplecation() {
        return a * b;
    }

    int Divition() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculation num0 = new Calculation(12, 6);

        System.out.println(num0.Addition());
        System.out.println(num0.Subtraction());
        System.out.println(num0.Divition());
        System.out.println(num0.Multiplecation());

        System.out.println(" ");

        Calculation num1 = new Calculation(18, 6);

        System.out.println(num1.Addition());
        System.out.println(num1.Subtraction());
        System.out.println(num1.Divition());
        System.out.println(num1.Multiplecation());

    }
}
