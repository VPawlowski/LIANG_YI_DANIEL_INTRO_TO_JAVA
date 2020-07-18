package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome
integer. An integer is palindrome if it reads the same from right to left and from left to right. A negative integer is
treated the same as a positive integer. */

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a three-digit integer: ");
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        System.out.print(userNumber);
        int thirdDigit = userNumber % 10;
        // No need to store second digit as 3-digit palindrome is only satisfied when 1st and 3rd digit are equal
        int firstDigit = (userNumber / 100);
        System.out.println((firstDigit == thirdDigit) ?  " is a palindrome." : " is not a palindrome");
    }
}
