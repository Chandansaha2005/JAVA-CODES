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
            System.out.print(this.x + "+" + "i" + this.y);
        else
            System.out.print(this.x + "-" + "i" + (-this.y));
    }

    void add() {
        System.out.print("\nAddition = " + (this.x + (Math.sqrt(1) * this.y)));
    }

    void mul() {
        System.out.print("Addition = " + (this.x + (Math.sqrt(1) * this.y)));
    }
}

public class ComplexNumberClass {

    public static void main(String[] args) {
        ComplexNumber c = new ComplexNumber(5, 2);
        c.print();
        c.add();
    }
}
