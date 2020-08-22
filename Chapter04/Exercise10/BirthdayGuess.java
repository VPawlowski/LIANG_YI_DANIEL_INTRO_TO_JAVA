package com.liang.y.daniel.chapter.four;

/* Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to enter the character Y for Yes and N for No, rather
than entering 1 for Yes and 0 for No. */

import java.util.Scanner;

public class BirthdayGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Is your birthday within the first set?\n");
        String firstSet = " 1 3 5 7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";
        System.out.print(firstSet);
        System.out.print("\nEnter N for No, and Y for Yes: ");
        char userAnswer = in.next().charAt(0);
        int day = 0;
        if (userAnswer == 'Y' || userAnswer == 'y') {
            day += 1;
        }
        System.out.print("Is your birthday within the second set?\n");
        String secondSet = " 2 3 6 7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";
        System.out.print(secondSet);
        System.out.print("\nEnter N for No, and Y for Yes: ");
        userAnswer = in.next().charAt(0);
        if (userAnswer == 'Y' || userAnswer == 'y') {
            day += 2;
        }
        System.out.print("Is your birthday within the third set?\n");
        String thirdSet = " 4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";
        System.out.print(thirdSet);
        System.out.print("\nEnter N for No, and Y for Yes: ");
        userAnswer = in.next().charAt(0);
        if (userAnswer == 'Y' || userAnswer == 'y') {
            day += 4;
        }
        System.out.print("Is your birthday within the fourth set?\n");
        String fourthSet = " 8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";
        System.out.print(fourthSet);
        System.out.print("\nEnter N for No, and Y for Yes: ");
        userAnswer = in.next().charAt(0);
        if (userAnswer == 'Y' || userAnswer == 'y') {
            day += 8;
        }
        System.out.print("Is your birthday within the fifth set?\n");
        String fifthSet = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";
        System.out.print(fifthSet);
        System.out.print("\nEnter N for No, and Y for Yes: ");
        userAnswer = in.next().charAt(0);
        if (userAnswer == 'Y' || userAnswer == 'y') {
            day += 16;
        }
        System.out.println("\nYour birthday is on: " + day);
    }
}
