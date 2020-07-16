package com.liang.y.daniel.chapter.two;

/* Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance. The
formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note you can use Math. pow(a, 0.5) to compute
sqrt(a). */

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        System.out.print("Enter values for x\u00B9 and y\u00B9: ");
        Scanner in = new Scanner(System.in);
        double initialX = in.nextDouble();
        double initialY = in.nextDouble();
        System.out.print("Enter values for x\u00B2 and y\u00B2: ");
        double finalX = in.nextDouble();
        double finalY = in.nextDouble();
        double computedDistance = Math.pow(Math.pow((finalX - initialX), 2) + Math.pow((finalY - initialY), 2), 0.5);
        System.out.println("The distance between those points is: " + computedDistance);
    }
}
