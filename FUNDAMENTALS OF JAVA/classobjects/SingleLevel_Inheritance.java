
// Single Level Inheritance Example: Palindrome and Spy Number Check
import java.util.Scanner;

// Parent class with core input and reverse logic
class A {
    int n, rev = 0, x;

    // Method to take input from the user
    public void input() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = ob.nextInt();
        ob.close();
    }

    // Method to reverse the digits of the input number
    public void reverse() {
        for (x = n; n > 0; n = n / 10) {
            rev = rev * 10 + n % 10;
        }
        // After this loop, 'rev' holds the reversed number
        // 'x' retains the original number for further checks
    }
}

// Child class that inherits from class A
class SingleLevel_Inheritance extends A {
    int s = 0, p = 1; // s: sum of digits, p: product of digits

    // Method to check if the number is a palindrome
    public void check() {
        if (rev == x)
            System.out.println(x + " is a Palindrome Number.");
        else
            System.out.println(x + " is NOT a Palindrome Number.");
    }

    // Method to check if the number is a Spy Number
    public void spy() {
        // A Spy number has sum of digits equal to the product of digits
        for (n = x; n > 0; n = n / 10) {
            s = s + n % 10;
            p = p * (n % 10);
        }
        if (s == p)
            System.out.println(x + " is a Spy Number.");
        else
            System.out.println(x + " is NOT a Spy Number.");
    }

    // Main method to execute the logic
    public static void main(String[] args) {
        SingleLevel_Inheritance ob = new SingleLevel_Inheritance();
        ob.input(); // Get user input
        ob.reverse(); // Reverse the number
        ob.check(); // Check if it's a palindrome
        ob.spy(); // Check if it's a spy number
    }
}
