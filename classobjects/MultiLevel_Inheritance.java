import java.util.Scanner;

class MultiLevel_Inheritance_Parent {
    int a, b, sum;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number = ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number = ");
        b = sc.nextInt();
        sc.close();
    }

    public void add() {
        sum = a + b;
    }
}

class Child1 extends MultiLevel_Inheritance_Parent {
    int sub;

    public void subtract() {
        sub = a - b;
    }
}

class Child2 extends Child1 {
    int mul;

    public void multi() {
        mul = a * b;
    }
}

class Child3 extends Child2 {
    int div;

    public void divide() {
        div = a / b;
    }

    public void show() {
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplecation = " + mul);
        System.out.println("Division = " + div);
    }
}

public class MultiLevel_Inheritance extends Child3 {
    public static void main(String[] args) {
        MultiLevel_Inheritance ob = new MultiLevel_Inheritance();
        ob.input();
        ob.add();
        ob.subtract();
        ob.multi();
        ob.show();
    }

}