package com.liang.y.daniel.chapter.two;

/* Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer whose last two digits represent the cents. For example, the input 1156
represents 11 dollars and 56 cents. */

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of your amount in cents (11.32 as 1132): ");
        int amount = in.nextInt();
        System.out.println("Your amount $" + amount + " consists of: ");
        int numberOfDollars = amount / 100;
        System.out.println(numberOfDollars + " dollars");
        amount %= 100;
        int numberOfQuarters = amount / 25;
        System.out.println(numberOfQuarters + " quarters");
        amount %= 25;
        int numberOfDimes = amount / 10;
        System.out.println(numberOfDimes + " dimes");
        amount %= 10;
        int numberOfNickels = amount / 5;
        System.out.println(numberOfNickels + " nickels");
        amount %= 5;
        int numberOfPennies = amount;
        System.out.println(numberOfPennies + " pennies");
    }
}
