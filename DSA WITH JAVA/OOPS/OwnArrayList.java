public class OwnArrayList {
    public static class Arraylist {
        int size = 0;
        int[] arr;

        Arraylist() {
        }

        Arraylist(int n) {
            arr = new int[n];
        }

        void expandlist() {
            int[] temp = new int[size * 2];
            for (int i = 0; i < size; i++)
                temp[i] = arr[i];
            arr = temp;
        }

        void add(int n) {
            if (size < arr.length)
                arr[size++] = n;
            else {
                expandlist();
                arr[size++] = n;
            }
        }

        void print() {
            System.out.print("ArrayList:--- ");
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
        }

        void insert(int pos, int val) {
            if (size < arr.length) {
                for (int i = size + 1; i >= pos; i--)
                    arr[i] = arr[i - 1];
                arr[pos - 1] = val;
                size++;
            } else {
                expandlist();
                for (int i = size + 1; i >= pos; i--)
                    arr[i] = arr[i - 1];
                arr[pos - 1] = val;
                size++;
            }
        }

        void remove(int val) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == val) {
                    for (int j = i; j < size; j++) {
                        arr[j] = arr[j + 1];
                    }
                    size--;
                    break;
                }
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
        list.insert(1, 70);
        list.remove(30);
        System.out.println("List Size:--- " + list.size);
        list.print();
    }
}
