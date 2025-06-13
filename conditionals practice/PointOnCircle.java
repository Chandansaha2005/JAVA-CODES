/* Given the coordinates (x,y) of the center of a circle and it's radius,
Write a program, which will determine whether a point lies inside the circle,
on the circle or outside the circle.*/

import java.util.Scanner;

public class PointOnCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates for center of circle = ");
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();

        System.out.print("Enter the Radius = ");
        int r = sc.nextInt();
        System.out.println("Enter the coordinates for Arbitrary Point  = ");
        System.out.print("X1 = ");
        int x1 = sc.nextInt();
        System.out.print("Y1 = ");
        int y1 = sc.nextInt();

        int oa = ((x - x1) * (x - x1)) + ((y - y1) * (y - y1));

        if (oa > (r * r)) {
            System.out.println("The Arbitrary point is Outside of the Circle");
        } else if (oa < (r * r)) {
            System.out.println("The Arbitrary point is Inside of the Circle");
        } else {
            System.out.println("The Arbitrary point is on the Circle");
        }

    }
}
