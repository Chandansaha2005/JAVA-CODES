public class constrauctor {
    public static class Pokemon {
        String name;
        String type;
        int version;

        Pokemon(String n, String t, int v) {
            name = n;
            type = t;
            version = v;
        }

        void getInfo() {
            System.out.println("NAME: " + name + "\nType: " + type + "\nVersion No.: " + version + "\n");
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("pikachu", "electric", 2);
        pikachu.getInfo();
    }
}
