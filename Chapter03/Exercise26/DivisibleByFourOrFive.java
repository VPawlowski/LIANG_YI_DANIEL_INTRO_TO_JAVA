package com.liang.y.daniel.chapter.three;

/* (Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines whether it
is divisible by 4 and 5, whether it is divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both. */

import java.util.Scanner;

public class DivisibleByFourOrFive {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        System.out.print("Is " + userInput + " divisible by 4 and 5? ");
        System.out.println(userInput % 4 == 0 && userInput % 5 == 0);
        System.out.print("Is " + userInput + " divisible by 4 or 5? ");
        System.out.println(userInput % 4 == 0 || userInput % 5 == 0);
        System.out.print("Is " + userInput + " divisible by 4 or 5, but not both? ");
        System.out.print(userInput % 4 == 0 ^ userInput % 5 == 0);
    }
}
