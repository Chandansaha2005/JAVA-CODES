import java.util.Scanner;

public class Array_RotationViseVersa {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        if(n==0) return;
        d=((d%n)+n)%n;
        if(d==0) return;

        rev(0,d-1,arr);
        rev(d,n-1,arr);
        rev(0,n-1,arr);
        
    }
    static void rev(int a ,int b ,int arr[]){
        for(int i = a,j=b;i<j;i++,j--){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    static void printArray(int a[]) {
        System.out.print("\nArray = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element = ");
        int n = sc.nextInt();
        int arr[] = new int[n], k;
        System.out.print("Enter the Element(s)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.print("Enter The Number of Rotation you want = ");
        k = sc.nextInt();
        System.out.println("After " + k + " Rotation :-");
        // for (int i = 0; i < k; i++) {
        // printArray(RotateArray(arr));
        // }
        rotateArr(arr, k);
        printArray(arr);
        sc.close();
    }
}
