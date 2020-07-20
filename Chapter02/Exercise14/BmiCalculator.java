package com.liang.y.daniel.chapter.two;

/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and
dividing, by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and
height in inches and displays the BMI. Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. */

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner in = new Scanner(System.in);
        double weightInPounds = in.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = in.nextDouble();
        final double POUNDS_TO_KILOGRAMS_RATIO = 0.453_592_370;
        double convertedWeight = weightInPounds * POUNDS_TO_KILOGRAMS_RATIO;
        final double INCHES_TO_METERS_RATIO = 0.025_400;
        double convertedHeight = heightInInches * INCHES_TO_METERS_RATIO;
        double BmiCalculation = convertedWeight / (convertedHeight * convertedHeight);
        System.out.println("BMI is: " + BmiCalculation);
    }
}
