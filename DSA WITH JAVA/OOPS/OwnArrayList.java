public class OwnArrayList {
    public static class Arraylist {
        int size = 0;
        int[] arr;

        Arraylist() {
        }

        Arraylist(int n) {
            arr = new int[n];
        }

        void add(int n) {
            if (size < arr.length)
                arr[size++] = n;
            else {
                expandlist();
                arr[size++] = n;
            }
        }

        void expandlist() {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }

        void print() {
            System.out.print("ArrayList:--- ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Arraylist list = new Arraylist(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("List Size:--- " + list.size);
        list.print();
    }
}
