package com.liang.y.daniel.chapter.two;

/* Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as given by the following formula:

a = (v1 - v0) / t

Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
then displays the average acceleration. */

import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        System.out.print("Enter the initial velocity in m/s: ");
        Scanner in = new Scanner(System.in);
        double initialVelocity = in.nextDouble();
        System.out.print("Enter the maximum velocity in m/s: ");
        double maximumVelocity = in.nextDouble();
        System.out.print("Enter the time span in seconds: ");
        double numberOfSeconds = in.nextDouble();
        double averageAcceleration = (initialVelocity - maximumVelocity) / numberOfSeconds;
        // Unicode represents superscript 2
        System.out.println("The average acceleration is: " + averageAcceleration + " m/s\u00B2");
    }
}
