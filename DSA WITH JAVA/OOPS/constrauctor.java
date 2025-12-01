public class constrauctor {
    public static class Pokemon {
        String name;
        String type;
        int version = 1;// default

        Pokemon() {// default constructor

        }

        Pokemon(String n, String t, int v) {// paramiterized constructor
            name = n;
            type = t;
            version = v;
        }

        void getInfo() {
            System.out.println("NAME: " + name + "\nType: " + type + "\nVersion No.: " + version + "\n");
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "electric", 2);
        pikachu.getInfo();
        Pokemon charizard = new Pokemon("fire", "Charizard", 3);
        charizard.getInfo();
    }
}
