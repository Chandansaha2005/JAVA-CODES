
//Count the number of triplets whose sum is equal to the given value "t"
import java.util.Scanner;

public class Array_ThreeElementSum {
    static void targetSum(int a[], int t) {
        int f = 0;
        System.out.println("Pairs Whose Sum = " + t + " :-");
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == t) {
                        System.out.println("(" + a[i] + "," + a[j] + "," + a[k] + ")");
                        f++;
                    }
                }
            }
        }
        if (f == 0) {
            System.out.print("No pair found");
        } else
            System.out.print(f + " pair found");
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
        System.out.print("Enter the Target = ");
        int t = sc.nextInt();
        targetSum(arr, t);
        sc.close();
    }
}
