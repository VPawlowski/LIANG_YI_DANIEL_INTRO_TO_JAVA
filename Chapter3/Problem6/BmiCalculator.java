package com.liang.y.daniel.chapter.three;

/* Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches. For example, if a
person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.  */

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.print("Enter weight in lbs: ");
        Scanner in = new Scanner(System.in);
        double givenWeight = in.nextDouble();
        System.out.print("Enter feet-portion of height: ");
        int givenFeet = in.nextInt();
        System.out.print("Enter inch-portion of height: ");
        int givenInches = in.nextInt();
        final double KILOGRAMS_PER_POUND = 0.453_592_370;
        double weightInKilograms = givenWeight * KILOGRAMS_PER_POUND;
        final double METERS_PER_INCH = 0.025_400;
        // 12 inches in a foot; converting userInput into inches
        double heightInMeters = ((givenFeet * 12) + givenInches) * METERS_PER_INCH;
        double userBmi = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.println("BMI is: " + userBmi);
        // Creating constants for BMI classifications for easier editing when required
        final double UNDERWEIGHT_BMI = 18.5; // If less than
        final double NORMAL_BMI = 25.0; // If less than
        final double OVERWEIGHT_BMI = 30.0; // If less than, obese if more than or equal
        if (userBmi < UNDERWEIGHT_BMI) {
            System.out.println("With a BMI of under " + UNDERWEIGHT_BMI + ", classified as underweight.");
        } else if (userBmi < NORMAL_BMI) {
            System.out.println("With a BMI of under " + NORMAL_BMI + ", classified as normal weight.");
        } else if (userBmi < OVERWEIGHT_BMI) {
            System.out.println("With a BMI of under " + OVERWEIGHT_BMI + ", classified as overweight.");
        } else {
            System.out.println("With a BMI of greater than or equal to " + OVERWEIGHT_BMI + ", classified as obese.");
        }
    }
}
