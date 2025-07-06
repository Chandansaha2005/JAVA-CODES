import java.util.Arrays;
import java.util.Scanner;

public class Array_AllZeroToLast {

    static int[] pushZerosToEnd(int[] arr) {
        Arrays.sort(arr);//0 0 1 2 3 
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            ans[j++] = arr[i];
        }//3 2 1 0 0
        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i+1; j < ans.length; j++) {
                if (ans[i] == 0 || ans[j] == 0)
                    break;
                if (ans[i] > ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }// 1 2 3 0 0
        return ans;
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
        System.out.print("Enter the Elements (0 or 1)= ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        printArray(pushZerosToEnd(arr));
        sc.close();
    }

}