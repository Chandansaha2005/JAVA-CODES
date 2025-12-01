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

    void add(ComplexNumber cn2) {
        this.x += cn2.x;
        this.y += cn2.y;
    }

    void mul(ComplexNumber cn2) {
        this.x *= cn2.x;
        this.y *= cn2.y;
    }
}

public class ComplexNumberClass {

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5, 2);
        ComplexNumber cn2 = new ComplexNumber(5, 2);
        cn1.print();
        cn2.print();
        cn1.add(cn2);
        cn1.print();
    }
}
