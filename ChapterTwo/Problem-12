package com.liang.y.daniel.chapter.two;

/* Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for
an airplane to take off using the following formula:

    length = v^2 / (2a)

Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared,
then, displays the minimum runway length. */

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        System.out.print("Enter the required velocity for the airplane to takeoff: ");
        Scanner in = new Scanner(System.in);
        double requiredVelocity = in.nextDouble();
        System.out.print("Enter the acceleration of the airplane: ");
        double acceleration = in.nextDouble();
        double requiredRunwayLength = requiredVelocity * requiredVelocity / (2 * acceleration);
        System.out.println("The minimum runway length is: " + requiredRunwayLength + " meters.");
    }
}
