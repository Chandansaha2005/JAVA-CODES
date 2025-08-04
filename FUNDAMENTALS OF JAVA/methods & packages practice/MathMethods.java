// In Java, most math functions in the Math class return values of type double by default

public class MathMethods {
    public static void main(String[] args) {
        // Returns the smaller of two values
        System.out.println(Math.min(5, 6)); // Output: 5

        // Returns the larger of two values
        System.out.println(Math.max(4, 8)); // Output: 8

        // Returns the absolute value (positive magnitude)
        System.out.println(Math.abs(-6)); // Output: 6

        // Returns the square root of the number (result is double)
        System.out.println(Math.sqrt(8)); // Output: 2.8284271247461903

        // Returns the value of the first argument raised to the power of the second (result is double)
        System.out.println(Math.pow(2, 5)); // Output: 32.0

        // Rounds the value up to the nearest integer (as double)
        System.out.println(Math.ceil(4.5)); // Output: 5.0

        // Rounds the value down to the nearest integer (as double)
        System.out.println(Math.floor(4.5)); // Output: 4.0
    }
}
