package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter the center coordinates and radii of two circles and determines whether
the second circle is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is inside
circle1 if the distance between the two centers <= r1 - r2 and circle2 overlaps circle1 if the distance between the two
centers <= r1 + r2.) */

import java.util.Scanner;

public class OverlappingCircles {
    public static void main(String[] args) {
        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        Scanner in = new Scanner(System.in);
        double firstCenterX = in.nextDouble();
        double firstCenterY = in.nextDouble();
        double firstRadius = in.nextDouble();
        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double secondCenterX = in.nextDouble();
        double secondCenterY = in.nextDouble();
        double secondRadius = in.nextDouble();
        double distanceBetweenPoints = Math.pow(Math.pow(secondCenterX - firstCenterX, 2)
                + Math.pow(secondCenterY - firstCenterY, 2), 0.5);
        if (distanceBetweenPoints <= firstRadius - secondRadius) {
            System.out.println("circle2 is inside circle1.");
        } else if (distanceBetweenPoints <= firstRadius + secondRadius) {
            System.out.println("circle2 overlaps circle1.");
        } else {
            System.out.println("circle2 is outside of circle1.");
        }
    }
}
