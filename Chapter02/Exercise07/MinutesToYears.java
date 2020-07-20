package com.liang.y.daniel.chapter.two;

import java.util.Scanner;

/* (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and remaining days for
the minutes. For simplicity, assume that a year has 365 days. */

public class MinutesToYears {
    public static void main(String[] args) {
        final int DAYS_IN_YEAR = 365;
        final int HOURS_IN_DAY = 24;
        final int MINUTES_IN_HOUR = 60;
        System.out.print("Enter the number of minutes to convert to years and days: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        int convertedToDays = userInput / MINUTES_IN_HOUR / HOURS_IN_DAY;
        int totalDays = convertedToDays % DAYS_IN_YEAR;
        int totalYears = convertedToDays / DAYS_IN_YEAR;
        System.out.println(userInput + " minutes is approximately " + totalYears + " years, and " + totalDays + " days.");
    }
}
