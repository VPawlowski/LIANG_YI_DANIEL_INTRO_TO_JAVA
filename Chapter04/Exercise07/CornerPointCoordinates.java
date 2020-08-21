package com.liang.y.daniel.chapter.four;

/* Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, as shown in Figure 4.4c. Write a
program that prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of
the five corner points on the pentagon from p1 to p5 in this order. Use console format to display two digits after the
decimal point. */

import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the bounding circle: ");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        // Obtain angle of each pentagon section in radians
        final double SLICE = Math.toRadians(360 / 5.0);
        double angle = SLICE;
        System.out.println("The coordinates of five points on the pentagon are: ");
        // Obtain x, y coordinate of current angle and prints
        double x, y;
        for (int i = 0; i < 5; i++)
        {
            x = radius * Math.sin(angle);
            y = radius * Math.cos(angle);
            System.out.printf("(%.2f, %.2f\n", x, y);
            angle -= SLICE;
        }
    }
}
