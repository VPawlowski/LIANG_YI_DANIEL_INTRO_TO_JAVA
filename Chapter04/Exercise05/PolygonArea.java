package com.liang.y.daniel.chapter.four;

/* A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
(i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is:

    Area = n * s^2 / (4 * tan(PI / n))

Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their length of
a regular polygon and displays its area. */

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        System.out.print("Enter number of sides: ");
        Scanner in = new Scanner(System.in);
        int numberOfSides = in.nextInt();
        System.out.print("Enter the length of the side: ");
        double lengthOfSide = in.nextDouble();
        double polygonArea = numberOfSides * Math.pow(lengthOfSide, 2) / (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println("The area of the polygon is: " + polygonArea);
    }
}
