package com.liang.y.daniel.chapter.three;

/* An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is
a checksum, which is calculated from the other 9 digits using the following formula:

    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention. Write a program that prompts
the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. */

import java.util.Scanner;

public class CheckIsbn {
    public static void main(String[] args) {
        System.out.print("Enter the 9-Digit of an ISBN-serial: ");
        Scanner in = new Scanner(System.in);
        int serialNumber = in.nextInt();
        // Declaring a constant due to reusing same value multiple times; unsure if proper decision
        final int MODIFY_LAST_DIGIT = 10; // % to obtain the last digit, / to remove the last digit
        int ninthNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int eighthNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int seventhNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int sixthNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int fifthNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int fourthNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int thirdNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int secondNumber = serialNumber % MODIFY_LAST_DIGIT;
        serialNumber /= MODIFY_LAST_DIGIT;
        int firstNumber = serialNumber % MODIFY_LAST_DIGIT;
        // ISBN-10 checksum formula; no reason to multiply the first number by 1 (x * 1 is just x after all)
        int checkSumValue = (firstNumber + secondNumber * 2 + thirdNumber * 3 + fourthNumber * 4 + fifthNumber * 5
                + sixthNumber * 6 + seventhNumber * 7 + eighthNumber * 8 + ninthNumber * 9) % 11;
        System.out.print("The ISBN-10 number is: ");
        // Would ordinarily copy from serialNumber into new variable; however, leading zeroes get removed if done as such
        System.out.print("" + firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninthNumber);
        System.out.println((checkSumValue == 10) ? "X" : checkSumValue );
    }
}
