package com.liang.y.daniel.chapter.two;

import java.util.Scanner;

/* (Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following
formulas:
area = (sqrt(3) / 4) * (length of sides)^2
volume = area * length */

public class TriangleVolume {
    public static void main(String[] args) {
        System.out.print("Enter the length of a side of an equilateral triangle: ");
        Scanner in = new Scanner(System.in);
        double triangleSide = in.nextDouble();
        double area = (Math.sqrt(3) / 4.0) * Math.pow(triangleSide, 2);
        double volume = area * triangleSide;
        System.out.println("The area of the triangle is: " + area);
        System.out.println("The volume of the triangle is: " + volume);
    }
}
