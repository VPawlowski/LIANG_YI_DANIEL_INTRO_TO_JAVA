package com.liang.y.daniel.chapter.two;

/* Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kilograms and the initial and final
temperatures of the water. The formula to compute the energy is:

    Q = M * (finalTemperature – initialTemperature) * 4184

where M is the weight of water in kilograms, initial and final temperatures are in degrees Celsius, and energy Q is
measured in joules. */

import java.util.Scanner;

public class EnergyRequired {
    public static void main(String[] args) {
        System.out.print("Enter the weight of the water in kilograms: ");
        Scanner in = new Scanner(System.in);
        double waterWeight = in.nextDouble();
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = in.nextDouble();
        System.out.print("Enter the final temperature of the water in Celsius: ");
        double endingTemperature = in.nextDouble();
        final int WATER_HEAT_CAPACITY_PER_KILOGRAM = 4184;
        double requiredEnergy = waterWeight * (endingTemperature - initialTemperature) * WATER_HEAT_CAPACITY_PER_KILOGRAM;
        // Unicode represents degrees Celsius
        System.out.println("The energy required to boil " + waterWeight + "kg of water from an initial temperature of "
            + initialTemperature + "\u2103 to " + endingTemperature + "\u2103 is: " + requiredEnergy + " Joules of energy.");
    }
}
