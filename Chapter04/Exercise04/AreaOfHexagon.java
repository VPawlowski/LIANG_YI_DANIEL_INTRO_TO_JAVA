package com.liang.y.daniel.chapter.four;

/* The area of a hexagon can be computed using the following formula (s is the length of a side):

    Area = 6 * s^2 / (4 * tan(PI / 6))

Write a program that prompts the user to enter the side of a hexagon and displays its area. */

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        System.out.print("Enter side of hexagon: ");
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double area = 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("Area of hexagon is: %.2f", area);
    }
}
