class Confidential {
    private String info = "This is a private data";

    void getter() {
        System.out.print(info + "\n");
    }

    void setter(String s) {
        this.info = s;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Confidential con = new Confidential();
        // con.info="We can't change this";
        // System.out.println(con.info);
        con.getter();
        con.setter("Here We can change this");
        con.getter();
    }

}