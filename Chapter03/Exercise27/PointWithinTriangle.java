package com.liang.y.daniel.chapter.three;

/* Suppose a right triangle is placed in a plane as shown below. The right-angle point is placed at (0, 0), and the
other two points are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter a point with x and
y-coordinates and determines whether the point is inside the triangle. */

import java.util.Scanner;

public class PointWithinTriangle {
    public static void main (String[] args) {
        System.out.print("Enter X-Coordinate: ");
        Scanner in = new Scanner(System.in);
        double xCoordinate = in.nextDouble();
        System.out.print("Enter Y-Coordinate: ");
        double yCoordinate = in.nextDouble();
        final int TRIANGLE_HEIGHT = 100;
        final int TRIANGLE_WIDTH = 200;
        boolean withinTriangle = (xCoordinate <= TRIANGLE_WIDTH && xCoordinate >= 0 && yCoordinate <= TRIANGLE_HEIGHT && yCoordinate >= 0
                && xCoordinate + yCoordinate * 2 <= TRIANGLE_WIDTH);
        System.out.println("The point is " + ((withinTriangle) ? "within" : "outside") + " the triangle.");
    }
}
