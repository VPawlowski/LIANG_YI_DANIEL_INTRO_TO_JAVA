package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1,
 . . . , and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display
the future day of the week. */

import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        System.out.print("Enter today's date in numeric form (Sunday as 0, Monday as 1, etc): ");
        Scanner in = new Scanner(System.in);
        int currentDay = in.nextInt();
        System.out.print("Enter the number of days to skip: ");
        int numberOfSkippedDays = in.nextInt();
        System.out.print("Today is ");
        switch (currentDay) {
            case 0:
                System.out.print("Sunday ");
                break;
            case 1:
                System.out.print("Monday ");
                break;
            case 2:
                System.out.print("Tuesday ");
                break;
            case 3:
                System.out.print("Wednesday ");
                break;
            case 4:
                System.out.print("Thursday ");
                break;
            case 5:
                System.out.print("Friday ");
                break;
            case 6:
                System.out.print("Saturday ");
                break;
            // If user enters a number outside of question paramter - program returns an error message and exits
            default:
                System.out.print("...\nERROR: Please use a number between 0 - 6");
                System.exit(1);
                break;
        }
        System.out.print("and the future date is ");
        int futureDay = (numberOfSkippedDays + currentDay) % 7;
        // Probably a better way to do this than to repeat first process
        switch (futureDay) {
            case 0:
                System.out.print("Sunday.");
                break;
            case 1:
                System.out.print("Monday.");
                break;
            case 2:
                System.out.print("Tuesday.");
                break;
            case 3:
                System.out.print("Wednesday.");
                break;
            case 4:
                System.out.print("Thursday.");
                break;
            case 5:
                System.out.print("Friday.");
                break;
            case 6:
                System.out.print("Saturday.");
                break;
            default:
                break;
        }
    }
}
