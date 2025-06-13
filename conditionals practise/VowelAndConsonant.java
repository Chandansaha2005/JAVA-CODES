import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character = ");
        char a = sc.next().charAt(0);
        switch (a) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;
        }
    }
}
