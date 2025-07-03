import java.util.Scanner;

public class Array_SecondLargestElement {
    static int maxValueinArray(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    static void secondLargestElemenet(int a[]) {
        int max = maxValueinArray(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = 0;
            }
        }
        System.out.print("The Second Largest Number In This Array = " + maxValueinArray(a));
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
        secondLargestElemenet(arr);
        sc.close();
    }
}
