import java.util.Scanner;
public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:- ");
        String name=sc.nextLine();                  // To take a whole line as input 
        System.out.println("Your name is "+ name );
        System.out.print("Enter your lucky no. = ");
        int num = sc.nextInt();                     // To take an integer as input 
        System.out.println("Entered lucky no. is = "+num);
        System.out.print("Enter your city:- ");
        String city=sc.next();                      // To take a word/string as input 
        System.out.println("Your name is "+ name+"\nYour city is "+city+"\nYour lucky number is "+num );
        sc.close();
    }
}
