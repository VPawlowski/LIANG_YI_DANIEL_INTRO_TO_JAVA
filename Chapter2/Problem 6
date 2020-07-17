package com.liang.y.daniel.chapter.two;

import java.util.Scanner;

/* (Multiply the digits in an integer) Write a program that reads an integer between
0 and 1000 and multiplies all the digits in the integer. For example, if an integer
is 932, the multiplication of all its digits is 54.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. */

public class DigitMultiplier {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner in = new Scanner(System.in);
        int originalInput = in.nextInt();
        int givenInput = originalInput;
        int onesPlace = givenInput % 10;
        givenInput /= 10;
        int tensPlace = givenInput % 10;
        givenInput /= 10;
        int hundredsPlace = givenInput % 10;
        int multiplicationTotal = onesPlace * tensPlace * hundredsPlace;
        System.out.println("The multiplication of all digits in " + originalInput + " is " + multiplicationTotal);
    }
}
