package com.liang.y.daniel.chapter.three;

/* Given a directed line from point p0(x0, y0) to p1(x1, y1), you can use the following condition to decide whether a
point p2(x2, y2) is on the left of the line, on the right, or on the same line (see Figure 3.11):

    (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)

        > 0: p2 is on the left side of the line
        = 0: p2 is on the same line
        < 0: p2 is on the right side of the line

Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays whether p2 is on the
left of the line from p0 to p1, to the right, or on the same line. */

import java.util.Scanner;

public class PointPosition {
    public static void main(String[] args) {
        System.out.print("Enter point A's coordinates (x, y): ");
        Scanner in = new Scanner(System.in);
        double aX = in.nextDouble();
        double aY = in.nextDouble();
        System.out.print("Enter point B's coordinates (x, y): ");
        double bX = in.nextDouble();
        double bY = in.nextDouble();
        System.out.print("Enter point C's coordinates (x, y): ");
        double cX = in.nextDouble();
        double cY = in.nextDouble();
        double pointComparisonFormula = (bX - aX) * (cY - aY) - (cX - aX) * (bY - aY);
        if (pointComparisonFormula > 0) {
            System.out.println("Point C is on the left side of the line.");
        } else if (pointComparisonFormula < 0) {
            System.out.println("Point C is on the right side of the line.");
        } else {
            System.out.println("Point C is on the line.");
        }
    }
}
