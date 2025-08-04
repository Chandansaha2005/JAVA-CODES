import java.util.Scanner;

public class PasswordStrength {

    static void Length(String x) {
        if (x.length() <= 4) {
            System.out.println("The Password is very short");
        } else if (x.length() <= 7) {
            System.out.println("The Password is short");
        } else if (x.length() <= 11) {
            System.out.println("The Password is mid-length");
        }
    }

    public static void issueChecker(String x, boolean Cap, boolean Sml, boolean Num, boolean SC) {
        System.out.println("Issues : ");
        if (!Cap || !Sml || !Num || !SC) {
            Length(x);
            if (!Cap) {
                System.out.println("No Upper Case.");
            }
            if (!Sml) {
                System.out.println("No Lower Case.");
            }
            if (!Num) {
                System.out.println("No Digit.");
            }
            if (!SC) {
                System.out.println("No Special Character.");
            }
        } else {
            System.out.print("Nothing");
        }
    }

    public static void checkStrength(String x) {
        boolean hasCapital = false, hasSmall = false, hasNumber = false, hasSpecial = false;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isLowerCase(c)) {
                hasSmall = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else {
                hasSpecial = true;
            }
        }

        int strength = (hasCapital ? 1 : 0) + (hasSmall ? 1 : 0) + (hasNumber ? 1 : 0) + (hasSpecial ? 1 : 0);

        System.out.print("Feedback : The password is ");
        if (x.length() <= 4 || strength <= 1) {
            System.out.println("VERY WEAK.");
        } else if (x.length() <= 7 || strength == 2) {
            System.out.println("WEAK.");
        } else if (x.length() <= 11 || strength == 3) {
            System.out.println("MODERATE.");
        } else if (x.length() <= 15 || strength == 3) {
            System.out.println("STRONG");
        } else {
            System.out.println("VERY STRONG");
        }

        issueChecker(x, hasCapital, hasSmall, hasNumber, hasSpecial);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Password : ");
            String x = sc.nextLine();

            checkStrength(x);
        }
    }
}
