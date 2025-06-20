// Import the Scanner class from the java.util package for user input
import java.util.*;

public class StringInput {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a line of text
        System.out.print("Enter a Line = ");
        
        // Read the entire line of input until the user hits Enter
        String str1 = sc.nextLine();
        
        // Display the entered line
        System.out.println(str1);
        
        // Close the Scanner to free system resources
        sc.close();
    }
}
