class ComplexNumber {
    double x = 0, y = 0;

    ComplexNumber() {
    }

    ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y > 0)
            System.out.print("\n" + this.x + "+" + this.y + "i");
        else
            System.out.print("\n" + this.x + "-" + (-this.y) + "i");
    }

    void add(ComplexNumber z) {
        this.x += z.x;
        this.y += z.y;
    }

    void sub(ComplexNumber z) {
        this.x -= z.x;
        this.y -= z.y;
    }

    void mul(ComplexNumber z) {
        x = x * z.x - y * z.y;
        y = x * z.y + z.x * y;
    }

}

public class ComplexNumberClass {

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5, 2);
        ComplexNumber cn2 = new ComplexNumber(5, (-2));
        cn1.print();
        cn2.print();
        cn1.mul(cn2);
        cn1.print();
    }
}
