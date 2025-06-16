class Add {
    int a;
    int b;

    int Addition(int a, int b) {
        return a + b;
    }
}

class Sub {
    int a;
    int b;

    int Subtraction(int a, int b) {
        return a - b;
    }
}

class Mul {
    int a;
    int b;

    int Multiplecation(int a, int b) {
        return a * b;
    }
}

class Div {
    int a;
    int b;

    int Divition(int a, int b) {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Add num0 = new Add();
        Sub num1 = new Sub();
        Mul num2 = new Mul();
        Div num3 = new Div();

        num0.a = 10;
        num0.b = 5;
        System.out.println(num0.Addition(num0.a, num0.b));

        num1.a = 10;
        num1.b = 5;
        System.out.println(num1.Subtraction(num1.a, num1.b));

        num2.a = 10;
        num2.b = 5;
        System.out.println(num2.Multiplecation(num2.a, num2.b));

        num3.a = 10;
        num3.b = 5;
        System.out.println(num3.Divition(num3.a, num3.b));
    }
}
