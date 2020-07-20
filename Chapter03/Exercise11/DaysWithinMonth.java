package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days. If the
user entered month 3 and year 2015, the program should display that March 2015 has 31 days. */

import java.util.Scanner;

public class DaysWithinMonth {
    public static void main(String[] args) {
        System.out.print("Enter any month as an integer (1-12): ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        System.out.print("Enter any given year: ");
        int year = in.nextInt();
        int numberOfDays = 0;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numberOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;
            case 2:
                // If a leap year, February has 29 days; 28 otherwise
                numberOfDays = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
                break;
            default:
                break;
        }
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("ERROR: INVALID INPUT; EXPECTED INTEGER 1-12!");
                System.exit(1);
                break;
        }
        System.out.println(" " + year + " has " + numberOfDays + " days.");
    }
}
