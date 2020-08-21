package com.liang.y.daniel.chapter.four;

/* Write a program that generates three random points on a circle centered at (0, 0) with radius 40 and displays three
angles in a triangle formed by these three points, as shown in Figure 4.4a. (Hint: Generate a random angle a in radians
between 0 and 2π, as shown in Figure 4.4b and the point determined by this angle is (r * x(cos a), r * x(sin a)). */

public class RandomPointCircle {
    public static void main(String[] args) {
        // Generate the three angles for the triangle between 0 and 2PI
        double firstAngle = Math.random() * (2 * Math.PI);
        double secondAngle = Math.random() * (2 * Math.PI);
        double thirdAngle = Math.random() * (2 * Math.PI);
        // Form the X, Y coordinates for each angle
        final int RADIUS = 40;
        double x1 = RADIUS * Math.cos(firstAngle);
        double y1 = RADIUS * Math.sin(firstAngle);
        double x2 = RADIUS * Math.cos(secondAngle);
        double y2 = RADIUS * Math.sin(secondAngle);
        double x3 = RADIUS * Math.cos(thirdAngle);
        double y3 = RADIUS * Math.sin(thirdAngle);
        // Determining sides
        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        // Converting angles into degrees
        firstAngle = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        secondAngle = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        thirdAngle = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));
        // Outputting angles to user
        System.out.printf("First angle: %.2f\n", firstAngle);
        System.out.printf("Second angle: %.2f\n", secondAngle);
        System.out.printf("Third angle: %.2f\n", thirdAngle);
    }
}
