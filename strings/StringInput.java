import java.util.*;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a word = ");
        // String str = sc.next(); // this will take only a word or character till spece
        // System.out.println(str);
        System.out.print("Enter a Line = ");
        String str1 = sc.nextLine(); // this will take only a whole line or character till Enter
        System.out.println(str1);
        sc.close();
    }

}
