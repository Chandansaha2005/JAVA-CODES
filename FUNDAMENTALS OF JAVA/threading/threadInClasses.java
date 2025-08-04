class parent implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I's value = " + i);
        }
    }
}

public class threadInClasses {
    public static void main(String[] args) {
        parent ob = new parent();
        Thread ob1 = new Thread(ob);
        ob1.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Main's value = " + i);
        }
    }
}
