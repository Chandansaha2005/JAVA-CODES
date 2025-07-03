import java.util.Scanner;

public class Array_SecondLargestElement {
    static int maxValueinArray(a[]){
        int max = a[0];
        for (int index = 1; index < a.length; index++) {
            if(a[i]>max){
                a[i]=max;
            }
        }
    }

    static void secondLargestElemenet(int a[]) {

        System.out.print("The Second Largest Number In This Array = " + a[a.length - 2]);
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
