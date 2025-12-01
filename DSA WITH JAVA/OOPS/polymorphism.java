public class polymorphism {// same naam alag alag kaam
    public static class Dog {
        void speak() {
            System.out.println("Bhau Bhau");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("maww maww");
        }
    }

    public static class Pikachu {
        void speak() {
            System.out.println("pika pika pikachuuuuuuuuu");
        }
    }

    public static class Human {
        void speak() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Human chandu = new Human();
        Dog tommy = new Dog();
        Cat mini = new Cat();
        Pikachu pika = new Pikachu();

        chandu.speak();
        tommy.speak();
        mini.speak();
        pika.speak();
    }
}