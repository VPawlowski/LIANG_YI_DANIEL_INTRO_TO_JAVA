package com.liang.y.daniel.chapter.two;

import java.util.Scanner;

/* (Convert mile to kilometer) Write a program that reads a mile in a double value
from the console, converts it to kilometers, and displays the result. The formula
for the conversion is as follows:
1 mile = 1.6 kilometers */

public class MileConvertor {
    public static void main(String[] args) {
        final double MILE_TO_KILOMETER_RATIO = 1.6;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of miles to be converted: ");
        double givenInput = in.nextDouble();
        double convertedNumber = givenInput * MILE_TO_KILOMETER_RATIO;
        System.out.println(givenInput + " miles, is " + convertedNumber + " kilometers.");
    }
}
