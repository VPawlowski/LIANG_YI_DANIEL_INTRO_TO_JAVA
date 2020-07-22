package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle
centred at (1, 1) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the
rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less
than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.) */

import java.util.Scanner;

public class PointWithinRectangle {
    public static void main(String[] args) {
        System.out.print("Enter the X-Coordinate: ");
        Scanner in = new Scanner(System.in);
        double xCoordinate = in.nextDouble();
        System.out.print("Enter the Y-Coordinate: ");
        double yCoordinate = in.nextDouble();
        final double RECTANGLE_HEIGHT = 5;
        final double RECTANGLE_WIDTH = 10;
        boolean isValidRectangle = xCoordinate <= RECTANGLE_WIDTH / 2 && yCoordinate <= RECTANGLE_HEIGHT / 2;
        System.out.println("The point (" + xCoordinate + ", " + yCoordinate + ") is "
                + ((isValidRectangle) ? "in " : "out of ") + "the rectangle.");
    }
}
