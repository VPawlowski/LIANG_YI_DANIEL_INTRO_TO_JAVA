package com.liang.y.daniel.chapter.two;

/* Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and display the population
after the number of years. Use the hint in Programming Exercise 11 of Chapter 1 for this program. */

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        final int INITIAL_POPULATION = 312_032_486;
        final int DAYS_IN_YEAR = 365;
        final int HOURS_IN_DAY = 24;
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;
        // measured in seconds
        final int BIRTH_EVERY_X_TIME = 7;
        final int DEATH_EVERY_X_TIME = 13;
        final int IMMIGRANT_ARRIVES_EVERY_X_TIME = 45;
        System.out.print("Enter the number of years to simulate population growth: ");
        Scanner in = new Scanner(System.in);
        int numberOfYears = in.nextInt();
        int totalTimeInSeconds = numberOfYears * DAYS_IN_YEAR * HOURS_IN_DAY * MINUTES_IN_HOUR + SECONDS_IN_MINUTE;
        int totalBirths = totalTimeInSeconds / BIRTH_EVERY_X_TIME;
        int totalDeaths = totalTimeInSeconds / DEATH_EVERY_X_TIME;
        int totalNewArrivals = totalTimeInSeconds / IMMIGRANT_ARRIVES_EVERY_X_TIME;
        int expectedPopulationTotal = INITIAL_POPULATION + totalBirths + totalNewArrivals - totalDeaths;
        // The example output given by the author of the textbook does not match the indentical input. 
        // Might be an error due to changing problem parameters between editions.
        System.out.println("The population after " + numberOfYears + " years, will be approximately: "
                + expectedPopulationTotal);
    }
}
