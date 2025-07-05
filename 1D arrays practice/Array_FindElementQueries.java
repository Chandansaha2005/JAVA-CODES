import java.util.Scanner;

public class Array_FindElementQueries {
    static int frr[] = new int[100000];

    static void addToFrr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            frr[a[i]]++;
        }
    }

    static void Queries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Queries = ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter the number you want to search = ");
            int x = sc.nextInt();
            if (frr[x] > 0) {
                System.out.println(x + " is Present");
            } else {
                System.out.println(x + " is Not Present");
            }
        }
        sc.close();
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Element(s)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        addToFrr(arr);
        Queries();
        sc.close();
    }
}
