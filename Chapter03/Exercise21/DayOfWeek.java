package com.liang.y.daniel.chapter.three;

/* Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is:

    h = (q + (26(m + 1) / 10) + k + (k / 4) + (j / 4) + 5j) % 7

Where h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
q is the day of the month.
m is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the
previous year.
j is (year / 100)
k is the year of the century (i.e., year % 100).

Note all divisions in this exercise perform an integer division. Write a program that
prompts the user to enter a year, month, and day of the month.

(Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and
2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for
year, m will be 13 and year will be 2014 used in the formula.) */

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner in = new Scanner(System.in);
        int givenYear = in.nextInt();
        System.out.print("Enter month (1-12): ");
        int givenMonth = in.nextInt();
        System.out.print("Enter day of month (1-31): ");
        int givenDay = in.nextInt();
        if (givenMonth == 1 || givenMonth == 2) {
            givenMonth = (givenMonth == 1) ? 13 : 14;
            givenYear--;
        }
        int dayOfWeek = (givenDay + (26 * (givenMonth + 1)) / 10 + (givenYear % 100) + (givenYear % 100) / 4
                + (givenYear / 100) / 4 + 5 * (givenYear / 100)) % 7;
        System.out.print("Day of the week is: ");
        switch (dayOfWeek) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
    }
}
