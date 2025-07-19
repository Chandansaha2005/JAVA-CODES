public class threadDeclare {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.currentThread());
        t.setName("Rabindra");
        System.out.println(t);
        t.setPriority(10);
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}