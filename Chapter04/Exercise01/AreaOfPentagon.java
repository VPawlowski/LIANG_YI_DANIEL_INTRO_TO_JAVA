package com.liang.y.daniel.chapter.four;

/* Write a program that prompts the user to enter the length from the center of a pentagon to a vertex and computes the
area of the pentagon. The formula for computing the area of a pentagon is:

    Area = (5 * s^2) / 4 * tan(PI / 5)

where s is the length of a side. The side can be computed using the formula:

    s = 2 * r * sin(PI / 5)

where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point.  */

import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {
        System.out.print("Enter the length from the center to a vertex: ");
        Scanner in = new Scanner(System.in);
        double vertexLength = in.nextDouble();
        double sideLength = 2 * vertexLength * Math.sin(Math.PI / 5);
        double areaOfPentagon = 5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is: %.2f", areaOfPentagon);
    }
}
