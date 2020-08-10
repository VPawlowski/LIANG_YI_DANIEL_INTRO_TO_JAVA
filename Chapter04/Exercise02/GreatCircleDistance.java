package com.liang.y.daniel.chapter.four;

/* The great circle distance is the distance between two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be
the geographical latitude and longitude of two points. The great circle distance between the two points can be computed
using the following formula:

    d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and
displays its great circle distance. The average radius of the earth is 6,371.01 km. Note you need to convert the degrees
into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and
longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees. */

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        // Promp user for input
        System.out.print("Enter the latitude and longitude of Point 1 (in degrees): ");
        Scanner in = new Scanner(System.in);
        // Convert latitude and longitude degrees into radians for both sets
        double x1 = Math.toRadians(in.nextDouble());
        double y1 = Math.toRadians(in.nextDouble());
        System.out.print("Enter the latitude and longitude of Point 2 (in degrees): ");
        double x2 = Math.toRadians(in.nextDouble());
        double y2 = Math.toRadians(in.nextDouble());
        final double AVERAGE_EARTH_RADIUS = 6_371.01;
        // Calculate the great circle distance according to formula
        double greatCircleDistance = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
                * Math.cos(x2) * Math.cos(y1 - y2));
        // Output answer
        System.out.println("The distance between the two points is: " + greatCircleDistance);
    }
}
