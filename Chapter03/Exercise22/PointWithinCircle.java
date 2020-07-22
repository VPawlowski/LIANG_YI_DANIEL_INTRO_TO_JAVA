package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the circle
centered at (0, 0) with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown
in Figure 3.7a.

(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. The formula for computing the
distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Test your program to cover all cases.)  */

import java.util.Scanner;

public class PointWithinCircle {
    public static void main(String[] args) {
        System.out.print("Enter the X-coordinate: ");
        Scanner in = new Scanner(System.in);
        double xCoordinate = in.nextDouble();
        System.out.print("Enter the Y-coordinate: ");
        double yCoordinate = in.nextDouble();
        double CIRCLE_RADIUS = 10;
        double distanceFromOrigin = Math.pow((Math.pow(xCoordinate - 0, 2) + Math.pow(yCoordinate - 0, 2)), 0.5);
        if (distanceFromOrigin <= CIRCLE_RADIUS) {
            System.out.println("Point (" + xCoordinate + ", " + yCoordinate + ") is within the circle.");
        } else {
            System.out.println("Point (" + xCoordinate + ", " + yCoordinate + ") is not within the circle.");
        }
    }
}
