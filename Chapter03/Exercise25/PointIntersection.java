package com.liang.y.daniel.chapter.three;

/* Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure
3.8a and b. The intersecting point of the two lines can be found by solving the following linear equations:

    (y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
    (y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3

This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). If the equation has no solutions,
the two lines are parallel (see Figure 3.8c). Write a program that prompts the user to enter four points and displays
the intersecting point. */

import java.util.Scanner;

public class PointIntersection {
    public static void main(String[] args) {
        System.out.print("Enter values for x1, y1, x2, y2, x3, y3, x4, y4: ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();
        double valueA = y1 - y2;
        double valueB = -1 * (x1 - x2);
        double valueC = y3 - y4;
        double valueD = -1 * (x3 - x4);
        double valueE = (y1 - y2) * x1 - (x1 - x2) * y1;
        double valueF = (y3 - y4) * x3 - (x3 - x4) * y3;
        if (valueA * valueD - valueB * valueC == 0) {
            System.out.println("The two lines are parallel.");
        } else {
            // These formulas are derived from Cramer's rule
            double valueX = (valueE * valueD - valueB * valueF) / (valueA * valueD - valueB * valueC);
            System.out.print("The intersection point is at (" + valueX);
            double valueY = (valueA * valueF - valueE * valueC) / (valueA * valueD - valueB * valueC);
            System.out.println(", " + valueY + ")");
        }
    }
}
