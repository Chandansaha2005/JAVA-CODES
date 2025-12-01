class ComplexNumber {
    int x = 0, y = 0;

    ComplexNumber() {
    }

    ComplexNumber(int x, int y) {
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

    void mul(ComplexNumber z) {
        System.out.print("\n" + (x * z.x - y * z.y) + "+ " + (x * z.y + z.x * y) + "i");
    }
}

public class ComplexNumberClass {

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5, 2);
        ComplexNumber cn2 = new ComplexNumber(5, 2);
        cn1.print();
        cn2.print();
        cn1.mul(cn2);
    }
}
