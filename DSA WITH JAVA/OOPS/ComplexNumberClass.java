class ComplexNumber {
    double x = 0, y = 0;

    ComplexNumber() {}

    ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y >= 0)
            System.out.print("\n" + this.x + "+" + this.y + "i");
        else
            System.out.print("\n" + this.x + "" + this.y + "i");
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
        double tempX = x * z.x - y * z.y;
        double tempY = x * z.y + y * z.x;
        x = tempX;
        y = tempY;
    }

    void divide(ComplexNumber z) {
        double denominator = z.x * z.x + z.y * z.y;
        double tempX = (x * z.x + y * z.y) / denominator;
        double tempY = (y * z.x - x * z.y) / denominator;
        x = tempX;
        y = tempY;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5, 2);
        ComplexNumber cn2 = new ComplexNumber(5, -2);
        cn1.print();
        cn2.print();
        cn1.divide(cn2);
        cn1.print();
    }
}
