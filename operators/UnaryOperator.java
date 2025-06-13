public class UnaryOperator {
    public static void main(String[] args) {
        int a = 5, b = 10, c = -15;

        // + Unary Plus Operator
        System.out.println("a=" + a);// 5
        System.out.println("b=" + b);// 10

        // - Unary Minus Operator
        System.out.println("c=" + c);// -15

        // ++ Increment Operator

        // a++ Post Increment
        System.out.println(a++);// 5
        System.out.println(a);// 6
        int x = a++;// 6
        System.out.println(x);// 6

        // ++b Pre Increment
        System.out.println(++b);// 11
        System.out.println(b);// 11
        int y = ++b;// 12
        System.out.println(y);// 12

        // -- Decrement Operator

        // a-- Post Decrement
        System.out.println(a--);// 7
        System.out.println(a);// 6
        int p = a--;// 6
        System.out.println(p);// 6

        // ++b Pre Decrement
        System.out.println(--b);// 11
        System.out.println(b);// 11
        int q = --b;// 10
        System.out.println(q);// 10

    }
}
